import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class test {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    void test() {
        driver.get("http://192.168.91.6");
        driver.findElement(By.cssSelector("#_desktop_contact_link")).click();

        Select drpdwByVisibleText = new Select(driver.findElement(By.cssSelector("#id_contact")));
        drpdwByVisibleText.selectByVisibleText("Webmaster");

        driver.findElement(By.cssSelector("#email")).sendKeys("test@mail.com");


        WebElement fileUploadButton = driver.findElement(By.cssSelector(".btn.btn-default"));
        fileUploadButton.sendKeys("C:\\Users\\emili\\Downloads\\download.jpg");

        driver.findElement(By.cssSelector("#contactform-message")).sendKeys("Test");

        driver.findElement(By.cssSelector("btn.btn-primary")).click();

    }

    @Test
    void test1() {
        driver.get("http://192.168.91.6");
        driver.findElement(By.cssSelector("#_desktop_contact_link")).click();

        Select drpdwByVisibleText = new Select(driver.findElement(By.cssSelector("#id_contact")));
        drpdwByVisibleText.selectByVisibleText("Customer service");

        driver.findElement(By.cssSelector("#email")).sendKeys("test@mail.com");


        WebElement fileUploadButton = driver.findElement(By.cssSelector(".btn.btn-default"));
        fileUploadButton.sendKeys("C:\\Users\\emili\\Downloads\\download.jpg");

        driver.findElement(By.cssSelector("btn.btn-primary")).click();
    }


}
