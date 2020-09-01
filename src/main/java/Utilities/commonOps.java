package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static Utilities.managePages.initElectronPages;
import static Utilities.managePages.initDesktopPages;

public class commonOps extends base {

    // Get data from an XML file to avoid hardcoded code
    public static String getData(String nodeName) {
        File fxmlFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc = null;
        try {
            fxmlFile = new File("./Configuration/DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fxmlFile);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            System.out.println("Error reading XML file: " + e);
        } finally {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public static void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefox();
        else if (browserType.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException(("Invalid platform name stated"));
        driver.manage().window().maximize();
        driver.get(getData("Url"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }

    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    public static void initMobile() {
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("APP_PACKAGE"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("APP_ACTIVITY"));
        try {
            mobileDriver = new AndroidDriver(new URL(getData("Appium_Server") + "/wd/hub"), dc);
        } catch (Exception e) {
            System.out.println("Can not connect to Appium server, see details " + e);
        }
        managePages.initMobilePages();
        mobileDriver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(mobileDriver, Long.parseLong(getData("TimeOut")));
    }

    public static void initApi() {
        RestAssured.baseURI = getData("url_api");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("username_api"), getData("password_api"));
    }

    public static void initElectron() {
        System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("ElectronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        // Works with Selenium Ver. 3.141.59
        // Ver. 3.5.2 was used before implementing Electron support
        driver = new ChromeDriver(dc);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);

    }

    public static void initDesktop() {
        dc.setCapability("app", getData("Calculator_App_Path"));
        try {
            driver = new WindowsDriver(new URL(getData("Appium_Server")), dc);
        } catch (MalformedURLException e) {
            System.out.println("Can not connect to Appium server, see details " + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);

    }

    @BeforeClass
    @Parameters({"PlatformName"})
    public void startSession(String PlatformName) {
        platform = PlatformName;
        switch (platform){
            case "database":
            case "web":
                initBrowser(getData("BrowserName"));
                managePages.initWebPages();
                manageDB.openDBConnection(getData("dbURL"), getData("dbUser"), getData("dbPass"));
                break;
            case "mobile":
                initMobile();
                break;
            case "api":
                initApi();
                break;
            case "electron":
                initElectron();
                initElectronPages();
                break;
            case "desktop":
                initDesktop();
                initDesktopPages();
                break;
            default:
                throw new RuntimeException(("Invalid platform name stated"));
        }
//        if (platform.equalsIgnoreCase("web") || platform.equalsIgnoreCase("database")) {
//            initBrowser(getData("BrowserName"));
//            manageDB.openDBConnection(getData("dbURL"), getData("dbUser"), getData("dbPass"));
//        }
//        else if (platform.equalsIgnoreCase("mobile"))
//            initMobile();
//        else if (platform.equalsIgnoreCase("api"))
//            initApi();
//        else if (platform.equalsIgnoreCase("electron")) {
//            initElectron();
//            initElectronPages();
//        }
//        else if (platform.equalsIgnoreCase("desktop")) {
//            initDesktop();
//            initDesktopPages();
//        }
//        else
//            throw new RuntimeException(("Invalid platform name stated"));
//        managePages.initWebPages();

//        managePages.initElectronPage();
//        managePages.initMobilePages();
    }


    @AfterMethod
    @Parameters({"PlatformName"})
    public void afterMethod(String PlatformName) {
        if (platform.equalsIgnoreCase("web"))
            driver.get(getData("Url"));
    }

    @AfterClass
    @Parameters({"PlatformName"})
    public void closeSession(String PlatformName) {
        switch (platform){
            case "web":
            case "electron":
                driver.quit();
                break;
            case "mobile":
                mobileDriver.quit();
                break;
            case "database":
                manageDB.closeDBConnection();
                driver.quit();
                break;
            default:
                throw new RuntimeException(("Invalid case name stated"));
        }
//        if (platform.equalsIgnoreCase("web")) {
//            driver.quit();
//        } else if (platform.equalsIgnoreCase("mobile")) {
//            mobileDriver.quit();
//        }
//        if (!platform.equalsIgnoreCase("api")) {
//            driver.quit();
//        }
    }
}
