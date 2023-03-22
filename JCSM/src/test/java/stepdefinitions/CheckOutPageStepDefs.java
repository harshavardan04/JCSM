package stepdefinitions;

import context.Context;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.CheckOutPage;
import pages.PageFactory;

public class CheckOutPageStepDefs {
    private final CheckOutPage checkOutPage;

    public CheckOutPageStepDefs(Context context) {
        checkOutPage = PageFactory.getCheckOutPage(context.driver);
    }

    @And("User provides billing details {string},{string},{string},{string},{string},{string}")
    public void userProvidesBillingDetails(String fName, String lName, String address, String city, String zip, String email) throws InterruptedException {
        checkOutPage.firstName(fName).lastName(lName).houseAddress(address).city(city).zipCode(zip).email(email).placeOrder();
    }

}
