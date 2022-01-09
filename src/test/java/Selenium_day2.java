import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_day2 {
    @Test
    void pageSource ()
    {
        //opening chrome browser
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //getting the url or navigate to url
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");

        //page
        String title = driver.getTitle();
        System.out.println(title);
       driver.navigate().to("https://toolsqa.com/selenium-training"); //going back from 1 url to
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.close();
    }
}
