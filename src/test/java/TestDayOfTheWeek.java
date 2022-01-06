import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDayOfTheWeek {
	@Test
	public static void test1()
	{
		int test_data =0;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Invalid Entry";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry"); //method overloading
	}

	public static void test2()
	{
		int test_data =1;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Sunday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");  //method overloading
	}
	public static void test3()
	{
		int test_data =2;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Monday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");  //method overloading
	}

	public static void test4()
	{
		int test_data =3;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Tuesday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");  //method overloading
	}
	public static void test5()
	{
		int test_data =4;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Wedneday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");  //method overloading
	}

	public static void test6()
	{
		int test_data =5;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Thursday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");
	}
	public static void test7()
	{
		int test_data =6;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Friday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");
	}
	public static void test8()
	{
		int test_data =7;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Saturday";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");
	}
	public static void test9()
	{
		int test_data =8;
		DaysOfTheWeek obj = new DaysOfTheWeek();
		String actual_result = obj.getDay(test_data);
		String Expected = "Invalid Entry";
		Assert.assertEquals(actual_result,Expected,"Invalid Entry");
	}
	/*public static void main(String args[])
	{
		test1();
	}*/

	/* 1. Test case '0'
	 * Expected Result: "Invalid Entry"
	 */
	
	/*2 to 8 Test case '1' to '7'
	     Expected Result: "Show corresponding dates"
	 */
	
	/* 3. Test case '8'
	 * Expected Result : "Invalid Entry'
	 */
	
	/* 4. Test case '111111111111111111111111111111111111111111111111111111111'
	 * Expected Result : "Invalid Entry"
	 */
	
	/* 5. Test case ' '
	 * Expected Result : "Invalid Entry"
	 */
}
