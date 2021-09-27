package pageobjects;

import io.qameta.allure.Step;

public class HelloWorld {

	@Step("Greetings")
	public void greeting (String test) {
		System.out.println("Hello world " + test);
	}

}