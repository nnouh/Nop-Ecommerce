package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormPage {

    WebDriver driver;
    public RegistrationFormPage(WebDriver driver){
        this.driver=driver;
    }

    private By userNameF = By.id("FirstName");
    private By lstNameF = By.id("LastName");
    private By email = By.id("Email");
    private By passWrd = By.id("Password");
    private By confPassWord = By.id("ConfirmPassword");
    private By subBtn = By.id("register-button");

    public void regFormData(String usrNum, String lstNum, String mail, String pw){
        driver.findElement(userNameF).sendKeys(usrNum);
        driver.findElement(lstNameF).sendKeys(lstNum);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(passWrd).sendKeys(pw);
        driver.findElement(confPassWord).sendKeys(pw);

    }
    public void regBtnSub(){
        driver.findElement(subBtn).click();

    }




}
