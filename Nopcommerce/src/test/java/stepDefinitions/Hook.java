package stepDefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
 static WebDriver driver;
    @Before
    public static void openUrl(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
//    @After
//    public static void closeBrowser(){
//        driver.quit();
//    }
}
