package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectTags {

    WebDriver driver;

    public SelectTags(WebDriver driver) {
        this.driver = driver;
    }

    private By bookTag = By.xpath("//div[@class=\"tags\"]/ul/li/a[@href=\"/book\"]");
    private By bookTagTxt = By.xpath("//div[@class=\"page-title\"]/h1[contains(text(),\"book\")]");
private By computerLnk = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]");
private By comp = By.xpath("//div[@class=\"tags\"]/ul/li/a[@href=\"/computer\"]");
private By compTxt = By.xpath("//div[@class=\"page-title\"]/h1[contains(.,\"Products tagged with 'computer'\")]");

public void clickonComputerlnk(){
    driver.findElement(computerLnk).click();
}
    public void firstTag() {
        driver.findElement(bookTag).click();
    }
    public String firstTagAssert(){
        String fTagTxt = driver.findElement(bookTagTxt).getText();
        return fTagTxt;
}

    public void secondTag(){
    driver.findElement(comp).click();}

    public String secondTagAssertion(){
    String computerTxt =driver.findElement(compTxt).getText();
    return computerTxt;

    }
}