package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class WindowsPage {
	
	public void openNewWindowPage() {
		
		$x("//*[text()='Multiple Windows']").click();
		$x("//*[text()='Click Here']").click();
	}
	
	public void switchToNewWindow() {
		
		switchTo().window(1);
		$x("//h3").shouldHave(text("New Window"));
		switchTo().window(0);
		$x("//h3").shouldHave(text("Opening a new window"));
		
	}
	public void verifyNewWindow() {
        $x("//h3").shouldHave(text("New Window"));
    }

}
