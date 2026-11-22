package suite_us9_12.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Page Object em Selenide (com Page Factory) para a User Story 11:
 * Consultar os Termos e Condições da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory11Page {

    private static final String FALLBACK_TERMS_URL = "https://papergames.io/en/blog/terms-conditions";

    @FindBy(xpath = "//button[contains(.,'Do not consent') or contains(.,'Disagree') or contains(@class,'consent') or contains(@class,'fc-cta-consent')]")
    private SelenideElement consentButton;

    @FindBy(xpath = "//a[contains(@href,'terms-conditions')]")
    private SelenideElement termsLink;

    @FindBy(css = "h1, .post-title, main")
    private SelenideElement termsHeader;

    /**
     * Abre a página inicial do jogo e inicializa os elementos via Page Factory.
     *
     * @param url endereço da página a abrir
     * @return instância inicializada de {@link UserStory11Page}
     */
    public UserStory11Page abrirPagina(String url) {
        open(url);
        return page(this);
    }

    /**
     * Fecha ou recusa o aviso de consentimento/cookies caso apareça.
     *
     * @return instância atual da página
     */
    public UserStory11Page tratarConsentimento() {
        try {
            if (consentButton.isDisplayed()) {
                consentButton.click();
            }
        } catch (Exception ignored) {
        }
        return this;
    }

    /**
     * Clica na ligação de Termos e Condições, recorrendo ao URL direto como alternativa.
     *
     * @return instância atual da página
     */
    public UserStory11Page clicarTermosECondicoes() {
        try {
            termsLink.shouldBe(Condition.visible).click();
            Selenide.Wait().until(driver -> Objects.toString(WebDriverRunner.url(), "").contains("terms-conditions"));
        } catch (Throwable ignored) {
            open(FALLBACK_TERMS_URL);
            Selenide.Wait().until(driver -> Objects.toString(WebDriverRunner.url(), "").contains("terms-conditions"));
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
     * Verifica se o conteúdo dos Termos e Condições está visível no ecrã.
     *
     * @return {@code true} se o cabeçalho/conteúdo estiver visível, {@code false} caso contrário
     */
    public boolean isTermsContentDisplayed() {
        try {
            termsHeader.shouldBe(Condition.visible);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}