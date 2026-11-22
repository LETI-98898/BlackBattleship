
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class da User Story 2.
 *
 * Encapsula os localizadores e as operações
 * necessárias para aceder à secção My tournaments.
 */
public class UserStory2 {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL =
            "https://papergames.io/en/battleship";

    private final By firstControl = By.xpath(
            "//span/button/span[3]"
    );

    private final By myTournamentsLink = By.xpath(
            "//span[contains(.,'My tournaments')]"
    );

    /**
     * Construtor da classe.
     *
     * @param driver instância do Selenium WebDriver
     */
    public UserStory2(WebDriver driver) {
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
     * Clica na opção My tournaments.
     */
    public void clickMyTournaments() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        myTournamentsLink
                )
        ).click();
    }

    /**
     * Verifica se a opção My tournaments está visível.
     *
     * @return true se a opção estiver visível
     */
    public boolean isMyTournamentsVisible() {
        try {
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            myTournamentsLink
                    )
            );

            return element.isDisplayed();

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
