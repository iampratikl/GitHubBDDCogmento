package comStepDifination;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

	LoginPage lp;

	@Given("user is on homepage with browserName {string}")
	public void user_is_on_homepage_with_browser_name(String BrowserName) {
		BaseClass.intialize(BrowserName);
	}
	@When("user Enter valid Credentials")
	public void user_enter_valid_credentials() {
		lp = new LoginPage();
		lp.ValidateLoginFunctionality();
	}
	@Then("user click on LoginBtn")
	public void user_click_on_login_btn() {
	  lp.ValidateLoginBtn();
	}
	
}
