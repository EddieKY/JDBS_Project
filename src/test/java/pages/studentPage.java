package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class studentPage {
    public WebDriver driver;


    public studentPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "(//span[@class='menu-arrow'])[2]")
    public WebElement studentArrow;

    @FindBy (xpath = "//a[.='Add Student']")
    public WebElement addStudent;

    @FindBy (xpath = "//label[.='Firstname']/preceding-sibling::input")
    public WebElement inputName;

    @FindBy (xpath = "//label[.='Lastname']/preceding-sibling::input")
    public WebElement inputLastName;

    @FindBy (xpath = "//label[.='Email']/preceding-sibling::input")
    public WebElement inputEmail;

    @FindBy (xpath = "//label[.='Joining Date']/preceding-sibling::input")
    public WebElement joinDate ;

//    @FindBy (xpath = "//label[.='Password']/preceding-sibling::input")
//    public WebElement  inputPasswd;
//
//    @FindBy (xpath = "//label[.='Comfirm Password']/preceding-sibling::input")
//    public WebElement confirmPasswd;

    @FindBy (xpath = "//label[.='Subject']/preceding-sibling::input")
    public WebElement inputSubject ;

    @FindBy (xpath = "//label[.='Mobile number']/preceding-sibling::input")
    public WebElement  inputMobile;

    @FindBy (xpath = "//label[.='Gender']/preceding-sibling::select")
    public WebElement selectGender;

    @FindBy (xpath = "//label[.='Admission No']/preceding-sibling::input")
    public WebElement admission;

    @FindBy (xpath = "//label[.='Birth Date']/preceding-sibling::input")
    public WebElement birthDate;

    @FindBy (xpath = "//label[.='Major']/preceding-sibling::input")
    public WebElement major;

    @FindBy (xpath = "//label[.='Batch']/preceding-sibling::select")
    public WebElement selectBatch;

    @FindBy (xpath = "//label[.='Section']/preceding-sibling::input")
    public WebElement section;

    @FindBy (xpath = "//label[.='Premanent Address']/preceding-sibling::textarea")
    public WebElement address;

    @FindBy (xpath = " //label[.='Company Name']/preceding-sibling::input")
    public WebElement companyName;

    @FindBy (xpath = "//label[.='Start Date']/preceding-sibling::input")
    public WebElement startDate;

    @FindBy (xpath = "//label[.='Street (123 N. California, Apt 1)']/preceding-sibling::input")
    public WebElement street;

    @FindBy(xpath = "//label[.='State']/preceding-sibling::input")
    public WebElement state;

    @FindBy (xpath = "//label[.='Title']/preceding-sibling::input")
    public WebElement title;


    @FindBy (xpath = "//label[.='City']/preceding-sibling::input")
    public WebElement city;

    @FindBy (xpath = "//label[.='ZipCode']/preceding-sibling::input")
    public WebElement zipCode ;


    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='profile-widget']/h4")
    public List<WebElement> listOfStudents;
}
