package iscteiul.ista.blackbattleship.suites_us1_4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserStory3SelenideTest {

    private UserStory3Page page;

    @BeforeEach
    void setUp() {
        Configuration.browserSize = "571x692";
        page = new UserStory3Page();
    }

    @Test
    void testUserStory3() {
        page.openPage();
        page.executeUserStory();

        assertNotNull(url());
    }
}