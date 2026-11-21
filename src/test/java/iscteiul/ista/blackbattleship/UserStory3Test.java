package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserStory3Test {

    private WebDriver driver;
    private UserStory3 userStory3;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(571, 692));

        userStory3 = new UserStory3(driver);
    }

    @Test
    void testUserStory3() {
        userStory3.openPage();
        userStory3.executeUserStory();

        assertNotNull(driver.getCurrentUrl());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}