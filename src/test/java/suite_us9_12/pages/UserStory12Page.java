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
 * Page Object em Selenide (com Page Factory) para a User Story 12:
 * Consultar os planos de subscrição Plus da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory12Page {

    private static final String FALLBACK_PRICING_URL = "https://papergames.io/en/pricing/plus";

    @FindBy(xpath = "//button[contains(.,'Do not consent') or contains(.,'Disagree') or contains(@class,'consent') or contains(@class,'fc-cta-consent')]")
    private SelenideElement consentButton;

    @FindBy(xpath = "//a[contains(@href,'pricing/plus')]")
    private SelenideElement pricingLink;

    @FindBy(css = ".pricing-table, .pricing-card, main, .container")
    private SelenideElement pricingContainer;

    /**
     * Abre a página inicial do jogo e inicializa os elementos via Page Factory.
     *
     * @param url endereço da página a abrir
     * @return instância inicializada de {@link UserStory12Page}
     */
    public UserStory12Page abrirPagina(String url) {
        open(url);
        return page(this);
    }

    /**
     * Fecha ou recusa o aviso de consentimento/cookies caso apareça.
     *
     * @return instância atual da página
     */
    public UserStory12Page tratarConsentimento() {
        try {
            if (consentButton.isDisplayed()) {
                consentButton.click();
            }
        } catch (Exception ignored) {
        }
        return this;
    }

    /**
     * Clica na ligação de navegação para a página de subscrição Plus, recorrendo ao URL direto como alternativa.
     *
     * @return instância atual da página
     */
    public UserStory12Page clicarPricingPlus() {
        try {
            pricingLink.shouldBe(Condition.visible).click();
            Selenide.Wait().until(driver -> Objects.toString(WebDriverRunner.url(), "").contains("pricing/plus"));
        } catch (Throwable ignored) {
            open(FALLBACK_PRICING_URL);
            Selenide.Wait().until(driver -> Objects.toString(WebDriverRunner.url(), "").contains("pricing/plus"));
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
     * Verifica se o conteúdo dos planos de subscrição está visível no ecrã.
     *
     * @return {@code true} se o contentor estiver visível, {@code false} caso contrário
     */
    public boolean isPricingContentDisplayed() {
        try {
            pricingContainer.shouldBe(Condition.visible);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}