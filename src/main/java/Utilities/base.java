package Utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import org.json.simple.JSONObject;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class base {

    // PlatformName
    public static String platform;

    // Automation Objects
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;

    // Appium
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static AppiumDriver mobileDriver;

    // Image
    public static Screenshot imageScreenshot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;

    // JavascriptExecutor
    public static JavascriptExecutor js;

    // HTTP
    public static RequestSpecification httpRequest;
    public static Response response;

    // JSON
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    // DataBase
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    /** ------------- MyFitnessPal - Web ------------- **/
    // Login
    public static PageObjects.MyFitnessPal.loginPage fitnessPalLoginPage;

    // Header
    public static PageObjects.MyFitnessPal.headerWrap fitnessPalHeaderWrap;

    // Main Menu
    public static PageObjects.MyFitnessPal.mainMenuPage fitnessPalMainMenuPage;

    // My Home Menu
    public static PageObjects.MyFitnessPal.myHomeMenuPage fitnessPalMyHomeMenuPage;

    // Home
    public static PageObjects.MyFitnessPal.homePage fitnessPalHomePage;

    // Exercise Menu
    public static PageObjects.MyFitnessPal.exerciseMenuPage fitnessPalExerciseMenuPage;

    // Exercise Diary
    public static PageObjects.MyFitnessPal.exerciseDiary fitnessPalExerciseExerciseDiary;
    public static PageObjects.MyFitnessPal.exerciseDiaryAddExercise fitnessPalExerciseDiaryAddExercise;


    /** ------------- MyFitnessPal - Mobile ------------- **/
    public static PageObjects.MyFitnessPalMobile.actualLoginPage fitnessPalMobileActualLoginPage;
    public static PageObjects.MyFitnessPalMobile.loginPage fitnessPalMobileLoginPage;
    public static PageObjects.MyFitnessPalMobile.homePage fitnessPalMobileHomePage;
    public static PageObjects.MyFitnessPalMobile.addWaterPage fitnessPalMobileAddWaterPage;
    public static PageObjects.MyFitnessPalMobile.diaryPage fitnessPalMobileDiaryPage;
    public static PageObjects.MyFitnessPalMobile.mePage fitnessPalMobileMePage;
//    public static PageObjects.MyFitnessPalMobile.PremiumAfterLoginPage fitnessPalMobilePremiumAfterLoginPage;

    /** ------------- Electron ------------- **/
    // Electron App
    public static PageObjects.ElectronApiDemos.electronMainPage electronTestPage;


    /** ------------- WinApp ------------- **/
    // WinApp - Calculator
    public static PageObjects.CalculatorWinApp.calculatorMainPage calculatorTest;






}
