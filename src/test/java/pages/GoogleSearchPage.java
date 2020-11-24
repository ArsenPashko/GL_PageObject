package pages;

import configure.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends BasePage{


    By searchFieldOnPypiLocator = By.name("q");
    By resultOnSearchPageLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/a/div/cite");

    public Config config= new Config();

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        get(config.URL_Google);
    }

    public void googleSearchBarInput(){
        sendKey(config.googleSearchQuery, searchFieldOnPypiLocator);
    }

    public void enterSearchOnGoogle(){
        keyEnter(searchFieldOnPypiLocator);
    }

    public void goToPypiOrg(){
        click(resultOnSearchPageLocator);
    }


}
