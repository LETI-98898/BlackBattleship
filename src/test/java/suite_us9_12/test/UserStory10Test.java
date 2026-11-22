package suite_us9_12.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import suite_us9_12.pages.UserStory10Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Bateria de testes JUnit em Selenide para a User Story 10:
 * Navegar para outro jogo no menu da plataforma.
 *
 * @author Daniel (99201)
 */
class UserStory10Test {

    @BeforeAll
    static void configurarAmbiente() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("US10 - Navegar da página do Battleship para o Tic-Tac-Toe")
    void deveNavegarParaOutroJogo() {
        UserStory10Page page = new UserStory10Page()
                .abrirPagina("https://papergames.io/en/battleship")
                .tratarConsentimento()
                .navegarParaTicTacToe();

        String urlAtual = page.obterUrlAtual();
        assertTrue(urlAtual.contains("tic-tac-toe"), "O URL deve conter 'tic-tac-toe' após a navegação, mas foi: " + urlAtual);
    }
}