package com.noon.mobileapp.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SigninPage extends BasePage {

	public SigninPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	@FindBy(xpath=NConstants.SIGN_IN_LINK)
	public AndroidElement signinLink;
	
	@FindBy(xpath=NConstants.SIGN_IN_TAB)
	public AndroidElement signinTab;
	
	@FindBy(xpath=NConstants.SIGNIN_WITH)
	public AndroidElement signinWith;
	
	@FindBy(xpath=NConstants.SIGNIN_DETAILS)
	public AndroidElement  signinDetails;
	
	@FindBy(xpath=NConstants.GOOGLE_BUTTON)
	public AndroidElement googleButton;
	
	@FindBy(xpath=NConstants.GOOGLE_SIGNIN)
	public AndroidElement googleSingin;
	
	@FindBy(xpath=NConstants.SIGNIN_EMAIL)
	public AndroidElement signinEmail;
	
	@FindBy(className=NConstants.MOBILE_NUMBER_LINK)
	public AndroidElement mobileNumberLink;
	
	@FindBy(xpath=NConstants.EMAIL_LINK)
	public AndroidElement emailLink;
	
	@FindBy(xpath=NConstants.PASSWORD_TAB)
	public AndroidElement passwordTab;
	
	@FindBy(xpath=NConstants.SIGNIN_PASSWORD)
	public AndroidElement signinPassword;
	
	@FindBy(xpath=NConstants.SIGNIN_BUTTON)
	public AndroidElement signinButton;
	
    @FindBy(xpath=NConstants.MY_ACCOUNT)
    public AndroidElement myAccount;
    
    @FindBy(xpath=NConstants.MY_ORDERS)
    public String myOrders;
    
    @FindBy(xpath=NConstants.RETURN_EXCHANGE)
    public String returnExchange;
    
    @FindBy(xpath=NConstants.ADDRESS_BOOK)
    public String addressBook;
    
    @FindBy(xpath=NConstants.WALLET)
    public String wallet;
    
    @FindBy(xpath=NConstants.MY_PROFILE)
    public WebElement myProfile;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_IMAGE)
    public WebElement myProfileUserImage;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_NAME)
    public WebElement myProfileUserName;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_EMAIL)
    public WebElement MyprofileUserEmail;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_PASSWORD)
    public WebElement myProfileUserPassword;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD)
    public WebElement myProfileUserFragmentPassword;

    @FindBy(xpath=NConstants.MY_PROFILE_USER_SIGNOUT)
    public WebElement myProfileUserSignout;

    @FindBy(xpath=NConstants.MENU_HOME)
    public AndroidElement navigationMenuHome;

    @FindBy(xpath=NConstants.SIGN_IN_MAIN)
    public AndroidElement signinMain;

	public void signinWithEmail(String userName, String userPassword) throws InterruptedException {
		
		test.log(LogStatus.INFO, "Launch Android Application - ");
		WebDriverWait wait = new WebDriverWait(aDriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
//		test.log(LogStatus.INFO, "Selecting home button from navigation menu");
//		navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_MAIN)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_MAIN), "Could not find sign in link");
        signinMain.click();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_TAB)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_TAB), "Could not find sign in tab");
		signinTab.click();

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.EMAIL_LINK)));
//		emailLink.click();
		
//		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_WITH), "Could not find signin with text");
//		Assert.assertTrue(isElementPresent(NConstants.FACEBOOK_BUTTON), "Could not find facebook button");
//		Assert.assertTrue(isElementPresent(NConstants.TWITTER_BUTTON), "Could not find twitter button");
//		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_DETAILS), "Could not find Or sign in with your details text");
//		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_EMAIL), "Could not find email address input field");
//		Assert.assertTrue(isElementPresent(NConstants.MOBILE_NUMBER_LINK), "Could not find mobile number link");
//		Assert.assertTrue(isElementPresent(NConstants.PASSWORD_VIEW_IMAGE), "Could not find password image ");
//		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_PASSWORD), "Could not find passowrd input field");
//		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_BUTTON), "Could not find Sign in button");
//		Assert.assertTrue(isElementPresent(NConstants.FORGOT_PASSWORD), "Could not find forgot password link");
		/*googleButton.click();
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GOOGLE_SIGNIN)));
		googleSingin.click();*/

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_EMAIL)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_EMAIL), "Could not find email address field");
		signinEmail.sendKeys(userName);
		aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_PASSWORD)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_PASSWORD), "Could not find password field");
		signinPassword.sendKeys(userPassword);
		aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_BUTTON)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_BUTTON), "Could not find Sign in button");
		signinButton.click();

		
//		wait = new WebDriverWait(aDriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS)));
//		Assert.assertTrue(isElementPresent(NConstants.MY_ORDERS), "Could not find My Orders section");
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
//        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account button");
////          myAccount.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MENU_HOME)));
//        Assert.assertTrue(isElementPresent(NConstants.MENU_HOME), "Could not find HOME button");

		


	}

	public void logout(){

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
//        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find Menu button");
//        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
		Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find side menu home button");
        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account in button");
        myAccount.click();

        super.swipeToElement(NConstants.MY_PROFILE);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE)));
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE), "Could not find my profile text");
        myProfile.click();

//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_IMAGE), "Could not find user image");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_NAME), "Could not find user name text");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_EMAIL), "Could not find user email text");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_PASSWORD), "Could not find user password text");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD), "Could not find user framgement password text");
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_SIGNOUT), "Could not sign out button");
        myProfileUserSignout.click();

    }
	
}