package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
            }
    private By rigesterBtn = By.xpath("//a[@class ='ico-register']");
    private By loginHp = By.xpath("//a[@class=\"ico-login\"]");


    public RegistrationFormPage clickRegBtn(){
        driver.findElement(rigesterBtn).click();
        return new RegistrationFormPage(driver);
    }
    public Login loginLink(){
        driver.findElement(loginHp).click();
        return new Login(driver);
    }


}
