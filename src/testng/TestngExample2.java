package testng;

import org.testng.annotations.Test;

public class TestngExample2 {
	
	@Test(priority=3)
	public void test1(){
		System.out.println("Executing the testcase1");
	}
	
	@Test(priority=1)
	public void test2(){
		System.out.println("Executing the testcase2");
	}
	
	@Test(priority=2)
	public void test3(){
		System.out.println("Executing the testcase3");
	}

}
