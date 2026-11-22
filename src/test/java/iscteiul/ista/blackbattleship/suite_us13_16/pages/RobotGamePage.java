package iscteiul.ista.blackbattleship.suite_us13_16.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

/**
 * Page Object for a game against the robot, including the guest nickname
 * dialog shown before the game starts.
 */
public class RobotGamePage {

    // The page also keeps a hidden copy of the nickname dialog, so only the visible one is used.
    @FindBy(css = "app-guest-registration-dialog input")
    private ElementsCollection nicknameInputs;

    @FindBy(css = "app-guest-registration-dialog button[type='submit']")
    private ElementsCollection continueButtons;

    @FindBy(xpath = "//button[contains(.,'Abort game')]")
    private SelenideElement abortGameButton;

    @FindBy(css = "app-confirm-leave-dialog .btn-danger")
    private SelenideElement confirmAbortButton;

    @FindBy(css = "a[href*='/en/friends']")
    private SelenideElement friendsLink;

    /**
     * Types the guest nickname and confirms it with "Continue".
     *
     * @param nickname guest nickname
     * @return this page, now showing the game
     */
    @Step("Choose guest nickname \"{nickname}\"")
    public RobotGamePage chooseNickname(String nickname) {
        nicknameInputs.findBy(visible).setValue(nickname);
        continueButtons.findBy(visible).click();
        return this;
    }

    /**
     * Leaves the game by clicking "Abort game" and confirming it.
     *
     * @return this page
     */
    @Step("Abort the game")
    public RobotGamePage abortGame() {
        abortGameButton.click();
        confirmAbortButton.click();
        return this;
    }

    /**
     * Opens the friends page from the side menu.
     *
     * @return the friends page
     */
    @Step("Open the friends page")
    public FriendsPage openFriendsPage() {
        friendsLink.click();
        return page(FriendsPage.class);
    }
}
