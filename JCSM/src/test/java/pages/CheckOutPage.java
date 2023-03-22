package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "billing_first_name")
    private WebElement firstNameTextbox;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameTextbox;

    @FindBy(id = "billing_address_1")
    private WebElement houseaddressTextbox;

    @FindBy(id = "billing_city")
    private WebElement whichCityTextbox;

    @FindBy(id = "billing_postcode")
    private WebElement zipCodeTextbox;

    @FindBy(id = "billing_email")
    private WebElement billingEmailTextbox;

    @FindBy(id = "place_order")
    private WebElement placeOrderButton;

    public CheckOutPage firstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameTextbox)).sendKeys(firstName);
        return this;
    }

    public CheckOutPage lastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameTextbox)).sendKeys(lastName);
        return this;
    }

    public CheckOutPage houseAddress(String houseAddress) {
        wait.until(ExpectedConditions.elementToBeClickable(houseaddressTextbox)).sendKeys(houseAddress);
        return this;
    }

    public CheckOutPage city(String city) {
        wait.until(ExpectedConditions.elementToBeClickable(whichCityTextbox)).sendKeys(city);
        return this;
    }

    public CheckOutPage zipCode(String zipCode) {
        wait.until(ExpectedConditions.elementToBeClickable(zipCodeTextbox)).sendKeys(zipCode);
        return this;
    }

    public CheckOutPage email(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(billingEmailTextbox)).sendKeys(email);
        return this;
    }

    public CheckOutPage placeOrder() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
        } catch (ElementNotInteractableException ignored) {
            wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
        }

        return this;
    }

}
