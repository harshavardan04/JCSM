package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ThankYouPage extends BasePage {
    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='woocommerce-order']/p")
    private WebElement statusText;

    public String thankYouText() {
        return wait.until(ExpectedConditions.elementToBeClickable(statusText)).getText();
    }
}
