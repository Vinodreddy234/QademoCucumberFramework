package stepdefinations;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utils.CommonUtils;

public class Register {
	WebDriver driver;
	HomePage homepage;
	private CommonUtils commonUtils;
	
	 public Register() {
	        this.commonUtils = new CommonUtils();  
	    }

	 
	 
	
	@Given("User opens the Application")
	public void user_opens_the_application() {
		
		driver = DriverFactory.getDriver();
	}

	@When("User clicks on BookStoreApplication")
	public void user_clicks_on_book_store_application()   {
		 homepage= new HomePage(driver);
		homepage.clickOnBookStoreApi();
	 
	   
	}

	
	@And("User enter userName as {string} password as {string}")
	public void user_enter_user_name_as_password_as(String string, String string2) {
		homepage.enterUserNameAndPassword(string, string2);
		
	    
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException  {
		homepage.clickOnLogin();
		Thread.sleep(5000);
	 
	  
	}

	@When("User should be Logged in")
	public void user_should_be_logged_in() {
		
		Assert.assertEquals(homepage.VerifyUsersUserName(), "Kumar");
	    
	}

	 

	
	@And("User clicks on newUser button")
	public void user_clicks_on_new_user_button() {
		homepage.clickOnNewUser();
	 
	}

	@And("User enter firstname as {string} and lastname as {string}")
	public void user_enter_firstname_as_and_lastname_as(String string, String string2) {
	  
	}

	@And("User Enter username")
	public void user_enter_username() {
	 
	}

	@And("User enter password {string}")
	public void user_enter_password(String string) {
	    
	}

	@And("User select capta")
	public void user_select_capta() {
	   
	}

	@And("User clicks on register button")
	public void user_clicks_on_register_button() {
	  
	}

	@Then("User Sucessfully got registered")
	public void user_sucessfully_got_registered() {
	    
	}
	
	
	///userRegistration
	@When("User clicks on Forms")
	public void user_clicks_on_forms() {
		 homepage= new HomePage(driver);
		 homepage.clicksOnformsLink();
		
	   
	}
	@When("User clicks on practiceForm")
	public void user_clicks_on_practice_form() {
		homepage.clicksOnPracticeForm();
	    
	}

	@When("User enters details below fields")
	public void user_enters_details_below_fields( DataTable dataTable) throws InterruptedException{
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		RegistrationPage registrationPage= new RegistrationPage(driver);
		//registrationPage.fillForm(dataMap.get("firstName"), dataMap.get("lastName"), commonUtils.getEmailWithTimeStamp(),dataMap.get("gender"),dataMap.get("mobileNumber"));
		
			registrationPage.enterFirstName(dataMap.get("firstName"));
		
		registrationPage.enterLastName(dataMap.get("lastName"));
	 
		registrationPage.enterEmail(commonUtils.getEmailWithTimeStamp());
		registrationPage.selectGender(dataMap.get("gender"));
		registrationPage.enterMobileNumber(dataMap.get("mobileNumber"));
		registrationPage.pickDateOfBirth(dataMap.get("dataOfBirth"));
	//	registrationPage.selectSubjects(dataMap.get("subjects"));
		registrationPage.selectSports(dataMap.get("hobbies"));
		 
		 
		
	  
	}
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	  
	}

	@Then("User sucessfully registred")
	public void user_sucessfully_registred() {
	  
	}


}
