import org.openqa.selenium.WebDriver;

public class GLCareerResultPage extends BasePage{
    Config config = new Config();

    public GLCareerResultPage(WebDriver driver) {
        super(driver);
    }

    public void getFirst(){
        print(config.firstResultOnSearchPageLocator);
    }

}
