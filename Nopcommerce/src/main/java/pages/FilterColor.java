package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilterColor {
    WebDriver driver;
    public FilterColor(WebDriver driver){
        this.driver =driver;
    }
    private By red= By.xpath("//ul[@class=\"group product-spec-group product-spec-color\"]/li[3]/input[@id=\"attribute-option-15\"]");

    public void hoverCategory(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a"))).perform();
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul/li/a[contains(text(),'Shoes')]")).click();
    }
    public void chooseColor(){

        driver.findElement(red).click();

    }

}
