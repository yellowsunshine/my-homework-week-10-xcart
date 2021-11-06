package xcartbrowsertesting;

//opening xcart website using multiple browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.Scanner;

public class MultiBrowserTesting {

    //declaring static variables
    static String baseUrl = "https://www.x-cart.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //getting user to enter the preferred browser through the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name to open Nopcommerce website:");
        String browser = scanner.nextLine();


        if (browser.equalsIgnoreCase("Chrome")){
            //setting driver path for Chrome
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            //creating an object of Webdriver
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            //Setting the browser path for FF
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            //creating an object of Webdriver
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("IE")) {
            //setting browser path for IE
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            //creating an object of the webdriver
            driver = new InternetExplorerDriver();

        }else if (browser.equalsIgnoreCase("Edge")) {
            //setting browser path for Edge
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            //creating an object of the webdriver
            driver = new EdgeDriver();

        } else {
            System.out.println("You have entered an invalid browser name!");
        }

        //selenium method to launch the chosen driver
        driver.get(baseUrl);

        //maximising the window
        driver.manage().window().maximize();

        //closing the driver
        driver.close();

    }
}
