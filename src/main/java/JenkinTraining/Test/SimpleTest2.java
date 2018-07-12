package JenkinTraining.Test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTest2 {
	
	@Test
	public void multiple(){
	
	int a =5, b = 6;
	int c = a*b;
	
	Assert.assertEquals(c, 30);
	//print out the result
	System.out.println("After multiply Expected and Actual matched ");
	 }
	
	@Test
	public void add(){
	
	int a =5, b = 6;
	int c = a+b;
	
	Assert.assertEquals(c, 11);
	//print out the result
	System.out.println("After addition Expected and Actual matched ");
	 }
	
	@Test
	public void substract(){
	
	int a =5, b = 6;
	int c = b-a;
	
	Assert.assertEquals(c, 1);
	//print out the result
	System.out.println("After Substraction Expected and Actual matched ");
	 }

}
