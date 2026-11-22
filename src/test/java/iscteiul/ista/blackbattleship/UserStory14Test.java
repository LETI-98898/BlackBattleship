package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Acceptance test for User Story 14 - View the friends list.
 * Scenario UserStoryTest14 from TestSuite_130768.side.
 */
public class UserStory14Test {

    private WebDriver driver;
    private UserStory14 page;

    /**
     * Starts a new Chrome session and opens the Battleship home page.
     */
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new UserStory14(driver);
        page.openBattleshipPage();
    }

    /**
     * Chooses a guest nickname, leaves the robot game and checks the friends page.
     */
    @Test
    void guestCanViewFriendsList() {
        page.clickPlayVsRobot();
        page.chooseNickname("Simao130768");
        page.abortGame();
        page.openFriendsPage();

        assertEquals("No pending invitations.", page.getPendingInvitationsMessage());
        assertEquals("Friends", page.getFriendsTitle());
    }

    /**
     * Closes the browser.
     */
    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
