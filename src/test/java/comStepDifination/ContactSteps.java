package comStepDifination;

import com.Baselayer.BaseClass;
import com.PageLayer.AddContact;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactSteps extends BaseClass{
	
	AddContact a1;
	@Given("user will on homepage")
	public void user_will_on_homepage() {
		
	   a1=new AddContact();
	   a1.validatehomev();
	}
	@When("user clicked on addcontact")
	public void user_clicked_on_addcontact() {
	    
		a1.AddContactFunctionality();
	}
	@When("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
	    
	}
	@When("user select social channel as {string}")
	public void user_select_social_channel_as(String string) {
	   
	}
	@Then("user is click on save button")
	public void user_is_click_on_save_button() {
	    
	}
}
