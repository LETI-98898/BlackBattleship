package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserStory6Test {

    private WebDriver driver;
    private UserStory6 userStory6;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(920, 692));

        userStory6 = new UserStory6(driver);
    }

    @Test
    void testUserStory2() {
        userStory6.openPage();
        userStory6.clickButton();

        assertNotNull(driver.getCurrentUrl());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
