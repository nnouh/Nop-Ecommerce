package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangPassWord {
    WebDriver driver;
    public ChangPassWord(WebDriver driver){
        this.driver=driver;
    }
  private By myAccount = By.xpath("//a[@class=\"ico-account\"]");


    private By changePwLink = By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a");
    private By oldPW = By.id("OldPassword");
    private By newpw = By.id("NewPassword");
    private By confNewPw = By.id("ConfirmNewPassword");
    private By changPWBtn = By.xpath("//button[@class=\"button-1 change-password-button\"]");

    public void myAccountLink(){

        driver.findElement(myAccount).click();
    }
    public  void changPWlnk(){
       // WebDriverWait wait = new WebDriverWait(driver,10);
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("a[href=\"/customer/changepassword\"]")));
       driver.findElement(changePwLink).click();
    }
    public void insertNewPW(String oldPassword, String newPassword, String confNewPassword){
        driver.findElement(oldPW).sendKeys(oldPassword);
        driver.findElement(newpw).sendKeys(newPassword);
        driver.findElement(confNewPw).sendKeys(confNewPassword);
    }
    public void changPwBtnClick(){
        driver.findElement(changPWBtn).click();
    }





}
