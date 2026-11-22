package iscteiul.ista.blackbattleship.suites_us1_4;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class UserStory2Page {

    private final SelenideElement button =
            $(".w-100:nth-child(2) > .btn .flex-grow-1");

    public void openPage() {
        open("https://papergames.io/en/battleship");
    }

    public void clickButton() {
        button.click();
    }
}