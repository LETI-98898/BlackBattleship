
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class da User Story 3.
 *
 * Encapsula as operações necessárias para
 * aceder à ligação See all.
 */
public class UserStory3 {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL =
            "https://papergames.io/en/battleship";

    private final By seeAllLink = By.xpath(
            "//a[contains(text(),'See all')]"
    );

    /**
     * Construtor da classe.
     *
     * @param driver instância do Selenium WebDriver
     */
    public UserStory3(WebDriver driver) {
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
     * Clica na ligação See all.
     */
    public void clickSeeAll() {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        seeAllLink
                )
        ).click();
    }

    /**
     * Verifica se a ligação See all está visível.
     *
     * @return true se a ligação estiver visível
     */
    public boolean isSeeAllVisible() {
        try {
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            seeAllLink
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
