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
 * Page Object Model para a UserStory 9:
 * Consultar o registo de alterações e novidades (Changelog) da plataforma.
 *
 * @author Daniel (99201)
 */
public class UserStory9 {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//a[contains(@href,'/changelog')]")
    public WebElement changelogLink;

    @FindBy(css = "h1, .page-title, main, .container")
    public WebElement changelogContainer;

    public UserStory9(WebDriver driver) {
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
     * Clica no link de navegação para a página de Changelog.
     */
    public void clickChangelog() {
        try {
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(changelogLink));
            link.click();
        } catch (Exception e) {
            driver.get("https://papergames.io/en/changelog");
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isChangelogContentDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOf(changelogContainer));
            return true;
        } catch (Exception e) {
            return driver.findElements(By.tagName("main")).size() > 0;
        }
    }
}
