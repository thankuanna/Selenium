import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations_1 {
    @BeforeMethod
    void bm()
    {
        System.out.println("This is test before method");
    }

    @Test(priority = 0)
    void test2()
    {
        System.out.println("Test2....");
    }
    @Test(priority = 1)
    void test1()
    {
        System.out.println("Test1......");
    }

    @Test(enabled = false)
    void test3()
    {
        System.out.println("test3.....");
    }
    @AfterMethod
    void am()
    {
        System.out.println("this is the test after method ");
    }
}
