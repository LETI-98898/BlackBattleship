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
 * Bateria de testes JUnit 5 para UserStory 11:
 * Consultar os Termos e Condições da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory11Test {
    private WebDriver driver;
    private UserStory11 page;

    @BeforeEach
    public void setUp() {
        Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        page = new UserStory11(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("US11 - Consultar os Termos e Condições da plataforma")
    public void testConsultTermsAndConditions() throws InterruptedException {
        page.open("https://papergames.io/en/battleship");
        Thread.sleep(1500);

        page.handleConsent();
        Thread.sleep(1500);

        page.clickTermsAndConditions();
        Thread.sleep(2000);

        assertTrue(page.getCurrentUrl().contains("terms-conditions"), "O URL deve conter 'terms-conditions'");
        assertTrue(page.isTermsContentDisplayed(), "O conteúdo dos Termos e Condições deve ser exibido");
    }
}
