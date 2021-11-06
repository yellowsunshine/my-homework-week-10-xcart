package xcartbrowsertesting;

//launching xcart website using chrome browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    //Main Method
    public static void main(String[] args) {


        String baseUrl = "https://www.x-cart.com/";

        //setting property of key (from selenium website) and value (pasted from driver path)
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //creating an object of the web-driver & after the new keyword select the chosen driver
        WebDriver driver = new ChromeDriver();

        //selenium method to open the driver url
        driver.get(baseUrl);

        //to maximise browser window
        driver.manage().window().maximize();

        //to print title of the webpage in the console
        String getTitle = driver.getTitle();
        System.out.println(getTitle);

        //closing the focused window
        driver.close();
    }

}
