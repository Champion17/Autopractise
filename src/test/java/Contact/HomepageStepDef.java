package Contact;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageStepDef extends DriverManager
{
    Homepage hp = new Homepage();


    @Given("^user navigates to Automation practise page$")
    public void user_navigates_to_Automation_practise_page()
    {
        hp.navigatesToAutomationPractisePage();
    }


    @Then("^user should be on the Automation practise home page$")
    public void user_should_be_on_the_Automation_practise_home_page()
    {
        Assert.assertTrue(hp.contactUsButtonDisplay());
    }
    @When("^user clicks on the contact us button$")
    public void user_clicks_on_the_contact_us_button()
    {
        hp.clickOnTheContactUsButton();
    }
}
