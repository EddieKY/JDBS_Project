package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.studentPage;
import utilities.Config;
import utilities.Driver;
import utilities.SelectClass;

import java.sql.SQLException;

public class student_steps {
    studentPage sp = new studentPage();
    Faker faker = new Faker();

    String firstName= faker.name().firstName();

    @Given("Student on the CybertekTrainingg page")
    public void student_on_the_CybertekTrainingg_page() throws SQLException {

//     Driver.getDriver().get(Config.getProperty("url"));  // --- opens the website, gets url from config.properties
//        DbUtility.openConnection(Config.getProperty("dbType"));


        sp.studentArrow.click();
    }

    @Given("Student adds new student page")
    public void student_adds_new_student_page() {
        sp.addStudent.click();
    }


    @Then("Student fills all the required information and saves it")
    public void student_fills_all_the_required_information_and_saves_it() throws SQLException{

        sp.inputName.sendKeys(firstName);
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
}
