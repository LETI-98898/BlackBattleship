package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserStory5Test {

    private WebDriver driver;
    private UserStory5 userStory5;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(920, 692));

        userStory5 = new UserStory5(driver);
    }

    @Test
    void testUserStory1() {
        userStory5.openPage();
        userStory5.clickButton();

        assertNotNull(driver.getCurrentUrl());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}