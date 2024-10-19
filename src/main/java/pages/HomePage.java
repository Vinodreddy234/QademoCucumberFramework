package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public  HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
		
	}

	@FindBy(xpath="//*[contains(text(),'Book Store Application')]")
	private WebElement bookStoreApplication;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	
	@FindBy(id="newUser")
	private WebElement newUser;
	
	@FindBy(id="firstname")
	private WebElement firstname;
	
	@FindBy(id="lastname")
	private WebElement lasname;
	
	@FindBy(id="userName")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="userName-value")
	private WebElement ActualUserName;
	
	@FindBy(id="recaptcha-anchor")
	private WebElement capthca;
	
	@FindBy(id="register")
	private WebElement register;
	
	//user register
	
	@FindBy(xpath="//*[contains(text(),'Forms')]")
	private WebElement formslink;
	
	@FindBy(xpath="//*[contains(text(),'Practice Form')]")
	private WebElement practiceForm;
	
	
	
	
	public void clickOnBookStoreApi() {
		elementUtils.javaScriptClick(bookStoreApplication, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	
	
	public void enterUserNameAndPassword(String username, String Password) {
		elementUtils.typeTextIntoElement(userName, username, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.typeTextIntoElement(password, Password, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
		
	}
	
	public void  clickOnLogin() {
		elementUtils.javaScriptClick(login, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String VerifyUsersUserName() {
		String userNames = elementUtils.getTextFromElement(ActualUserName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return  userNames;
	}
	
	public void clickOnNewUser() {
		
	}
	
	
	//userRegistration
	
	public void clicksOnformsLink() {
		elementUtils.javaScriptClick(formslink, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		 
	}
	
	public void clicksOnPracticeForm() {
		elementUtils.javaScriptClick(practiceForm, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		 
		
	}
	
	
	

	
}
