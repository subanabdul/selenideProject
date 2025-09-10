package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class DropdownPage {
	
	public void openDropdownPage() {
		
		$(By.xpath("//*[text()='Dropdown']")).click();		
	}
	
	public void selectOption(String value) {
		
		$(By.xpath("//*[@id=\"dropdown\"]")).selectOption(value);
	}

	public void verifySelected(String value) {

		$(By.xpath("//*[@id=\"dropdown\"]")).shouldHave(text(value));
	}
}
