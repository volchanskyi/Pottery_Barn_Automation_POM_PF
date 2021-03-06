package core;

import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    public static void validate(WebDriver driver, String url) {

	// PRE-CONDITIONS
	TestLogic.open(url);
	TestLogic.returnUrl();
	SignInPage.validate();
	// TC STARTS HERE

	// TestLogic.open(url);
	// TestLogic.validatePresElem("minimizeOverlay",
	// ObjectStorage.minimizeOverlay);
	// TestLogic.clickOn(ObjectStorage.minimizeOverlay);
	//
	// TestLogic.validatePresElem("stickyHeader",
	// ObjectStorage.stickyHeader);
	// TestLogic.clickOn(ObjectStorage.stickyHeader);

	// TestLogic.validateVisElem("addToCartBtn",
	// ObjectStorage.addToCartBtn);
	// TestLogic.scrollIntoView(ObjectStorage.breadcrumbList);
	// TestLogic.clickOn(ObjectStorage.addToCartBtn);
	//
	//
	// TestLogic.validateVisElem("checkoutBtn", ObjectStorage.checkoutBtn);
	// TestLogic.clickOn(ObjectStorage.checkoutBtn);
	TestLogic.validateVisElem("savedNameOfItemTextCheckout", ObjectStorage.savedNameOfItemTextCheckout);
	TestLogic.updateValidatedText(ObjectStorage.savedNameOfItemTextCheckout);
	TestLogic.validateVisElem("saveForLaterLink", ObjectStorage.saveForLaterLink);
	// TestLogic.scrollIntoView(ObjectStorage.breadcrumbList);
	TestLogic.clickOn(ObjectStorage.saveForLaterLink);
	
	TestLogic.scrollIntoView(ObjectStorage.mainNavMenu);
	TestLogic.validateVisElem("savedNumberOfItemText", ObjectStorage.savedNumberOfItemText);
	TestLogic.validateVisElem("savedNameOfItemTextShoppingCart", ObjectStorage.savedNameOfItemTextShoppingCart);
	TestLogic.validateText(Main.validatedText, TestLogic.getText(ObjectStorage.savedNameOfItemTextShoppingCart));
	TestLogic.validateQuantity("1", TestLogic.getText(ObjectStorage.quantityShopCart));
	System.out.println(
		"Test Case 06: PASSED (Item " + TestLogic.getText(ObjectStorage.savedNameOfItemTextShoppingCart)
			+ TestLogic.validateQuantity("1", TestLogic.getText(ObjectStorage.quantityShopCart))
			+ " exists in the saved items list)");
	
	TestLogic.clickOn(ObjectStorage.signOutLnk);
	TestLogic.returnUrl();
	TestLogic.quit();
    }
}
