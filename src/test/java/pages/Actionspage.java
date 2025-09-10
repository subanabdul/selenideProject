package pages;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Actionspage {
	
	public void openDragDropPage() {

		$(By.xpath("//*[text()='Drag and Drop']")).click();
	}
 
	public void dragAndDropExample() {
		
		SelenideElement boxA = $x("//div[@id='column-a']");
        SelenideElement boxB = $x("//div[@id='column-b']");
	
        actions().dragAndDrop(boxA,boxB).perform();
	}
}
