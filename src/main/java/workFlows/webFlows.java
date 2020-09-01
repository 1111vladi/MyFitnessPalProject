package workFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

import java.util.List;

public class webFlows extends commonOps {

    @Step("Login MyFitnessPal Flow - Web")
    public static void login(String user, String password) {
        uiActions.click(fitnessPalLoginPage.btn_goToLoginPopup);
        uiActions.updateText(fitnessPalLoginPage.txt_username, user);
        uiActions.updateText(fitnessPalLoginPage.txt_password, password);
        uiActions.click(fitnessPalLoginPage.btn_actualLogin);
        uiActions.click(fitnessPalLoginPage.btn_closePopup);
    }

    @Step("Login MyFitnessPal Flow - Web")
    public static void logout() {
        uiActions.click(fitnessPalHeaderWrap.btn_logout);

    }

    @Step("Login MyFitnessPal flow with DB credentials")
    public static void loginDb() {
        List<String> cred = dbActions.getCredentials("SELECT username, password FROM Credentials WHERE id='3'");
        uiActions.click(fitnessPalLoginPage.btn_goToLoginPopup);
        uiActions.updateText(fitnessPalLoginPage.txt_username, cred.get(0));
        uiActions.updateText(fitnessPalLoginPage.txt_password, cred.get(1));
        uiActions.click(fitnessPalLoginPage.btn_actualLogin);
        uiActions.click(fitnessPalLoginPage.btn_closePopup);
    }

    @Step("Add a Strength Exercise")
    public static void addStrengthExercise(String exerciseName, String numberOfSets, String repetitionsPerSet, String weightPerSet) {
        uiActions.click(fitnessPalMainMenuPage.btn_exerciseMenu);
        uiActions.click(fitnessPalExerciseMenuPage.btn_exerciseDiary);
        uiActions.click(fitnessPalExerciseExerciseDiary.btn_strengthTrainingAddExercise);
        uiActions.updateText(fitnessPalExerciseDiaryAddExercise.input_searchExercise, exerciseName);
        uiActions.click(fitnessPalExerciseDiaryAddExercise.btn_searchExercise);
        uiActions.click(fitnessPalExerciseDiaryAddExercise.txt_deadLift);
        uiActions.updateText(fitnessPalExerciseDiaryAddExercise.input_numbersOfSets, numberOfSets);
        uiActions.updateText(fitnessPalExerciseDiaryAddExercise.input_repetitionsPerSet, repetitionsPerSet);
        uiActions.updateText(fitnessPalExerciseDiaryAddExercise.input_weightPerSet, weightPerSet);
        uiActions.click(fitnessPalExerciseDiaryAddExercise.btn_addExercise);
    }

    public static void deleteLastCardiovascularExercise() {
        uiActions.click(fitnessPalExerciseMenuPage.btn_exerciseDiary);
        uiActions.click(fitnessPalExerciseExerciseDiary.rows_deleteCardiovascularExercise.get(fitnessPalExerciseExerciseDiary.rows_deleteCardiovascularExercise.size() - 1));
    }
    @Step("Delete a Strength Exercise")
    public static void deleteLastStrengthExercise() {
        uiActions.click(fitnessPalExerciseMenuPage.btn_exerciseDiary);
        uiActions.click(fitnessPalExerciseExerciseDiary.rows_deleteStrengthExercise.get(fitnessPalExerciseExerciseDiary.rows_deleteStrengthExercise.size() - 1));
    }

}
