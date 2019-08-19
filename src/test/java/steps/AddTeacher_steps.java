package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddTeacherPage;
import utilities.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class AddTeacher_steps {

    private WebDriver driver = Driver.getDriver();

    AddTeacherPage addTPage = new AddTeacherPage();
    Faker faker = new Faker();
    String Fname = faker.name().firstName();

    @Given("User is on Cybertektraining page")
    public void user_is_on_Cybertektraining_page()  {

        driver.get(Config.getProperty("CybertekTrainingUrl"));
        driver.findElement(By.xpath("(//a[@href='#'])[4]")).click();

    }


    @When("User starts add new Teacher\\/Student profile")
    public void user_starts_add_new_Teacher_Student_profile() {

        driver.findElement(By.xpath("//a[@href='add-teacher.html']")).click();


    }

    @When("User starts to fill Teacher\\/Student information")
    public void user_starts_to_fill_Teacher_Student_information() {

        addTPage.FirstName.click();
        addTPage.FirstName.sendKeys(Fname);

        addTPage.LastName.click();
        addTPage.LastName.sendKeys(faker.name().lastName());

        addTPage.email.click();
        addTPage.email.sendKeys(faker.internet().emailAddress());

        addTPage.subject.click();
        addTPage.subject.sendKeys("Java");

        addTPage.birthDate.click();
        addTPage.birthDate.sendKeys("01/01/2000");

        addTPage.JoiningDate.click();
        addTPage.JoiningDate.sendKeys("01/01.2018");


        addTPage.password.click();
        addTPage.password.sendKeys("12345");


        WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
        number.click();
        number.sendKeys("3237775577");
//      addTPage.number.click();
//      addTPage.number.sendKeys(faker.phoneNumber().cellPhone());

        addTPage.address.click();
        addTPage.address.sendKeys(faker.address().fullAddress());

        addTPage.section.click();
        addTPage.section.sendKeys("567");

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

    }

    @Then("User sees created profile")
    public void user_sees_created_profile() throws SQLException {

    }

    @Then("User validates UI and DataBase")
    public void user_validates_UI_and_DataBase() throws SQLException {

       DBUtility.openConnection(Config.getProperty("dbType"));
       List<Map<String,Object>> justName = DBUtility.executeSQLquery("select FIRST_NAME from teacher");

       for(Map map:justName){

           if(Fname.equals(map.get("FIRST_NAME"))){


               System.out.println("Expected First Name: "+Fname);
               System.out.println("Actual First Name: "+ map.get("FIRST_NAME"));
               Assert.assertEquals(Fname, map.get("FIRST_NAME"));
           }

       }

        DBUtility.closeConnection();
    }

    @Then("User deletes profile")
    public void user_deletes_profile() {


        WebElement name123 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        name123.click();
        name123.sendKeys(Fname);


        WebElement search = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block mt-4 mb-2']"));
        search.click();


        WebElement toggle = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[4]"));
        toggle.click();

        WebElement delete = driver.findElement(By.xpath("//a[@data-target='#delete_employee']"));
        delete.click();

        WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
        sub.click();

        driver.close();

    }

}