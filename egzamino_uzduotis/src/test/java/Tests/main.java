package Tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class main {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }

    @Test
    void validSignupTC001() {
        Page p = new Page(driver);
        p.goToSignupPage();
        p.setUsername("testas");
        p.setPasswd("slaptazodis");
        p.setConfirm_passwd("slaptazodis");
        p.click_button();
    }

    @Test
    void invalidSignupTC001() {
        Page p = new Page(driver);
        p.goToSignupPage();
        p.setUsername("testas");
        p.setPasswd("slaptazodis");
        p.setConfirm_passwd("nevienodaslaptazodis");
        p.click_button();
    }

    @Test
    void validLoginTC001() {
        Page p = new Page(driver);
        p.setUsername("testas");
        p.setPasswd("slaptazodis");
        p.click_button();
    }

    @Test
    void invalidLoginTC001() {
        Page p = new Page(driver);
        p.setUsername("testas");
        p.setPasswd("testas");
        p.click_button();
        //neteisingas passswd
    }

    @Test
    void invalidLoginTC002() {
        Page p = new Page(driver);
        p.setUsername("netestas");
        p.setPasswd("testas");
        p.click_button();
        //nera tokio vartotojo
    }

    @Test
    void calculatorInvalidResult() {
        validLoginTC001();
        Page p = new Page(driver);
        p.enter_1stNumber(String.valueOf(0));
        p.enter_2ndNumber(String.valueOf(0));
        p.Select_operation("Dalyba");

    }

    @Test
    void LogOut() {
        Page p = new Page(driver);
        validLoginTC001();
        p.LoggOut();
    }
}
