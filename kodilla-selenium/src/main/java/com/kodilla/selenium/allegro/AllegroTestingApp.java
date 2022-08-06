package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(By.xpath("//select[contains(@class, \"mr3m_1 m7er_k4 mj6k_n7\")]"));
        Select selectCategory = new Select(category);
        selectCategory.selectByValue("/kategoria/elektronika");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        searchButton.click();



    }
}
