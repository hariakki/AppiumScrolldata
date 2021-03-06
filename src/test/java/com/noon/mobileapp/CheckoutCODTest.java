package com.noon.mobileapp;

import com.noon.mobileapp.pages.*;
import dtos.catalog.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.ProductService;
import com.noon.mobileapp.base.BaseTest;


public class CheckoutCODTest extends BaseTest {
	
	String testName="CheckoutCODTest";
	
	@Test
	public void checkoutCodTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the checkout in test");

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";

		emptyCart(userName,password);
        launchApp();
        allowAppPermission();

		SearchPage searchPage = new SearchPage(aDriver,test);
		SigninPage signinPage = new SigninPage(aDriver,test);
		ProductPage productPage = new ProductPage(aDriver,test);
		CheckoutPage checkoutPage = new CheckoutPage(aDriver,test);
		CartPage cartPage = new CartPage(aDriver,test);
        TopMenuPage topMenuPage = new TopMenuPage(aDriver,test);

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),checkoutPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),cartPage);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),productPage);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),topMenuPage);


		ProductService productService = new ProductService();
		Page page = productService.getProduct("Toy");

		String searchText = page.getName();

        signinPage.signinWithEmail(userName,password);
        searchPage.search(searchText);
        productPage.addProductToCart();

        cartPage.checkout();
		checkoutPage.checkoutDefaultAddress();
        checkoutPage.checkoutCod();

//        topMenuPage.gotoHome();
//        topMenuPage.gotoCart();
//        cartPage.removeFromCart();
//        cartPage.verifyCartIsEmpty();

		test.log(LogStatus.INFO, "Checkout test passed");
	}
}	
