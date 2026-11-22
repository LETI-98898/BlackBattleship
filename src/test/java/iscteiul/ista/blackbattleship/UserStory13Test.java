package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Acceptance test for User Story 13 - Create a Battleship tournament.
 * Scenario UserStoryTest13 from TestSuite_130768.side.
 */
public class UserStory13Test {

    private WebDriver driver;
    private UserStory13 page;

    /**
     * Starts a new Chrome session and opens the Battleship home page.
     */
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new UserStory13(driver);
        page.openBattleshipPage();
    }

    /**
     * Fills in the tournament form, checks the preview and checks that a guest
     * is asked to sign in when creating the tournament.
     */
    @Test
    void createTournamentAsksGuestToSignIn() {
        page.openTournamentCreation();
        page.enterTournamentName("Torneio ES 130768");
        page.selectLeaderboardMode();

        assertEquals("BATTLESHIP · LEADERBOARD", page.getPreviewGameAndMode());

        page.clickCreateAndShare();

        assertEquals("Continue with email", page.getSignInOptionText());

        page.closeSignInDialog();
    }

    /**
     * Closes the browser.
     */
    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
