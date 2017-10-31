package core;

import org.openqa.selenium.WebDriver;

public class ItemListPage {

    public static void validate(WebDriver driver, String url) {

	//PRE-CONDITIONS
		TestLogic.open(url);
		TestLogic.returnUrl();
		
		SignInPage.validate();
		//TC STARTS HERE

	TestLogic.validatePresElem("firstItem", ObjectStorage.firstItem);
	System.out.println("Test Case 05: PASSED (" + TestLogic.getText(ObjectStorage.firstItem) + " is exists)");
	TestLogic.clickOn(ObjectStorage.firstItem);
	TestLogic.returnUrl();
	TestLogic.quit();
    }
}
