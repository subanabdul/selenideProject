package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

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
        // Login
        login.openLoginPage();
        login.login("tomsmith", "SuperSecretPassword!");
        login.verifyLoginSuccess();

        // Dropdown
        open("https://the-internet.herokuapp.com/");
        dropdown.openDropdownPage();
        dropdown.selectOption("Option 2");
        dropdown.verifySelected("Option 2");

        // Drag & Drop
        open("https://the-internet.herokuapp.com/");
        actions.openDragDropPage();
        actions.dragAndDropExample();

        // Frames
        open("https://the-internet.herokuapp.com/");
        frames.openFramePage();
        frames.typeInFrame("Hello Frame!");
        frames.verifyText();

        // Windows
        open("https://the-internet.herokuapp.com/");
        windows.openNewWindowPage();
        windows.switchToNewWindow();
        windows.verifyNewWindow();
    
    }
}


