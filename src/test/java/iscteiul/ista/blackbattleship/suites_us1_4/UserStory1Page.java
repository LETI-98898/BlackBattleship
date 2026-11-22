package iscteiul.ista.blackbattleship.suites_us1_4;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

public class UserStory1Page {

    private final SelenideElement button =
            $(".btn-secondary:nth-child(2)");

    public void openPage() {
        open("https://papergames.io/en/battleship");
    }

    public void clickButton() {
        button.click();
    }
}