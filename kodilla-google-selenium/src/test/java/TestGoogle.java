import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;

public class TestGoogle {
    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
    }

//    @After
//    public void tearDown() {
//        driver.close();
//    }

    @Test
    public void testGooglePage() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

//    @Test
//    public void testRandomResult() throws InterruptedException {
//        GoogleSearch googleSearch = new GoogleSearch(driver);
//        GoogleResults results = googleSearch.searchResults();
//
//        GoogleResults result = results.randomResult();
//        String href = results.getHref();
//
//        String pageURL = result.getURL();
//
//        Assert.assertEquals(href, pageURL);
//    }
}
