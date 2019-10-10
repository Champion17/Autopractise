package Contact;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contactpage extends DriverManager
{
    public Contactpage()
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.ID,using = "id_contact")
    private WebElement select_subject_heading;

    @FindBy(how = How.ID,using = "email")
    private WebElement email_address;

    @FindBy(how = How.ID,using = "id_order")
    private WebElement  order_ref_number;

    @FindBy(how = How.ID,using = "message")
    private WebElement message_feild;

    @FindBy(how = How.ID,using = "submitMessage")
    private WebElement submit_button;

    @FindBy(how = How.XPATH,using = "//p[@class='alert alert-success']")
    private WebElement successfull_message;


    public boolean landedOnTheContactUsPage(){

        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("CUSTOMER SERVICE - CONTACT US"));
        return true;
    }

    public void selectCustomerServiceOption()
    {
        Select select_customerService = new Select(select_subject_heading);
        select_customerService.selectByVisibleText("Customer service");
        Utils.waitForSomeTime();

    }

    public void enterEmailAddress()
    {
        email_address.sendKeys("test@test.com");
        Utils.waitForSomeTime();
    }

    public void enterRefNumber()
    {
        order_ref_number.sendKeys("123456");
        Utils.waitForSomeTime();

    }

    public void writeCustomerMessage()
    {
        message_feild.sendKeys("Testing In Progress");
        Utils.waitForSomeTime();
    }

    public void clickOnTheSubmitButton()
    {
        submit_button.click();
        Utils.waitForSomeTime();

    }

    public boolean successfullMessageDisplay(){

        Assert.assertTrue(successfull_message.isDisplayed());
        return true;
    }

}
