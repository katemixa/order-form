import io.github.bonigarcia.wdm.WebDriverManager;
import order_page.OrderFormPage;
import order_step.OrderFormStep;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    private final static String URL_CONNECTION = "file:///C:/src/order-form/form.html";
    static OrderFormPage page;
    static OrderFormStep step;
    private static WebDriver driver;

    @BeforeClass
    public static void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_CONNECTION);
        page = new OrderFormPage(driver);
        step = new OrderFormStep(driver);
    }

    @AfterClass
    public static void closeConnection() {
        driver.quit();
    }
}
