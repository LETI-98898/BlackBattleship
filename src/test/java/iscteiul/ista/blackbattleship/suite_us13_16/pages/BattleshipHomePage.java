package iscteiul.ista.blackbattleship.suite_us13_16.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Page Object for the papergames.io Battleship home page.
 * Elements are initialised by Selenide's Page Factory through {@link FindBy}.
 */
public class BattleshipHomePage {

    /** URL of the Battleship home page. */
    public static final String URL = "https://papergames.io/en/battleship";

    private static final Duration CONSENT_TIMEOUT = Duration.ofSeconds(5);

    @FindBy(css = ".fc-cta-do-not-consent")
    private SelenideElement doNotConsentButton;

    @FindBy(xpath = "//span[contains(@class,'front') and normalize-space()='Create tournament']")
    private SelenideElement createTournamentButton;

    @FindBy(xpath = "//span[contains(@class,'flex-grow-1') and normalize-space()='Play vs robot']")
    private SelenideElement playVsRobotButton;

    @FindBy(css = "a.nav-link[href*='/en/shop']")
    private SelenideElement shopLink;

    @FindBy(xpath = "//h2[contains(.,'Rules of Battleship')]")
    private SelenideElement rulesTitle;

    @FindBy(xpath = "//h2[contains(.,'Rules of Battleship')]/following-sibling::p[1]")
    private SelenideElement rulesText;

    /**
     * Opens the Battleship home page and declines the optional cookies.
     *
     * @return the Battleship home page
     */
    @Step("Open the Battleship home page")
    public static BattleshipHomePage openPage() {
        BattleshipHomePage home = open(URL, BattleshipHomePage.class);
        home.declineCookiesIfAsked();
        return home;
    }

    /**
     * Clicks "Do not consent" on the cookie dialog, when the dialog is shown.
     * The dialog only appears on the first visit of a browser session.
     */
    @Step("Decline optional cookies")
    public void declineCookiesIfAsked() {
        if (doNotConsentButton.is(visible, CONSENT_TIMEOUT)) {
            doNotConsentButton.click();
        }
    }

    /**
     * Clicks "Create tournament".
     *
     * @return the tournament creation page
     */
    @Step("Click Create tournament")
    public TournamentCreationPage clickCreateTournament() {
        createTournamentButton.click();
        return page(TournamentCreationPage.class);
    }

    /**
     * Clicks "Play vs robot".
     *
     * @return the robot game page, which first asks for a guest nickname
     */
    @Step("Click Play vs robot")
    public RobotGamePage clickPlayVsRobot() {
        playVsRobotButton.click();
        return page(RobotGamePage.class);
    }

    /**
     * Opens the shop from the side menu.
     *
     * @return the shop page
     */
    @Step("Open the shop")
    public ShopPage openShop() {
        shopLink.click();
        return page(ShopPage.class);
    }

    /**
     * Returns the title of the rules section.
     *
     * @return rules section title element
     */
    public SelenideElement rulesTitle() {
        return rulesTitle;
    }

    /**
     * Returns the first paragraph of the rules section.
     *
     * @return rules text element
     */
    public SelenideElement rulesText() {
        return rulesText;
    }
}
