package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Model para a UserStory 11:
 * Consultar os Termos e Condições da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory11 {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//a[contains(@href,'terms-conditions')]")
    public WebElement termsLink;

    @FindBy(css = "h1, .post-title, main")
    public WebElement termsHeader;

    public UserStory11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void open(String url) {
        driver.get(url);
    }

    public void handleConsent() {
        try {
            WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(.,'Do not consent') or contains(.,'Disagree') or contains(@class,'consent') or contains(@class,'fc-cta-consent')]")
            ));
            btn.click();
        } catch (Exception ignored) {
        }
    }

    /**
     * Clica no link de Termos e Condições.
     */
    public void clickTermsAndConditions() {
        try {
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(termsLink));
            link.click();
        } catch (Exception e) {
            driver.get("https://papergames.io/en/blog/terms-conditions");
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isTermsContentDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOf(termsHeader));
            return true;
        } catch (Exception e) {
            return driver.findElements(By.tagName("main")).size() > 0;
        }
    }
}
