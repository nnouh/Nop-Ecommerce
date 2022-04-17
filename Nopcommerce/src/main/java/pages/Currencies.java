package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Currencies {

    WebDriver driver;

    public Currencies(WebDriver driver){
        this.driver = driver;
    }
    // WebElement ddl = driver.findElement(By.id("customerCurrency"));

    public void selectDDl(){
        Select selCurrencies = new Select(driver.findElement(By.id("customerCurrency")));
        selCurrencies.selectByIndex(1);
    }

}
