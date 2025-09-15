package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import utils.ConfigReader;
import base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Actionspage;
import pages.DropdownPage;
import pages.FramesPage;
import pages.LoginPage;
import pages.WindowsPage;

public class EndToEndDemoTest extends TestBase {
		
	LoginPage login = new LoginPage();
    DropdownPage dropdown = new DropdownPage();
    Actionspage actions = new Actionspage();
    FramesPage frames = new FramesPage();
    WindowsPage windows = new WindowsPage();
    
    @Test(description = "End-to-End test using only XPath locators")
    @Description("Covers Login, Dropdown, DragDrop, Frames, Windows with XPath")
    @Severity(SeverityLevel.CRITICAL)
    @Story("UI Automation Demo")
    public void fullE2ETest() {

        String username = ConfigReader.get("username");
        String password = ConfigReader.get("password");
        String baseUrl  = ConfigReader.get("url");
        // Login
        login.openLoginPage();
        login.login(username, password);
        login.verifyLoginSuccess();

        // Dropdown
        open(baseUrl);
        dropdown.openDropdownPage();
        dropdown.selectOption("Option 2");
        dropdown.verifySelected("Option 2");

        // Drag & Drop
        open(baseUrl);
        actions.openDragDropPage();
        actions.dragAndDropExample();

        // Frames
        open(baseUrl);
        frames.openFramePage();
        frames.typeInFrame("Hello Frame!");
        frames.verifyText();

        // Windows
        open(baseUrl);
        windows.openNewWindowPage();
        windows.switchToNewWindow();
        windows.verifyNewWindow();
    
    }
}


