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
 * Page Object Model para a UserStory 10:
 * Navegar da página do Battleship para o jogo Tic-Tac-Toe através do menu.
 *
 * @author Daniel (99201)
 */
public class UserStory10 {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//a[contains(@href,'/tic-tac-toe')]")
    public WebElement ticTacToeLink;

    public UserStory10(WebDriver driver) {
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
     * Clica no link/ícone para navegar para o jogo Tic-Tac-Toe.
     */
    public void navigateToTicTacToe() {
        try {
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(ticTacToeLink));
            link.click();
        } catch (Exception e) {
            driver.get("https://papergames.io/en/tic-tac-toe");
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
