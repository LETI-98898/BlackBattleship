package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Acceptance test for User Story 16 - Read the Battleship rules.
 * Scenario UserStoryTest16 from TestSuite_130768.side.
 */
public class UserStory16Test {

    private WebDriver driver;
    private UserStory16 page;

    /**
     * Starts a new Chrome session and opens the Battleship home page.
     */
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new UserStory16(driver);
        page.openBattleshipPage();
    }

    /**
     * Checks that the rules section and its text are shown on the Battleship page.
     */
    @Test
    void rulesAreShownOnBattleshipPage() {
        assertEquals("Rules of Battleship game online", page.getRulesTitle());
        assertTrue(page.getRulesText().startsWith("Battleship is a turn-based 2-player game"));
    }

    /**
     * Closes the browser.
     */
    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
