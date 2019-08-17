package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddTeacherPage {

    public WebDriver driver;

    public AddTeacherPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@type='text']")
    public WebElement FirstName;

//    WebElement element1 = driver.findElement(By.xpath("//input[@type='text']"));
//        element1.click();
//    String name = faker.name().firstName();
//        element1.sendKeys(name);

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement LastName;

//    WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//        element2.click();
//        element2.sendKeys(faker.name().lastName());

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement email;
//
//    WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//        email.click();
//        email.sendKeys("JavaTeacher@cybertek.com");


    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement subject;

//    WebElement subject = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//        subject.click();
//        subject.sendKeys("Java");


    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement birthDate;

//    WebElement birthDate = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//        birthDate.click();
//        birthDate.sendKeys("01/01/2000");


    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement JoiningDate;


//    WebElement JoiningDate = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
//        JoiningDate.click();
//        JoiningDate.sendKeys("01/01/2019");


    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;


//    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//        password.click();
//        password.sendKeys("Password123");


    @FindBy(xpath = "//input[@type='number']")
    public WebElement number;

//    WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
//        number.click();
//        number.sendKeys("3237775577");


    @FindBy(xpath = "//textarea[@placeholder='Premanent Address']")
    public WebElement address;


//    WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Premanent Address']"));
//        address.click();
//        address.sendKeys("2700 S River Rd Suite 402, Des Plaines, IL 60018");


    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement section;

//    WebElement section = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//        section.click();
//        section.sendKeys("8");
}


