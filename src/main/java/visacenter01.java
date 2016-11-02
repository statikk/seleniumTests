import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by otimoshyn on 11/1/16.
 */
public class visacenter01 {

    public static void main (String[] args){

        System.setProperty("webdriver.gecko.driver", "/Users/otimoshyn/Automation/geckodriver"); // Add dependency to pom.xml

        WebDriver driver = new FirefoxDriver(); // Add webdriver

        driver.get("https://visacenter.ca"); // Open URL

        WebElement searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/div/div/button"));// Find element

        searchfield.click();

        searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div/div/input"));

        searchfield.sendKeys("Afghanistan");

        searchfield.sendKeys(Keys.ENTER);




    }
}