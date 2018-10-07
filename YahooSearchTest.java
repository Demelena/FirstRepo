package YahooSearch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class YahooSearchTest {

    private WebDriver driver;
            

    @Tests
    public void testSearch() throws Exception {

        File file = new File("src/test/resources");
        String path = file.getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", path + "/geckodriver" );
        driver = new FirefoxDriver();
            
 //           navigatingToMainPage();
//            typeRequestInSearchInput();
//            submitSearch();
//            printOutAmountOfResult();
    }
@Test
  @Tests
    public void testRENAMINGthis() throws Exception {

        File file = new File("src/test/resources");
        String path = file.getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", path + "/geckodriver" );
        driver = new FirefoxDriver();


}