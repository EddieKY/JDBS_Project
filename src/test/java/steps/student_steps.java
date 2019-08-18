package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.studentPage;
import utilities.Config;
import utilities.DBUtility;
import utilities.Driver;
import utilities.SelectClass;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class student_steps {
    studentPage sp = new studentPage();
    Faker faker = new Faker();

    String expectedfirstName = faker.name().firstName();

    @Given("Student on the CybertekTrainingg page")
    public void student_on_the_CybertekTrainingg_page() throws SQLException {

        Driver.getDriver().get(Config.getProperty("url"));  // --- opens the website, gets url from config.properties
        sp.studentArrow.click();
    }

    @Given("Student adds new student page")
    public void student_adds_new_student_page() {

        sp.addStudent.click();
    }


    @Then("Student fills all the required information and saves it")
    public void student_fills_all_the_required_information_and_saves_it() throws SQLException {

        sp.inputName.sendKeys(expectedfirstName);
        sp.inputLastName.sendKeys(faker.name().lastName());
        sp.inputEmail.sendKeys(faker.internet().emailAddress());
        sp.joinDate.sendKeys("08/14/2015");
        String passwd = faker.internet().password();
//            sp.inputPasswd.sendKeys(passwd);
//            sp.confirmPasswd.sendKeys(passwd);
        sp.inputSubject.sendKeys("Biology");
        sp.inputMobile.sendKeys("2");
        SelectClass.getSelect(sp.selectGender).selectByVisibleText("Male");
        sp.admission.sendKeys(faker.number().digits(5));
        sp.birthDate.sendKeys("03/24/2012");
        sp.major.sendKeys(faker.job().position());
        SelectClass.getSelect(sp.selectBatch).selectByIndex(1);
        sp.section.sendKeys(faker.number().digits(7));
        sp.address.sendKeys(faker.address().fullAddress());
        sp.companyName.sendKeys(faker.company().name());
        sp.startDate.sendKeys("05/04/2018");
        sp.street.sendKeys(faker.address().streetName());
        sp.state.sendKeys(faker.address().state());
        sp.title.sendKeys(faker.job().title());
        sp.city.sendKeys(faker.address().city());
        sp.zipCode.sendKeys("5");
        sp.submitButton.click();
    }

    @Then("Verify if student is in UI")
    public void verify_if_student_is_in_UI() throws SQLException {

        for (WebElement studentList : sp.listOfStudents) {
            if (studentList.getText().equalsIgnoreCase(expectedfirstName)) {
                System.out.println("PASSED!");
                break;
            }
        }
    }

    @Then("Verify is user is in our database")
    public void verify_is_user_is_in_our_database() throws SQLException {

        DBUtility.openConnection(Config.getProperty("dbType"));

        List<Map<String, Object>> studentData = DBUtility.executeSQLquery("select FIRST_NAME from student");
        List<Object> firsNames = new ArrayList<>();

        for (Map<String, Object> m : studentData) {
            firsNames.add(m.get("FIRST_NAME"));
        }

        Assert.assertTrue(firsNames.contains(expectedfirstName));
//        boolean check = false;
//            if ((m.get("FIRST_NAME")).equals(expectedfirstName)) {
//                check = true;
//                break;
//            }
//        }
//        Assert.assertTrue(check);
        DBUtility.closeConnection();
    }

    @Given("Student adds new student on CybertekTraining page")
    public void student_adds_new_student_on_CybertekTraining_page() {
        sp.addStudent.click();
    }

    @Given("Student fills all the required information and saves it on Cybertek page")
    public void student_fills_all_the_required_information_and_saves_it_on_Cybertek_page() {

        sp.inputName.sendKeys(expectedfirstName);
        String lastName = faker.name().lastName();
        sp.inputLastName.sendKeys(lastName);

        String email = expectedfirstName + "." + lastName + "@yahoo.com";
        sp.inputEmail.sendKeys(email);
        sp.joinDate.sendKeys("08/14/2015");
        String passwd = faker.internet().password();

        sp.inputSubject.sendKeys("Football");
        sp.inputMobile.sendKeys("2");
        SelectClass.getSelect(sp.selectGender).selectByVisibleText("Male");
        sp.admission.sendKeys(faker.number().digits(5));
        sp.birthDate.sendKeys("03/24/2012");
        sp.major.sendKeys(faker.job().position());
        SelectClass.getSelect(sp.selectBatch).selectByIndex(1);
        sp.section.sendKeys(faker.number().digits(7));
        sp.address.sendKeys(faker.address().fullAddress());
        sp.companyName.sendKeys(faker.company().name());
        sp.startDate.sendKeys("05/04/2018");
        sp.street.sendKeys(faker.address().streetName());
        sp.state.sendKeys(faker.address().state());
        sp.title.sendKeys(faker.job().title());
        sp.city.sendKeys(faker.address().city());
        sp.zipCode.sendKeys("5");
        sp.submitButton.click();

    }

    @Given("Verify if student is in UI of Cybertek page")
    public void verify_if_student_is_in_UI_of_Cybertek_page() {

    }

    @Then("Verify is user is in our Cybertek database")
    public void verify_is_user_is_in_our_Cybertek_database() {
        

    }
}

