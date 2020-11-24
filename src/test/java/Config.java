import org.openqa.selenium.By;

public class Config {

    public Config() { }

    By searchFieldLocator = By.id("by_keyword");
    By buttonOfSearchLocator = By.xpath("//button[@class ='btn btn-primary find-btn']");
    By firstResultOnSearchPageLocator = By.xpath("//*[@id='carersearchpage']/div[2]/div/div[3]/div[2]/a/div/div/div[1]/p[1]");
    String URL_GL = "https://www.globallogic.com/ua/careers/";

    By searchFieldOnPypiLocator = By.name("q");
    By resultOnSearchPageLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/a/div/cite");
    By secondResultLocator = By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[3]/ul/li[2]/a/h3/span[1]");
    String URL_Google = "https://www.google.com";


}
