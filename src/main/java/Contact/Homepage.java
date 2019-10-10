package Contact;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends DriverManager
{
    public Homepage()
    {
        PageFactory.initElements(driver,this);


    }



    @FindBy(how = How.XPATH,using = "//div[@id='contact-link']//a[contains(text(),'Contact us')]")
    private WebElement contact_us_button;



    public void navigatesToAutomationPractisePage()
    {
        driver.get(url);
        Utils.waitForSomeTime();
    }

    public boolean contactUsButtonDisplay()
    {
        Utils.waitForSomeTime();
        Assert.assertTrue(contact_us_button.isDisplayed());
        return true;
    }

    public void clickOnTheContactUsButton()
    {
        contact_us_button.click();
        Utils.waitForSomeTime();

    }
}
