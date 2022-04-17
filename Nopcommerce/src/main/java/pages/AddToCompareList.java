package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCompareList {
    WebDriver driver;
    public AddToCompareList (WebDriver driver){
        this.driver=driver;

    }

    private By catLinkCF = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]");
    private By itemProdCF = By.xpath("//div[@class=\"product-item\"]/div/h2/a[@href=\"/fahrenheit-451-by-ray-bradbury\"]");
    private By itemAddToCF = By.xpath("//div[@class=\"compare-products\"]/button[@class=\"button-2 add-to-compare-list-button\"]");
    private By fistTxtCF = By.xpath("//div[@class=\"bar-notification success\"]/p[@class=\"content\"]");
    //second item
    private By catLinkSItemC = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]");
    private By itemProdSItemC = By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/if-you-wait-donation\"]");
    private By itemAddToCartSItemC = By.xpath("//div[@class=\"compare-products\"]/button[@class=\"button-2 add-to-compare-list-button\"]");
    private By secondTxtSItemC = By.xpath("//div[@class=\"bar-notification success\"]/p[@class=\"content\"]");

    public void categClickCom(){

        driver.findElement(catLinkCF).click();

    }
    public void itemClickCom() {
        driver.findElement(itemProdCF).click();
    }
    public void addCompareClick(){

        driver.findElement(itemAddToCF).click();
    }
    public String txtAssertFirstCom(){
        String firstItemTxt = driver.findElement(fistTxtCF).getText();

        return firstItemTxt;
    }
    // Second item
    public void categClickSecondCom(){

        driver.findElement(catLinkSItemC).click();

    }
    public void itemClickSecondCom(){

        driver.findElement(itemProdSItemC).click();
    }
    public void addComClickSecond(){

        driver.findElement(itemAddToCartSItemC).click();
    }
    public String txtAssertSecondCom(){
        String secondItemTxt = driver.findElement(secondTxtSItemC).getText();
        return secondItemTxt;
    }



}
