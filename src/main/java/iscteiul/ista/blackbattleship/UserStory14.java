package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for User Story 14 - View the friends list.
 * A guest only gets access to the friends page after choosing a nickname,
 * which is done by starting (and aborting) a game against the robot.
 */
public class UserStory14 extends BattleshipBasePage {

    private final By playVsRobotButton =
            By.xpath("//span[contains(@class,'flex-grow-1') and normalize-space()='Play vs robot']");
    private final By nicknameInput = By.cssSelector("app-guest-registration-dialog input");
    private final By continueButton = By.cssSelector("app-guest-registration-dialog button[type='submit']");
    private final By abortGameButton = By.xpath("//button[contains(.,'Abort game')]");
    private final By confirmAbortButton = By.cssSelector("app-confirm-leave-dialog .btn-danger");
    private final By friendsLink = By.cssSelector("a[href*='/en/friends']");
    private final By pendingInvitationsMessage = By.cssSelector("app-friend-invitations > span");
    private final By friendsTitle = By.xpath("//h1[contains(.,'Friends')]");

    /**
     * Creates the page object.
     *
     * @param driver WebDriver used by Selenium
     */
    public UserStory14(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks "Play vs robot" on the Battleship home page.
     */
    public void clickPlayVsRobot() {
        click(playVsRobotButton);
    }

    /**
     * Types the guest nickname and confirms it with "Continue".
     *
     * @param nickname guest nickname
     */
    public void chooseNickname(String nickname) {
        type(nicknameInput, nickname);
        click(continueButton);
    }

    /**
     * Leaves the game against the robot by clicking "Abort game" and confirming it.
     */
    public void abortGame() {
        click(abortGameButton);
        click(confirmAbortButton);
    }

    /**
     * Opens the friends page from the side menu.
     */
    public void openFriendsPage() {
        click(friendsLink);
    }

    /**
     * Returns the message about pending friend invitations.
     *
     * @return pending invitations message
     */
    public String getPendingInvitationsMessage() {
        return textOf(pendingInvitationsMessage);
    }

    /**
     * Returns the title of the friends list.
     *
     * @return friends list title
     */
    public String getFriendsTitle() {
        return textOf(friendsTitle);
    }
}
