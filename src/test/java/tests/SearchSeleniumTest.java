package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;
import pages.SearchPageOnPypiOrg;

public class SearchSeleniumTest {

    private static ChromeDriver driver;
    private static GoogleSearchPage googleSearchPage;
    private static SearchPageOnPypiOrg searchPageOnPypiOrg;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/home/arsen/IdeaProjects/drivers/chromedriver");

        driver = new ChromeDriver();
        googleSearchPage = new GoogleSearchPage(driver);
        searchPageOnPypiOrg = new SearchPageOnPypiOrg(driver);
        googleSearchPage.open();

        driver.manage().window().maximize();

    }

    @Test
    public void testOfGetVacancy(){
        googleSearchPage.googleSearchBarInput();

        googleSearchPage.enterSearchOnGoogle();

        googleSearchPage.goToPypiOrg();

        searchPageOnPypiOrg.pypiSearchBarInput();

        searchPageOnPypiOrg.enterSearch();

        searchPageOnPypiOrg.goToSecondResult();
    }

    @AfterClass
    public static void quit(){
        driver.quit();
    }

}
