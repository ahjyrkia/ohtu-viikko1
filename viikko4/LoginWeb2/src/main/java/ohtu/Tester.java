package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());

        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("login"));
        element.click();

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkepp");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());

        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("login"));
        element.click();

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekkaaa");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());

        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));
        element.click();

        element = driver.findElement(By.name("username"));
        element.sendKeys("asdasd");
        element = driver.findElement(By.name("password"));
        element.sendKeys("12345678");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("12345678");
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());

        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));
        element.click();

        element = driver.findElement(By.name("username"));
        element.sendKeys("eeroo");
        element = driver.findElement(By.name("password"));
        element.sendKeys("123456789");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("123456789");
        element.submit();

        driver.get("http://localhost:8090/newUser");
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        element = driver.findElement(By.linkText("logout"));
        element.click();

        System.out.println("==joo");
        System.out.println(driver.getPageSource());
    }
}
