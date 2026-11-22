
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class da User Story 4.
 *
 * Encapsula as operações necessárias para configurar
 * o tempo ilimitado de jogo e guardar as definições.
 */
public class UserStory8 {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL =
            "https://papergames.io/en/battleship";

    private final By firstControl = By.xpath(
            "//app-juicy-button[2]/button/span[2]/button/span[3]"
    );

    private final By unlimitedTimeButton = By.xpath(
            "//button[contains(.,'Set unlimited time')]"
    );

    private final By saveSettingsButton = By.xpath(
            "//span[contains(.,'Save settings')]"
    );

    private final By secondControl = By.xpath(
            "//app-juicy-button[2]/button/span[2]/span"
    );

    /**
     * Construtor da classe.
     *
     * @param driver instância do Selenium WebDriver
     */
    public UserStory8(WebDriver driver) {
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
                        firstControl
                )
        ).click();
    }

    /**
     * Seleciona a opção Set unlimited time.
     */
    public void selectUnlimitedTime() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        unlimitedTimeButton
                )
        ).click();
    }

    /**
     * Guarda as definições do jogo.
     */
    public void saveSettings() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        saveSettingsButton
                )
        ).click();
    }

    /**
     * Executa o último clique gravado no Selenium IDE.
     */
    public void clickSecondControl() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        secondControl
                )
        ).click();
    }

    /**
     * Verifica se a opção Set unlimited time
     * está disponível.
     *
     * @return true se a opção estiver visível
     */
    public boolean isUnlimitedTimeVisible() {
        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            unlimitedTimeButton
                    )
            ).isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Verifica se o botão Save settings está visível.
     *
     * @return true se o botão estiver visível
     */
    public boolean isSaveSettingsVisible() {
        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            saveSettingsButton
                    )
            ).isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Devolve o URL atual do navegador.
     *
     * @return URL atual
     */
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
