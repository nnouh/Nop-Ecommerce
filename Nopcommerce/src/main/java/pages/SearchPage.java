package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    private By searchTxt = By.id("small-searchterms");
    private By searchBtn = By.xpath("//button [@class=\"button-1 search-box-button\"]");
    //private By hpLogo = By.xpath("//a//img[@src=\"https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png\"]");
    private By products = By.xpath("//h2[@class=\"product-title\"]//a");


    //public void homepageLogo(){
      //  driver.findElement(hpLogo).click();
   // }

    public void searchTxtMethod(String searchKeys){

        driver.findElement(searchTxt).sendKeys(searchKeys);
        driver.findElement(searchBtn).click();

    }
    public void relResult(){

        int count = driver.findElements(products).size();
         System.out.println(count);
        ArrayList<String> prodList = new ArrayList<String>();
        Assert.assertTrue(count>0);
        for(int i = 0; i <count; i++){

            System.out.println(driver.findElements(products).get(i).getText());

            prodList.add(driver.findElements(products).get(i).getText());

        }
        System.out.println(prodList);

    }
}
