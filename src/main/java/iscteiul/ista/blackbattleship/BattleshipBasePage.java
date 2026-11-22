package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Base Page Object for the papergames.io Battleship pages.
 * Holds the shared WebDriver, the explicit waits and the cookie consent handling
 * used by the user story page objects.
 */
public abstract class BattleshipBasePage {

    /** URL of the Battleship home page. */
    public static final String BATTLESHIP_URL = "https://papergames.io/en/battleship";

    private static final Duration TIMEOUT = Duration.ofSeconds(15);
    private static final Duration CONSENT_TIMEOUT = Duration.ofSeconds(5);
    private static final long HUMAN_PAUSE_MS = 800;

    private final By doNotConsentButton = By.cssSelector(".fc-cta-do-not-consent");

    /** WebDriver used to drive the browser. */
    protected final WebDriver driver;

    /** Explicit wait used before interacting with page elements. */
    protected final WebDriverWait wait;

    /**
     * Creates the page object.
     *
     * @param driver WebDriver used by Selenium
     */
    protected BattleshipBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT);
    }

    /**
     * Opens the Battleship home page and declines the optional cookies.
     */
    public void openBattleshipPage() {
        driver.get(BATTLESHIP_URL);
        declineCookiesIfAsked();
    }

    /**
     * Clicks "Do not consent" on the cookie dialog, when the dialog is shown.
     * The dialog only appears on the first visit of a browser session.
     */
    public void declineCookiesIfAsked() {
        try {
            new WebDriverWait(driver, CONSENT_TIMEOUT)
                    .until(ExpectedConditions.elementToBeClickable(doNotConsentButton))
                    .click();
            pause();
        } catch (TimeoutException e) {
            // The consent dialog was not shown, so there is nothing to decline.
        }
    }

    /**
     * Waits until the element is clickable, clicks it and pauses like a human user.
     *
     * @param locator element to click
     */
    protected void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        pause();
    }

    /**
     * Waits until the element is visible, types the text and pauses like a human user.
     *
     * @param locator element to type into
     * @param text    text to type
     */
    protected void type(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
        pause();
    }

    /**
     * Waits until the element is visible and returns its trimmed text.
     *
     * @param locator element to read
     * @return visible text of the element
     */
    protected String textOf(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText().trim();
    }

    /**
     * Pauses the execution so the test runs at a pace similar to a human user.
     */
    protected void pause() {
        try {
            Thread.sleep(HUMAN_PAUSE_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
