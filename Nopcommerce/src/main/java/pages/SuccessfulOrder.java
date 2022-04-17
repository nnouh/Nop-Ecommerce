package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SuccessfulOrder {
    WebDriver driver;
    public SuccessfulOrder(WebDriver driver){
        this.driver=driver;
    }

    private By cartBtn = By.xpath("//div[@class=\"header-links\"]/ul/li[@id=\"topcartlink\"]/a[@href=\"/cart\"]/span[@class=\"cart-label\"]");
    private By agreeCheckBox = By.id("termsofservice");
    private By  checkOut =By.id("checkout");
    private By selCity    = By.id("BillingNewAddress_City");
    private By address1 = By.id("BillingNewAddress_Address1");
    private By zipCode   = By.id("BillingNewAddress_ZipPostalCode");
    private By telephone = By.id("BillingNewAddress_PhoneNumber");
    private By continuBtn  = By.name("save");
//Second tab
    private By secondContinu= By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
    private By payment = By.xpath("//div[@id=\"payment-method-buttons-container\"]/button[@name=\"save\"]");
    private By payInfo = By.xpath("//div[@id=\"payment-info-buttons-container\"]/button[@class=\"button-1 payment-info-next-step-button\"]");
    private By confirm = By.xpath("//div[@id=\"confirm-order-buttons-container\"]/button[@class=\"button-1 confirm-order-next-step-button\"]");
 private By assertOrder = By.xpath("//div[@class=\"page-title\"]/h1[contains( text(),'Thank you')]");
    public void cartShipp(){
        driver.findElement(cartBtn).click();
        driver.findElement(agreeCheckBox).click();
        driver.findElement(checkOut).click();
    }
    public void continueBtn(String city, String addr, String zip, String tel){
        Select sel = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
         sel.selectByValue("123");
         driver.findElement(selCity).sendKeys(city);
         driver.findElement(address1).sendKeys(addr);
         driver.findElement(zipCode).sendKeys(zip);
         driver.findElement(telephone).sendKeys(tel);
         driver.findElement(continuBtn).click();
    }
    public void secondTab(){
        driver.findElement(secondContinu).click();
    }
    public void paymentMth(){
        driver.findElement(payment).click();
    }
    public void paymentInfo(){
        driver.findElement(payInfo).click();
    }
    public void confirmPayment(){
        driver.findElement(confirm).click();
    }

    public String assertOrderShip(){
        String thankYouTxt = driver.findElement(assertOrder).getText();
        //System.out.println(thankYouTxt);
       // Assert.assertEquals(thankYouTxt, "Thank you");
        return thankYouTxt;
    }
}
