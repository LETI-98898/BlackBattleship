
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class responsável pelas operações
 * realizadas na página inicial do jogo Battleship.
 *
 * Encapsula os localizadores e as interações com
 * os elementos da interface.
 */
public class UserStory1 {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL =
            "https://papergames.io/en/battleship";

    // Localizadores obtidos através do Selenium IDE
    private final By recordedControl =
            By.cssSelector(
                    ".cdk-focused > .mat-mdc-button-touch-target"
            );

    private final By musicButton =
            By.id("settings-music-button");

    private final By musicRipple =
            By.cssSelector(
                    "#settings-music-button .mdc-switch__ripple"
            );

    private final By musicIcons =
            By.cssSelector(
                    "#settings-music-button .mdc-switch__icons"
            );

    private final By settingsDialog =
            By.id("mat-mdc-dialog-serverApp0");

    /**
     * Construtor da Page Object Class.
     *
     * @param driver instância do Selenium WebDriver
     */
    public UserStory1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
        );
    }

    /**
     * Abre a página inicial do Battleship.
     */
    public void openPage() {
        driver.get(URL);
    }

    /**
     * Executa o primeiro clique gravado no Selenium IDE.
     */
    public void clickFirstControl() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        recordedControl
                )
        ).click();
    }

    /**
     * Executa o segundo clique gravado no Selenium IDE.
     */
    public void clickSecondControl() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        recordedControl
                )
        ).click();
    }

    /**
     * Interage com o elemento ripple da opção de música.
     */
    public void clickMusicRipple() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        musicRipple
                )
        ).click();
    }

    /**
     * Interage com os ícones do botão de música.
     */
    public void clickMusicIcons() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        musicIcons
                )
        ).click();
    }

    /**
     * Fecha a janela de definições através do controlo
     * gravado no Selenium IDE.
     */
    public void closeSettings() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        recordedControl
                )
        ).click();
    }

    /**
     * Verifica se o navegador está na página do Battleship.
     *
     * @return true se o URL corresponder à página esperada
     */
    public boolean isBattleshipPage() {
        return driver.getCurrentUrl().contains(
                "/en/battleship"
        );
    }

    /**
     * Verifica se a opção de música está presente.
     *
     * @return true se o botão de música estiver visível
     */
    public boolean isMusicButtonVisible() {
        try {
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            musicButton
                    )
            );
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
