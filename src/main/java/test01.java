import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by otimoshyn on 11/1/16.
 */
public class test01 {

    public static void main (String[] args){

        System.setProperty("webdriver.gecko.driver", "/Users/otimoshyn/Automation/geckodriver"); // Add dependency to pom.xml

        WebDriver driver = new FirefoxDriver(); // Add webdriver

        driver.get("https://visacenter.ca"); // Open URL

        WebElement searchfield = driver.findElement(By.cssSelector("")); // Find element







    }
}
