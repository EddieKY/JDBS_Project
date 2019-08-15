package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Config;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class step123 {

    @Given("User is on Cybertektraining page")
    public void user_is_on_Cybertektraining_page() {

        System.out.println("Test");

    }

    @When("User starts add new Teacher\\/Student profile")
    public void user_starts_add_new_Teacher_Student_profile() {

//        System.out.println("Test 2");

        System.out.println();
    }

    @When("User starts to fill Teacher\\/Student information")
    public void user_starts_to_fill_Teacher_Student_information() {


//        System.out.println("Test 3");

    }

    @Then("User sees created profile")
    public void user_sees_created_profile() throws SQLException {

        DBUtility.openConnection(Config.getProperty("dbType"));
       List<Map<String,Object>> justName = DBUtility.executeSQLquery("select FIRST_NAME from teacher");

       for(Map map:justName){
           System.out.println("First name : "+ map.get("FIRST_NAME"));
       }

    }

}
