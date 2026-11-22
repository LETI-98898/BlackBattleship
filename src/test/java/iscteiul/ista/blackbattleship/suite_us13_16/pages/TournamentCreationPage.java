package iscteiul.ista.blackbattleship.suite_us13_16.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

/**
 * Page Object for the tournament creation form, its live preview card and the
 * sign-in dialog shown to guests when they try to create a tournament.
 */
public class TournamentCreationPage {

    @FindBy(id = "tf-name")
    private SelenideElement tournamentNameInput;

    @FindBy(xpath = "//span[normalize-space()='Leaderboard']")
    private SelenideElement leaderboardModeOption;

    @FindBy(css = ".tb__eyebrow > span")
    private SelenideElement previewGameAndMode;

    @FindBy(xpath = "//button[contains(.,'Create and share')]")
    private SelenideElement createAndShareButton;

    @FindBy(xpath = "//button[contains(.,'Continue with email')]")
    private SelenideElement continueWithEmailButton;

    @FindBy(css = ".dialog-close")
    private SelenideElement closeDialogButton;

    /**
     * Types the tournament name.
     *
     * @param name tournament name
     * @return this page
     */
    @Step("Enter tournament name \"{name}\"")
    public TournamentCreationPage enterTournamentName(String name) {
        tournamentNameInput.setValue(name);
        return this;
    }

    /**
     * Selects the "Leaderboard" tournament mode.
     *
     * @return this page
     */
    @Step("Select Leaderboard mode")
    public TournamentCreationPage selectLeaderboardMode() {
        leaderboardModeOption.click();
        return this;
    }

    /**
     * Clicks "Create and share".
     *
     * @return this page, now showing the sign-in dialog for guests
     */
    @Step("Click Create and share")
    public TournamentCreationPage clickCreateAndShare() {
        createAndShareButton.click();
        return this;
    }

    /**
     * Closes the sign-in dialog.
     */
    @Step("Close the sign-in dialog")
    public void closeSignInDialog() {
        closeDialogButton.click();
    }

    /**
     * Returns the game and mode label of the preview card.
     *
     * @return preview label element
     */
    public SelenideElement previewGameAndMode() {
        return previewGameAndMode;
    }

    /**
     * Returns the "Continue with email" sign-in option.
     *
     * @return sign-in option element
     */
    public SelenideElement continueWithEmailButton() {
        return continueWithEmailButton;
    }
}
