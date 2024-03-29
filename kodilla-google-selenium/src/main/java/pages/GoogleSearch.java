package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Google Search']")
     static List<WebElement> searchButton;
     private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public GoogleResults searchResults() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        inputField.submit();
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        return googleResults;
    }

    public static GoogleResults loadResults(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        Thread.sleep(5000);
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
