package pages;

import configure.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPageOnPypiOrg extends BasePage {


    public static final By secondResultLocator = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[3]/ul/li[2]/a/h3/span[1]");
    public static final By searchFieldOnPypiLocator = By.name("q");

    public Config config = new Config();

    public SearchPageOnPypiOrg(WebDriver driver) {
        super(driver);
    }

    public void pypiSearchBarInput(){
        sendKey(config.dataForSearch, searchFieldOnPypiLocator);
    }

    public void enterSearch(){
        keyEnter(searchFieldOnPypiLocator);
    }

    public void goToSecondResult(){
        click(secondResultLocator);
    }




}
