package pages;

import configure.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GlCareerPage extends BasePage {

    Config config = new Config();
    By searchFieldLocator = By.id("by_keyword");
    By buttonOfSearchLocator = By.xpath("//button[@class ='btn btn-primary find-btn']");

    public GlCareerPage(WebDriver driver) {
        super(driver);

    }

    public void open(){
        get(config.URL_GL);
    }


    public void fieldOfSearch(){
        sendKey("QA", searchFieldLocator);
    }

    public void clickOnSearchButton(){
        click(buttonOfSearchLocator);
    }


}
