package stepdefinitions;

import constants.EndPoints;
import context.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.PageFactory;
import pages.StorePage;

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
