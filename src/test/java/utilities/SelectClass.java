package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    private static Select select;

    public static Select getSelect(WebElement element){
        if(select == null){
            select = new Select(element);
        }
        return select;
    }

    public static void selectByIndex (int index) {select.selectByIndex(index);}

    public static void selectByVisibleText (String text){ select.selectByVisibleText(text);}

    public static void selectByValue (String value){select.selectByValue(value);}
}
