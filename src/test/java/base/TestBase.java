package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeMethod
    public void setup() {
    	
    	Configuration.browserSize = "1920x1080";
    	Configuration.timeout = 8000;
    	open("https://the-internet.herokuapp.com/");
    }
    
    @AfterMethod
    public void teardown() {
    	closeWebDriver();
    	
    }
}
