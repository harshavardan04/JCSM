package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@class='product-name']/a")
    private WebElement productNameText;

    public String getProductNameText() {
        return wait.until(ExpectedConditions.elementToBeClickable(productNameText)).getText();
    }
}
