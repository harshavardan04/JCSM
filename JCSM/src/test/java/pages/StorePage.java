package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.xml.xpath.XPath;

public class StorePage extends BasePage {


    public StorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "((//div[@class='astra-shop-summary-wrap'])[5]//a)[2]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@title='View cart']")
    private WebElement viewCartLink;

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']/a")
    private WebElement proceedToCheckOutButton;

    public StorePage addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        return this;
    }

    public StorePage viewCart() {
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
        return this;
    }

    public StorePage proceedToCheckOut() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckOutButton)).click();
        return this;
    }
}
