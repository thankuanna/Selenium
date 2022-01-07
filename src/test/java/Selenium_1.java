import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_1 {
    @Test
    void OpeningBrowser()
    {
       System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
       WebDriver driver = new ChromeDriver(); //create or opening browser
        driver.manage().window().maximize(); //maximizing;same for minimzing
       driver.get("https://www.obsqurazone.com");
       driver.getTitle();
      // driver.getCurrentUrl();
       System.out.println("The url is :"+driver.getCurrentUrl());
        System.out.println("The source :"+driver.getPageSource());
       driver.close(); //closing browser
    }
}
