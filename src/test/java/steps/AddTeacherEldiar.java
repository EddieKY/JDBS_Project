package steps;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTeacherEldiar {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://cybertektraining.com/index.html");

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//a[@href='#'])[4]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='add-teacher.html']")).click();


        WebElement element1 = driver.findElement(By.xpath("//input[@type='text']"));

        Faker faker = new Faker();

        element1.click();

        String name = faker.name().firstName();
        element1.sendKeys(name);

        Thread.sleep(1000);

        WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        element2.click();
        element2.sendKeys(faker.name().lastName());

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        email.click();
        email.sendKeys("JavaTeacher@cybertek.com");

        Thread.sleep(1000);

        WebElement subject = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        subject.click();
        subject.sendKeys("Java");

        Thread.sleep(1000);

        WebElement birthDate = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        birthDate.click();
        birthDate.sendKeys("01/01/2000");

        Thread.sleep(1000);

        WebElement JoiningDate = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        JoiningDate.click();
        JoiningDate.sendKeys("01/01/2019");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.click();
        password.sendKeys("Password123");

        Thread.sleep(1000);

        WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
        number.click();
        number.sendKeys("3237775577");

        Thread.sleep(1000);

        WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Premanent Address']"));
        address.click();
        address.sendKeys("2700 S River Rd Suite 402, Des Plaines, IL 60018");

        Thread.sleep(1000);


        WebElement section = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        section.click();
        section.sendKeys("8");

        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        Thread.sleep(2000);


        WebElement name123 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        name123.click();
        name123.sendKeys(name);

        Thread.sleep(1000);

        WebElement search = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block mt-4 mb-2']"));
        search.click();


        WebElement toggle = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[4]"));
        toggle.click();

        WebElement delete = driver.findElement(By.xpath("//a[@data-target='#delete_employee']"));
        delete.click();

        WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
        sub.click();




//        List<WebElement> names = driver.findElements(By.xpath("//div[@class='row staff-grid-row']"));
//
//        for(WebElement w: names){
//
//            if(w.getText().equals(name)){
//            WebElement toggle = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[5]"));
//            toggle.click();
//            }
    }


//    public void




}
