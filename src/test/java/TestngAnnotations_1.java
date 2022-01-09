import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations_1 {
    @BeforeMethod
    void test()
    {
        System.out.println("Test");
    }
    @Test (priority=1)
    void test1()
    {
        System.out.println("Test1");
    }
    @Test
    void test2()
    {
        System.out.println("test2");
    }
    @AfterMethod
    void test3()
    {
        System.out.println("test3");
    }
}
