package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Page extends main {
    WebDriver driver;

    Page(WebDriver driver) {
        this.driver = driver;
    }

    By txt_SignUpPage_loc = By.cssSelector("a");
    By txt_username_loc = By.xpath("//input[@name='username']");
    By txt_passwd_loc = By.xpath("//input[@name='password']");
    By txt_confirm_passwd_loc = By.cssSelector("#passwordConfirm");
    By btn_submit_loc = By.cssSelector(".btn");
    By firstNumber_loc = By.cssSelector("#sk1");
    By secondNumber_loc = By.cssSelector("#sk2");
    //    By select_arithmetic_operation_loc = By.cssSelector("select");
    By LogOutButton_loc = By.cssSelector("a");


    void setUsername(String username) {
        driver.findElement(txt_username_loc).sendKeys(username);
    }

    void setPasswd(String passwd) {
        driver.findElement(txt_passwd_loc).sendKeys(passwd);
    }

    void setConfirm_passwd(String confirmPasswd) {
        driver.findElement(txt_confirm_passwd_loc).sendKeys(confirmPasswd);
    }

    void click_button() {
        driver.findElement(btn_submit_loc).click();
    }

    void goToSignupPage() {
        driver.findElement(txt_SignUpPage_loc).click();
    }

    void enter_1stNumber(String firstNumber) {
        driver.findElement(firstNumber_loc).sendKeys(firstNumber);
    }

    void enter_2ndNumber(String secondNumber) {
        driver.findElement(secondNumber_loc).sendKeys(secondNumber);
    }

    void Select_operation(String operation) {
        Select operations = new Select(driver.findElement(By.cssSelector("select")));
        operations.selectByValue(operation);
    }

    void LoggOut() {
        driver.findElement(LogOutButton_loc).click();
    }
}



