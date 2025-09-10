package pages;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;

public class FramesPage {

    public void openFramePage() {
        $(By.xpath("//a[text()='Frames']")).click();
        $(By.xpath("//a[text()='iFrame']")).click();
    }

    public void typeInFrame(String text) {
        switchTo().frame($x("//iframe[@id='mce_0_ifr']"));
        //$x("//body[@id='tinymce']").clear();
       // $x("//body[@id='tinymce']").setValue(text);
        switchTo().defaultContent();
    }

    public void verifyText() {
        switchTo().frame($x("//iframe[@id='mce_0_ifr']"));
       // $x("//body[@id='tinymce']").shouldHave(text("Hello Frame!"));
        switchTo().defaultContent();
    }
}
