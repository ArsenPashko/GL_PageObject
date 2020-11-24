import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends BasePage{

    String key = "selenium install ubuntu python";

    String URL = "https://www.google.com";

    public Config config= new Config();

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        get(config.URL_Google);
    }

    public void googleSearchBarInput(){
        sendKey(key, config.searchFieldOnPypiLocator);
    }

    public void enterSearchOnGoogle(){
        keyEnter(config.searchFieldOnPypiLocator);
    }

    public void goToPypiOrg(){
        click(config.resultOnSearchPageLocator);
    }


}
