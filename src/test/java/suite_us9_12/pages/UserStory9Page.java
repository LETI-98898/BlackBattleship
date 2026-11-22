package suite_us9_12.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Page Object em Selenide (com Page Factory) para a User Story 9:
 * Consultar o registo de alterações e novidades (Changelog) da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory9Page {

    private static final String FALLBACK_CHANGELOG_URL = "https://papergames.io/en/changelog";

    @FindBy(xpath = "//button[contains(.,'Do not consent') or contains(.,'Disagree') or contains(@class,'consent') or contains(@class,'fc-cta-consent')]")
    private SelenideElement consentButton;

    @FindBy(xpath = "//a[contains(@href,'/changelog')]")
    private SelenideElement changelogLink;

    @FindBy(css = "h1, .page-title, main, .container")
    private SelenideElement changelogContainer;

    /**
     * Abre a página inicial do jogo e inicializa os elementos via Page Factory.
     *
     * @param url endereço da página a abrir
     * @return instância inicializada de {@link UserStory9Page}
     */
    public UserStory9Page abrirPagina(String url) {
        open(url);
        return page(this);
    }

    /**
     * Fecha ou recusa o aviso de consentimento/cookies caso apareça.
     *
     * @return instância atual da página
     */
    public UserStory9Page tratarConsentimento() {
        try {
            if (consentButton.isDisplayed()) {
                consentButton.click();
            }
        } catch (Exception ignored) {
        }
        return this;
    }

    /**
     * Clica na ligação de navegação para o Changelog, recorrendo ao URL direto como alternativa.
     *
     * @return instância atual da página
     */
    public UserStory9Page clicarChangelog() {
        try {
            changelogLink.shouldBe(Condition.visible).click();
            Selenide.Wait().until(driver -> WebDriverRunner.url().contains("changelog"));
        } catch (Throwable ignored) {
            open(FALLBACK_CHANGELOG_URL);
            Selenide.Wait().until(driver -> WebDriverRunner.url().contains("changelog"));
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

    /**
     * Verifica se o conteúdo do changelog está visível no ecrã.
     *
     * @return {@code true} se o contentor estiver visível, {@code false} caso contrário
     */
    public boolean isChangelogContentDisplayed() {
        try {
            changelogContainer.shouldBe(Condition.visible);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}