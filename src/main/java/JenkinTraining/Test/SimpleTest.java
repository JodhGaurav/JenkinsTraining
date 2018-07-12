package JenkinTraining.Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
	
	@Test
	public void testgooglesearch(){
	
	System.setProperty("webdriver.chrome.driver","D:\\DSTC\\DoJo\\Utilities\\src\\main\\resources\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//it will open the goggle page
	driver.get("http://www.google.com"); 
	
	//we expect the title “Google “ should be present 
	String Expectedtitle = "Google";
	
	//it will fetch the actual title 
	String Actualtitle = driver.getTitle();
	
	System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
	//it will compare actual title and expected title
	
	Assert.assertEquals(Actualtitle, Expectedtitle);
	//print out the result
	System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
	 }

}
