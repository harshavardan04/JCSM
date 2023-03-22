package pagefactorymanager;

import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.CheckOutPage;
import pages.StorePage;
import pages.ThankYouPage;

public class PageFactory {
    private static StorePage storePage;
    private static CartPage cartPage;
    private static CheckOutPage checkOutPage;
    private static ThankYouPage thankYouPage;

    public static StorePage getStorePage(WebDriver driver) {
        return storePage == null ? new StorePage(driver) : storePage;
    }

    public static CartPage getCartPage(WebDriver driver) {
        return cartPage == null ? new CartPage(driver) : cartPage;
    }

    public static CheckOutPage getCheckOutPage(WebDriver driver) {
        return checkOutPage == null ? new CheckOutPage(driver) : checkOutPage;
    }

    public static ThankYouPage getThankYouPage(WebDriver driver) {
        return thankYouPage == null ? new ThankYouPage(driver) : thankYouPage;
    }
}
