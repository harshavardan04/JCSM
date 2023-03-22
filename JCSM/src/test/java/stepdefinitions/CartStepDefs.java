package stepdefinitions;

import context.Context;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CartPage;
import pagefactorymanager.PageFactory;

public class CartStepDefs {
    private final CartPage cartPage;

    public CartStepDefs(Context context) {
        cartPage = PageFactory.getCartPage(context.driver);
    }

    @Then("User see {string} is added in the cart")
    public void userSeeIsAddedInTheCart(String product_name) {
        Assert.assertEquals("Product name is not matched", cartPage.getProductNameText(), product_name);
    }
}
