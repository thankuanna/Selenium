import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Selenium_WebElement1 {
    WebDriver driver; // defining variable
    @BeforeMethod
            void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");//getting the url
    }

    @Test
    void findimage()
    {
        //WebElement element = driver.findElement(By.tagName("img"));
       // driver.findElement(By.tagName("img"));
        List<WebElement> elements = driver.findElements(By.tagName("img"));
        System.out.println("no of images=" +elements.size());
        Iterator it = elements.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //element.isDisplayed(); //checking whether the elmnt is displayed
        //Assert.assertEquals(true,element.isDisplayed(),"element is not present");//if elmt displayed;it will give true
    }
    @AfterMethod
    void closebrowser()
    {
        driver.close();
    }
}
