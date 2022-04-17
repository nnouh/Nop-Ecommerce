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
    private By hpLogo = By.xpath("//div[@class=\"header-logo\"]/a/img[@src=\"https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png\"]");


    public RegistrationFormPage clickRegBtn(){
        driver.findElement(rigesterBtn).click();
        return new RegistrationFormPage(driver);
    }
    public Login loginLink(){
        driver.findElement(loginHp).click();
        return new Login(driver);
    }
    public void homepageLogo(){
         driver.findElement(hpLogo).click();
         }


}
