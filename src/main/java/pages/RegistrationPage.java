package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegistrationPage {
	WebDriver driver;
	private ElementUtils elementUtils;
	
public  RegistrationPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
		
	}

@FindBy(id="firstName")
private WebElement firstName;

@FindBy(id="lastName")
private WebElement lastName;

@FindBy(id="userEmail")
private WebElement userEmail;

@FindBy(xpath="//label[contains(text(),'Male')]")
private WebElement male;

@FindBy(xpath="//label[contains(text(),'Female')]")
private WebElement feMale;

@FindBy(xpath="//label[contains(text(),'Other')]")
private WebElement Others;

@FindBy(id="userNumber")
private WebElement phoneNumber;

@FindBy(xpath="//*[contains(@class,'react-datepicker__year-select')]")
private WebElement year;

@FindBy(xpath="//*[contains(@class,'react-datepicker__month-select')]")
private WebElement month;






@FindBy(id="dateOfBirthInput")
private WebElement dateOfBirth;

@FindBy(id="subjectsContainer")
private WebElement subjects;
////

@FindBy(xpath="//label[contains(text(),'Sports')]")
private WebElement sports;

@FindBy(xpath="//label[contains(text(),'Reading')]")
private WebElement reading;

@FindBy(xpath="//label[contains(text(),'Music')]")
private WebElement music;

@FindBy(id="uploadPicture")
private WebElement uploadPicture;

@FindBy(id="currentAddress")
private WebElement currentAddress;

@FindBy(xpath="//div[contains(text(),'Select State')]")
private WebElement state;

@FindBy(id="city")
private WebElement city;

@FindBy(id="submit")
private WebElement submit;

/*
public void fillForm(String FirstName,String  LastName,String mailAddress ,String gender,String number , String dob) throws InterruptedException {
	 
	elementUtils.javaScriptType(firstName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, FirstName);
	elementUtils.javaScriptType(lastName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, LastName);
	elementUtils.typeTextIntoElement(userEmail, mailAddress, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	if(gender.equalsIgnoreCase("Male")) {
		elementUtils.clickOnElement(male, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}else if(gender.equalsIgnoreCase("feMale")){
		elementUtils.clickOnElement(feMale, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}else {
		elementUtils.clickOnElement(Others, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	elementUtils.javaScriptType(phoneNumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, number);
	//elementUtils.typeTextIntoElement(phoneNumber, number, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	elementUtils.javaScriptClick(dateOfBirth, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	elementUtils.selectOptionInDropdown(month, "July",CommonUtils.EXPLICIT_WAIT_BASIC_TIME );
	elementUtils.selectOptionInDropdown(year, "2002", CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	
	 
			
	
	 
}

 */
public void enterFirstName(String FirstName) {
	//elementUtils.typeTextIntoElement(firstName, FirstName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	elementUtils.javaScriptType(firstName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, FirstName);
}

public void enterLastName(String LastName) {
	//elementUtils.typeTextIntoElement(lastName, LastName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	
	elementUtils.javaScriptType(lastName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, LastName);
}

public void enterEmail(String mailAddress) {
	//elementUtils.typeTextIntoElement(userEmail, mailAddress, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	elementUtils.javaScriptType(userEmail, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, mailAddress);
}

public void selectGender(String gender) {
	if(gender.equalsIgnoreCase("Male")) {
		//elementUtils.clickOnElement(male, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.javaScriptClick(male, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}else if(gender.equalsIgnoreCase("feMale")){
		elementUtils.javaScriptClick(feMale, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//elementUtils.clickOnElement(feMale, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}else {
		elementUtils.javaScriptClick(Others, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	//	elementUtils.clickOnElement(Others, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	//elementUtils.clickOnElement(male, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	
}

public void enterMobileNumber(String number) {
	//elementUtils.typeTextIntoElement(phoneNumber, number, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	elementUtils.javaScriptType(phoneNumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, number);
	
	
}

public void pickDateOfBirth(String date) throws InterruptedException   {
	elementUtils.javaScriptClick(dateOfBirth, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	 
//	elementUtils.clickOnElement(dateOfBirth, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	 
	 String[] dataports = date.split(" ");
	 System.out.println(dataports.length);
	 System.out.println(Arrays.toString(dataports));
	  
	 
	 String dayvalue = dataports[0];
	 
	 String monthvalue = dataports[1];
	 
	String yearvalue = dataports[2];
	elementUtils.selectOptionInDropdown(month, monthvalue,CommonUtils.EXPLICIT_WAIT_BASIC_TIME );
	elementUtils.selectOptionInDropdown(year, yearvalue,CommonUtils.EXPLICIT_WAIT_BASIC_TIME );
	WebElement day = driver.findElement(By.xpath("//div[text()='" + dayvalue + "']"));

	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", day);
	 
	 
}
public void selectSports(String hobbies) {
	 if(hobbies.equalsIgnoreCase("sports")) {
 	elementUtils.javaScriptClick(sports, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	
}else if(hobbies.equalsIgnoreCase("Reading")) {
	elementUtils.javaScriptClick(reading, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	
}else {
	elementUtils.javaScriptClick(music, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
	 
	
}

 
}
 
 
 


 










