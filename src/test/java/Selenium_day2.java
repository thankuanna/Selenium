import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_day2 {
    @Test
    void navigation()
    {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //getting the url
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
        driver.manage().window().maximize();

        //Title of the page
        String title = driver.getTitle();
        System.out.println("page title =" + title);
        driver.navigate().to("https://toolsqa.com/selenium-training");
        System.out.println("page title =" +driver.getTitle());
        driver.navigate().back();
        System.out.println("page title =" +driver.getTitle());
        driver.navigate().forward(); // doubt
        System.out.println("page title =" +driver.getTitle());
        driver.navigate().refresh();
        System.out.println("page title ="+driver.getTitle());
        driver.close();
    }
}
