package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    /*
    Locators - resultText
    Method - verifyTheResults(String expected)
*/

   /*
    Locators - resultText
    Method - verifyTheResults(String expected)
*/

    @FindBy(xpath = "//div[@class='search-header__left']//h1")
    WebElement errorMessage;



    public String getErrorMessage()
    {
        return getTextFromElement(errorMessage);
    }

}
