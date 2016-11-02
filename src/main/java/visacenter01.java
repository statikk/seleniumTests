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

        WebElement searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/div/div/button"));// I have a passport from

        searchfield.click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div/div/input")).sendKeys("Afghanistan");

        searchfield.sendKeys(Keys.ENTER);

        searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[2]/div/div/button"));

        searchfield.click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[2]/div/div/div/div/input")).sendKeys("Alberta"); // Province of residence

        searchfield.sendKeys(Keys.ENTER);

        searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[3]/div/div/button"));

        searchfield.click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[3]/div/div/div/div/input")).sendKeys("Australia"); // Travel destination

        searchfield.sendKeys(Keys.ENTER);

        searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/form/div[4]/div/button"));

        searchfield.click();

        try {
            Thread.sleep(3000);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        searchfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/a[1]"));

        searchfield.click();

        try {
            Thread.sleep(5000);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        searchfield = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/a"));

        searchfield.click();

        try {
            Thread.sleep(3000);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        searchfield = driver.findElement(By.xpath("id('visa-type')/table/tbody/tr/td[2]/label/input"));

        searchfield.click();

        searchfield = driver.findElement(By.xpath("id('visa-type')/div[4]/div/button"));

        searchfield.click();

    }
}
