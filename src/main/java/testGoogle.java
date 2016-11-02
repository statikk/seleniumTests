import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by otimoshyn on 11/2/16.
 */
public class testGoogle {


    public static void main (String[] args){


        System.setProperty("webdriver.gecko.driver", "/Users/otimoshyn/Automation/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");

        WebElement searchfield = driver.findElement(By.xpath("//input[@name='q']"));

        searchfield.sendKeys("pizza");



    }


}
