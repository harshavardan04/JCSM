package stepdefinitions;

import constants.EndPoints;
import context.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagefactorymanager.PageFactory;
import pages.StorePage;

public class StorePageStepDefs {
    private final StorePage storePage;

    public StorePageStepDefs(Context context) {
        storePage = PageFactory.getStorePage(context.driver);
    }

    @Given("user is on store page")
    public void userIsOnStorePage() {
        storePage.launch(EndPoints.STORE.url);
    }

    @When("User checkout a {string}")
    public void userCheckoutA(String arg0) throws InterruptedException {
        storePage.addToCart().viewCart().proceedToCheckOut();
    }

    @When("user adds {string} to the cart")
    public void userAddsToTheCart(String arg0) throws InterruptedException {
        storePage.addToCart().viewCart();
    }

}
