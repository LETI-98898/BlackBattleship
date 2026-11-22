package iscteiul.ista.blackbattleship.suites_us1_4;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class UserStory4Page {

    private final SelenideElement createPrivateRoomButton =
            $(".w-100:nth-child(1) > .btn-lg .flex-grow-1");

    public void openPage() {
        open("https://papergames.io/en/battleship");
    }

    public void clickCreatePrivateRoom() {
        createPrivateRoomButton.click();
    }
}