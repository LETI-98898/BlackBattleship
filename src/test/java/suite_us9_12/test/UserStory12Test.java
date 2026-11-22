package suite_us9_12.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import suite_us9_12.pages.UserStory12Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Bateria de testes JUnit em Selenide para a User Story 12:
 * Consultar os planos de subscrição Plus da plataforma.
 *
 * @author Daniel (99201)
 */
class UserStory12Test {

    @BeforeAll
    static void configurarAmbiente() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("US12 - Consultar os planos de subscrição Plus da plataforma")
    void deveConsultarPricingPlus() {
        UserStory12Page page = new UserStory12Page()
                .abrirPagina("https://papergames.io/en/battleship")
                .tratarConsentimento()
                .clicarPricingPlus();

        String urlAtual = page.obterUrlAtual();
        assertTrue(urlAtual.contains("pricing/plus"), "O URL deve conter 'pricing/plus', mas foi: " + urlAtual);
        assertTrue(page.isPricingContentDisplayed(), "O conteúdo dos planos de subscrição deve estar visível");
    }
}