package xcartbrowsertesting;

//using Xcart website using Firefox browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";

        //Setting the driver path
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //Creating an object of the web driver
        WebDriver driver = new FirefoxDriver();

        //Selenium method used to launch the driver
        driver.get(baseUrl);

        //maximising the browser window
        driver.manage().window().maximize();

        //printing the browser title in the console
        String name = driver.getTitle();
        System.out.println(name);

        //closing the browser window
        driver.close();
    }
}
