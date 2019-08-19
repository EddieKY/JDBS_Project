package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.SearchStudentPage;
import pages.studentPage;
import utilities.DBUtility;
import utilities.SelectClass;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class GabiStudent_steps {

    studentPage sp = new studentPage();
    SearchStudentPage searchStudentPage = new SearchStudentPage();


    @Given("Student adds new student on CybertekTraining page")
    public void student_adds_new_student_on_CybertekTraining_page() {
        sp.addStudent.click();
    }


    @Given("Student should add first name {string}")
    public void student_should_add_first_name(String firstname) {
        sp.inputName.sendKeys(firstname);
    }

    @Given("Student should add last name {string}")
    public void student_should_add_last_name(String lastname) {
        sp.inputLastName.sendKeys(lastname);
    }

    @Given("Student should add {string} and joining date")
    public void student_should_add_and_joining_date(String email) {
        sp.inputEmail.sendKeys(email);
        sp.joinDate.sendKeys("08/14/2015");
    }

    @Given("Student should add subject {string}")
    public void student_should_add_subject(String subject) {
        sp.inputSubject.sendKeys(subject);
    }

    @Given("Student should add phone number {string}")
    public void student_should_add_phone_number(String mobilePhone) {
        sp.inputMobile.sendKeys(mobilePhone);
    }

    @Given("Student should add gender and {string}")
    public void student_should_add_gender_and(String admisionNumber) {
        SelectClass.getSelect(sp.selectGender).selectByVisibleText("Male");
        sp.admission.clear();
        sp.admission.sendKeys(admisionNumber);
    }

    @Given("Student should add birthDate and {string}")
    public void student_should_add_birthDate_and(String major) {
        sp.birthDate.sendKeys("03/24/2012");
        sp.major.sendKeys(major);

    }

    @Given("Student should add batch and section {string}")
    public void student_should_add_batch_and_section(String section) {

        SelectClass.getSelect(sp.selectBatch).selectByIndex(1);
       sp.section.sendKeys(section);

    }

    @Given("Student should add adress {string}")
    public void student_should_add_adress(String adress) {
        sp.address.sendKeys(adress);
    }

    @Given("Student should add Company Information")
    public void student_should_add_Company_Information() {
        Faker faker = new Faker();
        sp.companyName.sendKeys(faker.company().name());
        sp.startDate.sendKeys("05/04/2018");
        sp.street.sendKeys(faker.address().streetName());
        sp.state.sendKeys(faker.address().state());
        sp.title.sendKeys(faker.job().title());
        sp.city.sendKeys(faker.address().city());
        sp.zipCode.sendKeys("12345");
    }

    @When("Student submits application")
    public void student_submits_application() {
        sp.submitButton.click();
    }

    @Then("Verify if student {string} is in UI of Cybertek page")
    public void verify_if_student_is_in_UI_of_Cybertek_page(String name) {
        String expectedResult ="";

        for(WebElement webElement: sp.listOfStudents){
            if(webElement.getText().equals(name)){
                expectedResult = webElement.getText();
                break;
            }
        }

       Assert.assertEquals(expectedResult,name);
    }

    @Then("Match firstName {string}, lastName {string}, subject {string}, admisionNo {string} and  major {string} with DB")
    public void match_firstName_lastName_subject_admisionNo_and_major_with_DB(String firstName, String lastName, String subject, String admisionNO, String major) throws SQLException {

        DBUtility.openConnection("Oracle");
        List<Map<String,Object>> everythingFromStudent = DBUtility.executeSQLquery("SELECT * FROM student");

        String expectedFirstName = "";
        String expectedLastName = "";
        String expectedSubject = "";
        String expectedAdmision = "";
        String expectedMajor = "";

        for(int i = 0; i < everythingFromStudent.size(); i++){

            if(everythingFromStudent.get(i).get("FIRST_NAME").toString().equals(firstName)){
                expectedFirstName = everythingFromStudent.get(i).get("FIRST_NAME").toString();
            }

            if (everythingFromStudent.get(i).get("LAST_NAME").toString().equals(lastName)) {
                expectedLastName = everythingFromStudent.get(i).get("LAST_NAME").toString();
            }

            if (everythingFromStudent.get(i).get("SUBJECT").toString().equals(subject)) {
                expectedSubject = everythingFromStudent.get(i).get("SUBJECT").toString();
            }
            if (everythingFromStudent.get(i).get("ADMISSION_NO").toString().equals(admisionNO)) {
                expectedAdmision = everythingFromStudent.get(i).get("ADMISSION_NO").toString();
            }

            if (everythingFromStudent.get(i).get("MAJOR").toString().equals(major)) {
                expectedMajor = everythingFromStudent.get(i).get("MAJOR").toString();
            }

        }

        Assert.assertEquals(expectedFirstName,firstName);
        Assert.assertEquals(expectedLastName,lastName);
        Assert.assertEquals(expectedAdmision,admisionNO);
        Assert.assertEquals(expectedSubject,subject);
        Assert.assertEquals(expectedMajor,major);



    }

    @Then("After verification, Student delete profile by first name {string}")
    public void after_verification_Student_delete_profile_by_first_name(String firstName) {
        sp.firstNameSearch.sendKeys(firstName);
        sp.studentPageSearchButton.click();
        searchStudentPage.usersOptionsDropdown.click();
        searchStudentPage.deleteUserButton.click();
        searchStudentPage.confirmationOfDeleting.click();

    }


}
