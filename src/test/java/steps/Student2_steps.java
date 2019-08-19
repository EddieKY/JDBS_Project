package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Student2Page;
import utilities.Config;
import utilities.DBUtility;
import utilities.Driver;
import utilities.SelectClass;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student2_steps {
    Student2Page student2 =new Student2Page();
    Faker faker = new Faker();
    String expectedfirstName = faker.name().firstName();
    @Given("Student is on Home Page")
    public void student_is_on_Home_Page() {
        Driver.getDriver().get(Config.getProperty("url"));  // --- opens the website, gets url from config.properties

    }

    @When("Student clicks on Students module and Adds student")
    public void student_clicks_on_Students_module_and_Adds_student() {
        student2.student.click();
        student2.addStudents.click();

    }

    @When("Student fill up details information and click on submit")
    public void student_fill_up_details_information_and_click_on_submit() {
        student2.firstname.sendKeys(expectedfirstName);
        student2.lastname.sendKeys(faker.name().lastName());
        student2.inputEmail.sendKeys(faker.internet().emailAddress());
        student2.joinDate.sendKeys("08/14/2015");
        String passwd = faker.internet().password();
//            sp.inputPasswd.sendKeys(passwd);
//            sp.confirmPasswd.sendKeys(passwd);
        student2.inputSubject.sendKeys("Biology");
        student2.inputMobile.sendKeys("2");
        SelectClass.getSelect(student2.selectGender).selectByVisibleText("Male");
        student2.admission.sendKeys(faker.number().digits(5));
        student2.birthDate.sendKeys("03/24/2012");
        student2.major.sendKeys(faker.job().position());
        SelectClass.getSelect(student2.selectBatch).selectByIndex(1);
        student2.section.sendKeys(faker.number().digits(7));
        student2.address.sendKeys(faker.address().fullAddress());
        student2.companyName.sendKeys(faker.company().name());
        student2.startDate.sendKeys("05/04/2018");
        student2.street.sendKeys(faker.address().streetName());
        student2.state.sendKeys(faker.address().state());
        student2.title.sendKeys(faker.job().title());
        student2.city.sendKeys(faker.address().city());
        student2.zipCode.sendKeys("5");
        student2.submitButton.click();
    }

    @When("Validate if student is in UI")
    public void validate_if_student_is_in_UI() {
      student2.allStudents.isDisplayed();

    }

    @Then("Student verification in UI and database")
    public void student_verification_in_UI_and_database() throws SQLException {

        DBUtility.openConnection(Config.getProperty("dbType"));
        List<Map<String, Object>> studentData = DBUtility.executeSQLquery("select FIRST_NAME from student");
        List<Object> firsNames = new ArrayList<>();

        for (Map<String, Object> m : studentData) {
            firsNames.add(m.get("FIRST_NAME"));
        }

        Assert.assertTrue(firsNames.contains(expectedfirstName));
        DBUtility.closeConnection();
    }
    }


