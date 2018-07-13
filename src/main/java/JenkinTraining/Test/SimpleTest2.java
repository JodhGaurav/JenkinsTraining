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
	
	@Test
	public void divide(){
	
	int a =5, b = 6;
	int c = b-a;
	
	Assert.assertEquals(c, 1);
	//print out the result
	System.out.println("After Substraction Expected and Actual matched ");
	 }
	
	@Test
	public void SquareNumber(){
	
	int a =5;
	int b = a*a;
	
	Assert.assertEquals(b, 25);
	//print out the result
	System.out.println("After squaring the number Expected and Actual matched ");
	 }
	
	@Test
	public void squareNumberAdd(){
	
	int a =5, b = 6;
	int c = (a*a) + (b*b);
	
	Assert.assertEquals(c, 60);
	//print out the result
	System.out.println("After adding square of the 2 number Expected and Actual matched ");
	 }
	
	@Test
	public void squareNumberSub(){
	
	int a =5, b = 6;
	int c = (b*b) - (a*a);
	
	Assert.assertEquals(c, 11);
	//print out the result
	System.out.println("After substracting square of the 2 number Expected and Actual matched ");
	 }
	
	@Test
	public void CubeNumber(){
	
	int a = 5;
	int b = 5*5*5;
	
	Assert.assertEquals(b, 125);
	//print out the result
	System.out.println("Cube: Expected and Actual matched ");
	 }

}
