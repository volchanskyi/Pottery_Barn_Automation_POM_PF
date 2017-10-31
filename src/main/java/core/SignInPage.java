package core;

public class SignInPage {

    public static void validate() {

	// TestLogic.open(url);
	TestLogic.validateVisElem("emailAddr", ObjectStorage.emailAddr);
	TestLogic.clickOn(ObjectStorage.emailAddr);
	TestLogic.validateVisElem("emailAddr", ObjectStorage.emailAddr);
	TestLogic.typeInTxtFld(ObjectStorage.emailAddr, ObjectStorage.getTestDataKey("testUserEmail"));
	TestLogic.clickOn(ObjectStorage.joinNow);
	TestLogic.validateVisElem("cancelEmailForm", ObjectStorage.cancelEmailForm);
	TestLogic.clickOn(ObjectStorage.cancelEmailForm);

	// TestLogic.validateVisElem("stickyHeader",
	// ObjectStorage.stickyHeader);
	// TestLogic.clickOn(ObjectStorage.stickyHeader);

	TestLogic.validateVisElem("myAccBtn", ObjectStorage.myAccBtn);
	TestLogic.mouseOverOn(ObjectStorage.myAccBtn);
	TestLogic.clickOn(ObjectStorage.myAccBtn);


	TestLogic.validateVisElem("emailTxtFld", ObjectStorage.emailTxtFld);
	TestLogic.clearOutTxtFld(ObjectStorage.emailTxtFld);
	TestLogic.typeInTxtFld(ObjectStorage.emailTxtFld, ObjectStorage.getTestDataKey("testUserEmail"));

	TestLogic.validateVisElem("pwdTxtFld", ObjectStorage.pwdTxtFld);
	TestLogic.clearOutTxtFld(ObjectStorage.pwdTxtFld);
	TestLogic.typeInTxtFld(ObjectStorage.pwdTxtFld, ObjectStorage.getTestDataKey("testUserPassword"));

	TestLogic.validateVisElem("logInBtn", ObjectStorage.logInBtn);
	TestLogic.clickOn(ObjectStorage.logInBtn);
	//

	TestLogic.navigateToUrl();
	// TestLogic.quit();
    }
}
