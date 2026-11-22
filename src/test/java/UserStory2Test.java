
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 2.
 *
 * Executa o cenário de acesso à opção
 * My tournaments utilizando a classe UserStory2.
 */
public class UserStory2Test {

    private WebDriver driver;
    private UserStory2 page;

    /**
     * Inicializa o navegador antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        page = new UserStory2(driver);
    }

    /**
     * Testa o acesso à secção My tournaments.
     */
    @Test
    public void UserStoryTest2() {

        // Abrir a página
        page.openPage();

        // Verificar que a página foi carregada
        assertTrue(
                page.getCurrentUrl().contains(
                        "papergames.io"
                ),
                "A página inicial não foi carregada."
        );

        // Executar o primeiro clique
        page.clickFirstControl();

        // Verificar a disponibilidade de My tournaments
        assertTrue(
                page.isMyTournamentsVisible(),
                "A opção My tournaments não está visível."
        );

        // Aceder a My tournaments
        page.clickMyTournaments();
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
