import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends BasePage{

    By searchFieldLocator = By.name("q");
    By resultOnSearchPageLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/a/div/cite");
    String key = "selenium install ubuntu python";

    String URL = "https://www.google.com";

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        get(URL);
    }

    public void googleSearchBarInput(){
        sendKey(key, searchFieldLocator);
    }

    public void enterSearchOnGoogle(){
        keyEnter(searchFieldLocator);
    }

    public void goToPypiOrg(){
        click(resultOnSearchPageLocator);
    }


}
