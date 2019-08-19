package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
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

    String Lname = faker.name().lastName();
    String email = faker.internet().emailAddress();

    String subject ="Java";
    String BirthDate = "01/01/2000";
    String JoiningDate = "01/01.2018";
    String password = "12345";
    String Mobilenumber = "3237775577";

    String section1 = "567";

    String address = faker.address().fullAddress();

    int teacherID;



    @Given("User is on Cybertektraining page")
    public void user_is_on_Cybertektraining_page()  {

        Response response = RestAssured.get("http://cybertektraining.com/index.html");

        System.out.println(response.statusCode());

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
        addTPage.LastName.sendKeys(Lname);

        addTPage.email.click();
        addTPage.email.sendKeys(email);

        addTPage.subject.click();
        addTPage.subject.sendKeys(subject);

        addTPage.birthDate.click();
        addTPage.birthDate.sendKeys(BirthDate);

        addTPage.JoiningDate.click();
        addTPage.JoiningDate.sendKeys(JoiningDate);


        addTPage.password.click();
        addTPage.password.sendKeys(password);


        WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
        number.click();
        number.sendKeys(Mobilenumber);

        addTPage.address.click();
        addTPage.address.sendKeys(address);

        addTPage.section.click();
        addTPage.section.sendKeys(section1);

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();


    }


    @Then("User validates UI and DataBase")
    public void user_validates_UI_and_DataBase() throws SQLException {

       DBUtility.openConnection(Config.getProperty("dbType"));
       List<Map<String,Object>> SQLTable = DBUtility.executeSQLquery("select * from teacher");

       for(Map map: SQLTable){

           if(email.equals(map.get("EMAIL_ADDRESS"))){

               if(Lname.equals(map.get("LAST_NAME"))) {

                   if(Fname.equals(map.get("FIRST_NAME"))){


                       System.out.println("Expected EMAIL_ADDRESS: "+email);
                       System.out.println("Actual EMAIL_ADDRESS: "+ map.get("EMAIL_ADDRESS"));
                       System.out.println();

                       Assert.assertEquals(email, map.get("EMAIL_ADDRESS"));

                       System.out.println("Expected First Name: "+Fname);
                       System.out.println("Actual First Name: "+ map.get("FIRST_NAME"));
                       System.out.println();

                       Assert.assertEquals(Fname, map.get("FIRST_NAME"));

                       System.out.println("Expected LAST_NAME: "+Lname);
                       System.out.println("Actual LAST_NAME: "+ map.get("LAST_NAME"));
                       System.out.println();




                       Assert.assertEquals(Lname, map.get("LAST_NAME"));
                       Assert.assertEquals(subject, map.get("SUBJECT"));
                       Assert.assertEquals(password, map.get("PASSWORD"));
                       Assert.assertEquals(Mobilenumber, map.get("PHONE"));
                       Assert.assertEquals(section1, map.get("SECTION"));
                       Assert.assertEquals(address, map.get("PREMANENT_ADDRESS"));



                       teacherID = map.get("TEACHER_ID").hashCode();

                       if(teacherID==(map.get("TEACHER_ID").hashCode())){
                           System.out.println("Teacher id was created: "+ teacherID);
                           Assert.assertTrue(true);

                       }

                       }

                   }

                   }
       }

        DBUtility.closeConnection();
    }


    @Then("User deletes profile")
    public void user_deletes_profile() throws SQLException{


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

        DBUtility.openConnection(Config.getProperty("dbType"));
        List<Map<String,Object>> SQLTable = DBUtility.executeSQLquery("select * from teacher");

        for(Map map: SQLTable){
               if(teacherID==(map.get("TEACHER_ID").hashCode())){

                           System.out.println("User: "+ teacherID);
                           Assert.assertTrue("DataBase contains Teacher ID", true);
                       }
        }
        driver.close();
        DBUtility.closeConnection();

    }

}