
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 3.
 *
 * Testa a funcionalidade associada à ligação See all,
 * utilizando a Page Object Class UserStory3.
 */
public class UserStory3Test {

    private WebDriver driver;
    private UserStory3 page;

    /**
     * Inicializa o navegador antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        page = new UserStory3(driver);
    }

    /**
     * Testa a ligação See all.
     */
    @Test
    public void UserStoryTest3() {

        // Abrir a página inicial
        page.openPage();

        // Verificar se a página foi carregada
        assertTrue(
                page.getCurrentUrl().contains(
                        "papergames.io"
                ),
                "A página inicial não foi carregada."
        );

        // Verificar se a ligação está visível
        assertTrue(
                page.isSeeAllVisible(),
                "A ligação See all não está visível."
        );

        // Clicar na ligação
        page.clickSeeAll();
    }

    /**
     * Fecha o navegador depois da execução do teste.
     */
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
