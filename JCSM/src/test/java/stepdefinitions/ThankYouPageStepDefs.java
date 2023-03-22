package stepdefinitions;

import context.Context;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pagefactorymanager.PageFactory;
import pages.ThankYouPage;

public class ThankYouPageStepDefs {

    private final ThankYouPage thankYouPage;

    public ThankYouPageStepDefs(Context context) {
        thankYouPage = PageFactory.getThankYouPage(context.driver);
    }

    @Then("user should see order is placed successfully")
    public void userShouldSeeOrderIsPlacedSuccessfully() throws InterruptedException {
        Assert.assertEquals("Thank you text is not displayed", thankYouPage.thankYouText(), "Thank you. Your order has been received.");
    }
}
