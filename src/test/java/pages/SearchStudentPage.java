package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchStudentPage {

    public SearchStudentPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='dropdown profile-action']")
    public WebElement usersOptionsDropdown;

    @FindBy(xpath = "//a[@data-target='#delete_employee']")
    public WebElement deleteUserButton;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement confirmationOfDeleting;

}
