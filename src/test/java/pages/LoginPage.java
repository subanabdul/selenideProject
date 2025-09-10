package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;

public class LoginPage {
	
	public void openLoginPage() {
		$(By.xpath("//*[text()='Form Authentication']")).click();
	}
	
	public void login(String username,String password) {
		$(By.id("username")).setValue(username);
		$(By.id("password")).setValue(password);
		$(By.xpath("//*[@class=\"radius\"]")).click();
	}
	
	public void verifyLoginSuccess() {
		
		$(By.id("flash")).shouldHave(text("You logged into a secure area!"));
	}

}
