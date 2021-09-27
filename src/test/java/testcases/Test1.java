package testcases;


import org.testng.annotations.Test;

import org.testng.Assert;
import pageobjects.HelloWorld;

public class Test1 {
	@Test(groups = "MvnTest", description = "Test1")
	public void test() {

		HelloWorld hello = new HelloWorld();
		hello.greeting(this.getClass().getSimpleName());
		Assert.assertTrue(true);
	}

}
