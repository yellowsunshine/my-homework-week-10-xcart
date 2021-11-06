package xcartbrowsertesting;

//opening xcart website using Edge browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";

        //Setting the driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Creating an object of the webdriver
        WebDriver driver = new EdgeDriver();

        //selenium method to launch the driver
        driver.get(baseUrl);

        //maximising browser window
        driver.manage().window().maximize();

        //getting the title of browser in console
        String getTitle = driver.getTitle();
        System.out.println(getTitle);

        //closing the driver
        driver.close();


    }
}
