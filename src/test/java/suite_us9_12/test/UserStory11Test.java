package suite_us9_12.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import suite_us9_12.pages.UserStory11Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Bateria de testes JUnit em Selenide para a User Story 11:
 * Consultar os Termos e Condições da plataforma.
 *
 * @author Daniel (99201)
 */
class UserStory11Test {

    @BeforeAll
    static void configurarAmbiente() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("US11 - Consultar os Termos e Condições da plataforma")
    void deveConsultarTermosECondicoes() {
        UserStory11Page page = new UserStory11Page()
                .abrirPagina("https://papergames.io/en/battleship")
                .tratarConsentimento()
                .clicarTermosECondicoes();

        String urlAtual = page.obterUrlAtual();
        assertTrue(urlAtual.contains("terms-conditions"), "O URL deve conter 'terms-conditions', mas foi: " + urlAtual);
        assertTrue(page.isTermsContentDisplayed(), "O conteúdo dos Termos e Condições deve ser exibido");
    }
}