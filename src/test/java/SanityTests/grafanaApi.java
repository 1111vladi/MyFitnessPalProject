package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import workFlows.apiFlows;

public class grafanaApi extends commonOps {

    @Test(description = "Test01: add team to Grafana")
    @Description("Test Description: Add team to Grafana and verify it")
    public void test01_addTeam(){
        apiFlows.postTeam("VladiTeam", "Vladi@Team.com");
        verifications.text(apiFlows.getTeamProperty("teams[0].name"), "VladiTeam");
    }

    @Test(description = "Test02: Update team to Grafana")
    @Description("Test Description: Update team to Grafana and verify it")
    public void test02_updateTeam(){
        apiFlows.updateTeam("NoyTeam", "Vladi@Team.com", "8");
        verifications.text(apiFlows.getTeamProperty("teams[0].name"), "NoyTeam");
    }

    @Test(description = "Test03: Delete team from Grafana")
    @Description("Test Description: Delete team to Grafana and verify it")
    public void test03_deleteTeam(){
        apiFlows.deleteTeam("8");
        verifications.text(apiFlows.getTeamProperty("totalCount"), "0");
    }
}
