package iscteiul.ista.blackbattleship.suites_us1_4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserStory4SelenideTest {

    private UserStory4Page page;

    @BeforeEach
    void setUp() {
        Configuration.browserSize = "571x692";
        page = new UserStory4Page();
    }

    @Test
    void testUserStory4() {
        page.openPage();
        page.clickCreatePrivateRoom();

        assertNotNull(url());
    }
}