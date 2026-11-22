package iscteiul.ista.blackbattleship.suites_us1_4;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class UserStory3Page {

    private final SelenideElement menuButton =
            $x("//span/button/span[3]");

    private final SelenideElement creditButton =
            $(".credit");

    private final SelenideElement menuItem =
            $x("//div[@id='mat-menu-panel-serverApp0']/div/a/span/span");

    private final SelenideElement inputField =
            $("#mat-input-serverApp0");

    private final SelenideElement updateButton =
            $(".btn-secondary");

    public void openPage() {
        open("https://papergames.io/en/battleship");
    }

    public void executeUserStory() {
        menuButton.click();
        creditButton.click();
        menuItem.click();
        inputField.click();
        inputField.click();
        updateButton.click();
    }
}