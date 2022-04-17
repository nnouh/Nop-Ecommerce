package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomCategories {
    WebDriver driver;
    public RandomCategories(WebDriver driver){
        this.driver =driver;
    }
    public void selectCategory(){
        List<WebElement> categories = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]"));
        int maxProducts = categories.size();
        System.out.println(maxProducts);
        Random random = new Random();
        int randomCategory = random.nextInt(maxProducts);
        categories.get(randomCategory).click();


    }
}
