package xcartbrowsertesting;

//launching xcart website using IE

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";

        //Setting the driver path
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");

        //creating an object of WebDriver
        WebDriver driver = new InternetExplorerDriver();

        //selenium method to launch the driver
        driver.get(baseUrl);

        //selenium method to maximise the browser window
        driver.manage().window().maximize();

        //printing browser title in the console
        String title = driver.getTitle();
        System.out.println(title);

        //closing the browser
        driver.close();


    }
}
