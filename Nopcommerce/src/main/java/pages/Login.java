package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver){
        this.driver =driver;
    }
    private By loginMail = By.id("Email");
    private By loginPw = By.id("Password");
    private By loginBtn = By.xpath("//button [@class=\"button-1 login-button\"]");
    //private By lnktxt = By.xpath("//a[@class=\"ico-account\"]");

    public void credintionalValue(String logEmail, String logpw){
        driver.findElement(loginMail).sendKeys(logEmail);
        driver.findElement(loginPw).sendKeys(logpw);
        driver.findElement(loginBtn).click();

    }





}
