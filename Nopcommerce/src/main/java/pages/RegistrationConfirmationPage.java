package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationConfirmationPage {

WebDriver driver;
    public RegistrationConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }
    private By confText = By.xpath("//div [@class=\"result\"]");

    public String confirmationMessage(){
       String confMessage= driver.findElement(confText).getText();
        return confMessage;
    }

}