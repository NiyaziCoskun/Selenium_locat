import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {

    WebDriver driver;
    String BASE_URL = "https://www.instagram.com/";
    By usernameLocator = new By.ByCssSelector("input[name='username']");
    By passwordLocator = new By.ByCssSelector("input[name='password']");
    By loginButtonLocator = new By.ByCssSelector("button[type='submit']");


    public void App(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    public void loginWith(String username, String password) throws InterruptedException {
        Thread.sleep(5);
        /*WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocator));*/
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }
}
