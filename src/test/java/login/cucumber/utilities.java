package login.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class utilities {
    WebElement element;


    public WebElement getWebElement(String locator, WebDriver driver){
        String[] str = locator.split("===");
        if(str[0].equals("xpath"))
        {
            element= driver.findElement(By.xpath(str[1]));
        }
        else if(str[0].equals("id"))
        {
            element= driver.findElement(By.id(str[1]));
        }
        return element;
    }
}
