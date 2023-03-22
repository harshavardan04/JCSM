package hooks;

import context.Context;
import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utilities.LoadConfig;
public class Hooks {
    private WebDriver driver;
    private Context context;

    public Hooks(Context context) {
        this.context = context;
    }

    @Before
    public void before(Scenario scenario) {
        driver = DriverFactory.driverInitializer(LoadConfig.getInstance().getBrowser());
        context.driver = driver;
    }

    @After
    public void after() {
        driver.quit();
    }
}
