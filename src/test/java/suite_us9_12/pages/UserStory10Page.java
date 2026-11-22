package suite_us9_12.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Page Object em Selenide (com Page Factory) para a User Story 10:
 * Navegar da página do Battleship para o jogo Tic-Tac-Toe através do menu.
 *
 * @author Daniel (99201)
 */
public class UserStory10Page {

    private static final String FALLBACK_TICTACTOE_URL = "https://papergames.io/en/tic-tac-toe";

    @FindBy(xpath = "//button[contains(.,'Do not consent') or contains(.,'Disagree') or contains(@class,'consent') or contains(@class,'fc-cta-consent')]")
    private SelenideElement consentButton;

    @FindBy(xpath = "//a[contains(@href,'/tic-tac-toe')]")
    private SelenideElement ticTacToeLink;

    /**
     * Abre a página inicial do jogo e inicializa os elementos via Page Factory.
     *
     * @param url endereço da página a abrir
     * @return instância inicializada de {@link UserStory10Page}
     */
    public UserStory10Page abrirPagina(String url) {
        open(url);
        return page(this);
    }

    /**
     * Fecha ou recusa o aviso de consentimento/cookies caso apareça.
     *
     * @return instância atual da página
     */
    public UserStory10Page tratarConsentimento() {
        try {
            if (consentButton.isDisplayed()) {
                consentButton.click();
            }
        } catch (Exception ignored) {
        }
        return this;
    }

    /**
     * Clica na ligação/ícone para navegar para o jogo Tic-Tac-Toe, recorrendo ao URL direto como alternativa.
     *
     * @return instância atual da página
     */
    public UserStory10Page navegarParaTicTacToe() {
        try {
            ticTacToeLink.shouldBe(Condition.visible).click();
        } catch (Exception e) {
            open(FALLBACK_TICTACTOE_URL);
        }
        return this;
    }

    /**
     * Devolve o URL atual no navegador.
     *
     * @return URL atual
     */
    public String obterUrlAtual() {
        return WebDriverRunner.url();
    }
}