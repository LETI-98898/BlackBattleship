package iscteiul.ista.blackbattleship.suites_us1_4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserStory2SelenideTest {

    private UserStory2Page page;

    @BeforeEach
    void setUp() {
        Configuration.browserSize = "920x692";
        page = new UserStory2Page();
    }

    @Test
    void testUserStory2() {
        page.openPage();
        page.clickButton();

        assertNotNull(url());
    }
}