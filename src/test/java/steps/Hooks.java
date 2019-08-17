package steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup(){

        WebDriver driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS) ;

        System.out.println("This is Hooks setup method");

        }

//    @Before(order = 2)
//    public void setup2(){
//            System.out.println("This is Hooks setup for google");
//        }
//
//
//    @After
//    public void tearDown(Scenario scenario){
//        System.out.println("Hooks clean up");
//        System.out.println(scenario.getName());
//        System.out.println(scenario.getStatus());
//
//        if(scenario.isFailed()){
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png");
//        }
//
//        Driver.closeDriver();
//
//        }

}
