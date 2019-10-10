package Contact;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactStepDef extends DriverManager
{
    Contactpage cp = new Contactpage();

    @Then("^user should be on the contact us page$")
    public void user_should_be_on_the_contact_us_page()
    {
        Assert.assertTrue(cp.landedOnTheContactUsPage());
    }
    @When("^user selects customer service on the subject heading$")
    public void user_selects_customer_service_on_the_subject_heading()
    {
        cp.selectCustomerServiceOption();
    }

    @When("^user enters the valid email$")
    public void user_enters_the_valid_email()
    {
         cp.enterEmailAddress();
    }

    @When("^user enters the order reference number$")
    public void user_enters_the_order_reference_number()
    {
        cp.enterRefNumber();
    }

    @When("^user types the message$")
    public void user_types_the_message()
    {
        cp.writeCustomerMessage();
    }

    @When("^user clicks the send button$")
    public void user_clicks_the_send_button()
    {
        cp.clickOnTheSubmitButton();
    }

    @Then("^user should receive the successfull message$")
    public void user_should_receive_the_successfull_message()
    {
        Assert.assertTrue(cp.successfullMessageDisplay());
    }





}
