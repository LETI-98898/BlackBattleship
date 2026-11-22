package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for User Story 13 - Create a Battleship tournament.
 * Covers the tournament creation form, its live preview and the sign-in
 * dialog shown to guests when they try to create the tournament.
 */
public class UserStory13 extends BattleshipBasePage {

    private final By createTournamentButton =
            By.xpath("//span[contains(@class,'front') and normalize-space()='Create tournament']");
    private final By tournamentNameInput = By.id("tf-name");
    private final By leaderboardModeOption = By.xpath("//span[normalize-space()='Leaderboard']");
    private final By previewEyebrow = By.cssSelector(".tb__eyebrow > span");
    private final By createAndShareButton = By.xpath("//button[contains(.,'Create and share')]");
    private final By continueWithEmailButton = By.xpath("//button[contains(.,'Continue with email')]");
    private final By closeDialogButton = By.cssSelector(".dialog-close");

    /**
     * Creates the page object.
     *
     * @param driver WebDriver used by Selenium
     */
    public UserStory13(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks "Create tournament" on the Battleship home page to open the creation form.
     */
    public void openTournamentCreation() {
        click(createTournamentButton);
    }

    /**
     * Types the tournament name in the "Tournament name" field.
     *
     * @param name tournament name
     */
    public void enterTournamentName(String name) {
        click(tournamentNameInput);
        type(tournamentNameInput, name);
    }

    /**
     * Selects the "Leaderboard" tournament mode.
     */
    public void selectLeaderboardMode() {
        click(leaderboardModeOption);
    }

    /**
     * Returns the game and mode shown on the tournament preview card.
     *
     * @return preview label, for example "BATTLESHIP · LEADERBOARD"
     */
    public String getPreviewGameAndMode() {
        return textOf(previewEyebrow);
    }

    /**
     * Clicks "Create and share" to submit the tournament.
     */
    public void clickCreateAndShare() {
        click(createAndShareButton);
    }

    /**
     * Returns the text of the sign-in option shown to guests.
     *
     * @return sign-in button text
     */
    public String getSignInOptionText() {
        return textOf(continueWithEmailButton);
    }

    /**
     * Closes the sign-in dialog.
     */
    public void closeSignInDialog() {
        click(closeDialogButton);
    }
}
