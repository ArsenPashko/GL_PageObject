import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPageOnPypiOrg extends BasePage {

    String dataForSearch = "selenium";

    public Config config = new Config();

    public SearchPageOnPypiOrg(WebDriver driver) {
        super(driver);
    }

    public void pypiSearchBarInput(){
        sendKey(dataForSearch, config.searchFieldOnPypiLocator);
    }

    public void enterSearch(){
        keyEnter(config.searchFieldOnPypiLocator);
    }

    public void goToSecondResult(){
        click(config.secondResultLocator);
    }




}
