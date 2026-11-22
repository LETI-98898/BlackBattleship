package suite_us9_12.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import suite_us9_12.pages.UserStory9Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Bateria de testes JUnit em Selenide para a User Story 9:
 * Consultar o registo de alterações e novidades (Changelog) da plataforma.
 *
 * @author Daniel (99201)
 */
class UserStory9Test {

    @BeforeAll
    static void configurarAmbiente() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("US9 - Consultar o registo de alterações (Changelog)")
    void deveConsultarChangelog() {
        UserStory9Page page = new UserStory9Page()
                .abrirPagina("https://papergames.io/en/battleship")
                .tratarConsentimento()
                .clicarChangelog();

        String urlAtual = page.obterUrlAtual();
        assertTrue(urlAtual.contains("changelog"), "O URL deve conter 'changelog', mas foi: " + urlAtual);
        assertTrue(page.isChangelogContentDisplayed(), "O conteúdo do changelog deve estar visível no ecrã");
    }
}