import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPageOnPypiOrg extends BasePage {

    By searchFieldLocator = By.name("q");
    By secondResultLocator = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[3]/ul/li[2]/a/h3/span[1]");
    String dataForSearch = "selenium";

    public SearchPageOnPypiOrg(WebDriver driver) {
        super(driver);
    }

    public void pypiSearchBarInput(){
        sendKey(dataForSearch, searchFieldLocator);
    }

    public void enterSearch(){
        keyEnter(searchFieldLocator);
    }

    public void goToSecondResult(){
        click(secondResultLocator);
    }




}
