package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngExample1 {
	
	@BeforeTest
	
	public void beforetest(){
		
		System.out.println("Before test is executed");
	}
	
	@BeforeClass
	
	public void beforeclass(){
		
		System.out.println("Before class is executed");
	}
	
	@BeforeMethod
	
	public void beforemethod(){
		
		System.out.println("Before method is executed");
	}
	
	@Test
	
	public void test1(){
		System.out.println("Test1 is executed");
	}
	
	@Test
	
	public void test2(){
		System.out.println("Test2 is executed");
	}
	@AfterMethod
	
	public void aftermethod(){
		
		System.out.println("Aftermethid is executed");
	}
	
	@AfterClass
	
	public void afterclass(){
		System.out.println("After class is executed");
	}
	
	@AfterTest
	
	public void aftertest(){
		
		System.out.println("After test is executed");
	}

}
