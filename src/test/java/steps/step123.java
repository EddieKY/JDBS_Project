package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step123 {

    @Given("User is on Cybertektraining page")
    public void user_is_on_Cybertektraining_page() {

        System.out.println("Test");

    }

    @When("User starts add new Teacher\\/Student profile")
    public void user_starts_add_new_Teacher_Student_profile() {

        System.out.println("Test 2");

    }

    @When("User starts to fill Teacher\\/Student information")
    public void user_starts_to_fill_Teacher_Student_information() {


        System.out.println("Test 3");

    }

    @Then("User sees created profile")
    public void user_sees_created_profile() {



    }


}
