import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;



public class Selenium_Assignment2 {
    WebDriver driver;
    @BeforeMethod
    void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/collections-in-java");//getting the url
    }

    @Test
    void hyperlink()
    {
List<WebElement> links =  driver.findElements(By.tagName("a"));
//driver.findElements(By.className());
int count_hyperlinks = links.size();
        System.out.println("total no of hyperlinks = "+ count_hyperlinks);
    }

    @Test
    void table()
    {
        List<WebElement> links =  driver.findElements(By.tagName("table"));
        int count_table = links.size();
        System.out.println("total no of tables ="+count_table);

    }

    @AfterMethod
    void closebrowser()
    {
        driver.close();
    }
}
