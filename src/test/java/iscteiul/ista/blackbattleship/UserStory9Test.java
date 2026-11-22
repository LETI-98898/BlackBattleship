package iscteiul.ista.blackbattleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Bateria de testes JUnit 5 para UserStory 9:
 * Consultar o registo de alterações e novidades (Changelog) da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory9Test {
    private WebDriver driver;
    private UserStory9 page;

    @BeforeEach
    public void setUp() {
        Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        page = new UserStory9(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("US9 - Consultar o registo de alterações (Changelog)")
    public void testConsultChangelog() throws InterruptedException {
        page.open("https://papergames.io/en/battleship");
        Thread.sleep(1500);

        page.handleConsent();
        Thread.sleep(1500);

        page.clickChangelog();
        Thread.sleep(2000);

        assertTrue(page.getCurrentUrl().contains("changelog"), "O URL deve conter 'changelog'");
        assertTrue(page.isChangelogContentDisplayed(), "O conteúdo do changelog deve estar visível no ecrã");
    }
}
