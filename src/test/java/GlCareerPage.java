import org.openqa.selenium.WebDriver;


public class GlCareerPage extends BasePage {

    Config config = new Config();

    public GlCareerPage(WebDriver driver) {
        super(driver);

    }

    public void open(){
        get(config.URL_GL);
    }


    public void fieldOfSearch(){
        sendKey("QA", config.searchFieldLocator);
    }

    public void clickOnSearchButton(){
        click(config.buttonOfSearchLocator);
    }


}
