package Utilities;

import PageObjects.ElectronApiDemos.electronMainPage;
import PageObjects.MyFitnessPalWeb.*;
import PageObjects.MyFitnessPalMobile.actualLoginPage;
import PageObjects.MyFitnessPalMobile.addWaterPage;
import PageObjects.MyFitnessPalMobile.diaryPage;
import PageObjects.MyFitnessPalMobile.mePage;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    // Initiates all the PageObjects
    /** ------------- MyFitnessPal - Web ------------- **/
    public static void initWebPages() {
        // Login
        fitnessPalLoginPage = PageFactory.initElements(driver, loginPage.class);

        // Header
        fitnessPalHeaderWrap = PageFactory.initElements(driver, headerWrap.class);

        // Main Menu
        fitnessPalMainMenuPage = PageFactory.initElements(driver, mainMenuPage.class);

        // Home Page
        fitnessPalHomePage = PageFactory.initElements(driver, homePage.class);

        // My Home
        fitnessPalMyHomeMenuPage = PageFactory.initElements(driver, myHomeMenuPage.class);

        // Exercise Page
        fitnessPalExerciseMenuPage = PageFactory.initElements(driver, exerciseMenuPage.class);

        // Exercise Diary
        fitnessPalExerciseExerciseDiary = PageFactory.initElements(driver, exerciseDiary.class);

        // Exercise Diary Add Exercise
        fitnessPalExerciseDiaryAddExercise = PageFactory.initElements(driver, exerciseDiaryAddExercise.class);
    }

    /** ------------- MyFitnessPal - Mobile ------------- **/
    public static void initMobilePages(){
        fitnessPalMobileLoginPage = new PageObjects.MyFitnessPalMobile.loginPage(mobileDriver);
        fitnessPalMobileActualLoginPage = PageFactory.initElements(mobileDriver, actualLoginPage.class);
        fitnessPalMobileAddWaterPage = PageFactory.initElements(mobileDriver, addWaterPage.class);
        fitnessPalMobileHomePage = PageFactory.initElements(mobileDriver, PageObjects.MyFitnessPalMobile.homePage.class);
        fitnessPalMobilePremiumAfterLoginPage = PageFactory.initElements(driver, PageObjects.MyFitnessPalMobile.premiumAfterLoginPage.class);
        fitnessPalMobileDiaryPage = PageFactory.initElements(mobileDriver, diaryPage.class);
        fitnessPalMobileMePage = PageFactory.initElements(mobileDriver, mePage.class);
    }

    /** ------------- WinApp ------------- **/
    public static void initDesktopPages(){
        // WinApp - Calculator
        calculatorTest = PageFactory.initElements(driver, PageObjects.CalculatorWinApp.calculatorMainPage.class);
    }

    /** ------------- Electron ------------- **/
    public static void initElectronPages(){
        // Electron App
        electronTestPage = PageFactory.initElements(driver, electronMainPage.class);
    }
}
