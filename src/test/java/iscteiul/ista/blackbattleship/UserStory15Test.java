package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Acceptance test for User Story 15 - Browse the avatar shop.
 * Scenario UserStoryTest15 from TestSuite_130768.side.
 */
public class UserStory15Test {

    private WebDriver driver;
    private UserStory15 page;

    /**
     * Starts a new Chrome session and opens the Battleship home page.
     */
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new UserStory15(driver);
        page.openBattleshipPage();
    }

    /**
     * Opens the avatar shop and checks that an avatar is listed with its price.
     */
    @Test
    void shopListsAvatarsWithPrices() {
        page.openShop();
        page.openMonstersAvatars();

        assertEquals("Mr. Happy", page.getAvatarName("Mr. Happy"));
        assertEquals("990", page.getAvatarPrice("Mr. Happy"));
    }

    /**
     * Closes the browser.
     */
    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
