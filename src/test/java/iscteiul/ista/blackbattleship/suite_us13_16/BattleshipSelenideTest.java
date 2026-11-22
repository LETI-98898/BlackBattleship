package iscteiul.ista.blackbattleship.suite_us13_16;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

/**
 * Common setup for the US13-US16 Selenide acceptance tests:
 * Chrome configuration and the Allure listener that records every Selenide step.
 */
public abstract class BattleshipSelenideTest {

    /**
     * Configures Selenide and registers the Allure listener.
     */
    @BeforeAll
    static void setUpAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    /**
     * Closes the browser so every test starts with a clean session.
     */
    @AfterEach
    void tearDown() {
        closeWebDriver();
    }
}
