package testcases;

import org.testng.annotations.Test;

import org.testng.Assert;
import pageobjects.HelloWorld;

public class Test2 {
	@Test(groups = "MvnTest", description = "Test2")
	public void test() {

		HelloWorld hello = new HelloWorld();
		hello.greeting(this.getClass().getSimpleName());
		Assert.assertTrue(true);
	}

}
