package SanityTests;

import Extensions.verifications;
import Utilities.listeners;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.commonOps;
import workFlows.webFlows;

@Listeners(listeners.class)
public class myFitnessPalWeb extends commonOps {

    @Test(description = "Test01: Login to MyFitnessPal")
    @Description("Test Description: Login into MyFitnessPal web application")
    public void test01_login(){
        webFlows.login(getData("username_web"), getData("password_web"));
        String username = "member11";
        verifications.textInElement(fitnessPalHeaderWrap.txt_hi, "Hi, " + username);
    }

    @Test(description = "Test02: Verify Added Exercise")
    @Description("Test Description: Add an exercise and verify it exists")
    public void test02_addStrengthExercise(){
        webFlows.addStrengthExercise("Deadlift", "4", "12", "80");
        verifications.numberOfElements(fitnessPalExerciseExerciseDiary.rows_exercises, 1);
    }

    @Test(description = "Test03: Verify Deleted Exercise")
    @Description("Test Description: Delete and verify the strength exercise table is empty")
    public void test03_deleteStrengthExercise(){
        webFlows.deleteLastStrengthExercise();
        verifications.emptyElementsList(fitnessPalExerciseExerciseDiary.rows_deleteStrengthExercise, 0);
    }

//    @Test(description = "Test04: Verify MyFitnessPal Logo")
//    @Description("Test Description: Verify the logo of the website")
//    public void test04_logo(){
//        webFlows.login("member1234@gmail.com", "member1234");
//        verifications.visualElement(fitnessPalHeaderWrap.img_myFitnessPalLogo, "MyFitnessPalLogo_Ver1.00");
//    }
}
