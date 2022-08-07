package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.cssSelector("button[data-role='accept-consent']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement inputField = driver.findElement(By.cssSelector("div[data-box-name='allegro.metrumHeader.search'] > div > form > input"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(By.cssSelector("div[data-role='filters'] > div > select"));
        Select selectCategory = new Select(category);
        selectCategory.selectByValue("/kategoria/elektronika");
        inputField.submit();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[data-box-name='items-v3'] > div > div > section > article")));

        List<WebElement> result = driver.findElements(By.cssSelector("div[data-box-name='items-v3'] > div > div > section > article"));
        System.out.println(result.get(2).getText());

    }
}
