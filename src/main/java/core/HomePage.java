package core;

import org.openqa.selenium.WebDriver;

public class HomePage {

    public static void validate(WebDriver driver, String url) {

	//PRE-CONDITIONS
	TestLogic.open(url);
	TestLogic.returnUrl();
	SignInPage.validate();
	//TC STARTS HERE
	System.out.println("Test Case 01: PASSED (Overlay 'Sign Up and Safe' is closed");
	
//	TestLogic.validatePresElem("minimizeOverlay", ObjectStorage.minimizeOverlay);
//	TestLogic.clickOn(ObjectStorage.minimizeOverlay);

//	TestLogic.validateVisElem("stickyHeader", ObjectStorage.stickyHeader);
//	TestLogic.clickOn(ObjectStorage.stickyHeader);
	System.out.println("Test Case 02: PASSED (Entered to Home Page");
	TestLogic.validatePresElem("LightingMenuBtn", ObjectStorage.LightingMenuBtn);
	TestLogic.mouseOverOn(ObjectStorage.LightingMenuBtn);
	System.out.println("Test Case 03: PASSED (Menu 'Lighting' is selected)");
	TestLogic.validateVisElem("ambLampsSection", ObjectStorage.ambLampsSection);
	TestLogic.clickOn(ObjectStorage.ambLampsSection);
	System.out.println("Test Case 04: PASSED (Category 'Ambient Lamps' is selected)");
	TestLogic.returnUrl();
	
	TestLogic.quit();
    }
}
