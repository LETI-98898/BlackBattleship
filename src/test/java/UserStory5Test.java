
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class responsável pela execução
 * dos testes da User Story 1.
 *
 * Utiliza a classe UserStory1 para interagir
 * com a aplicação, seguindo o padrão POM.
 */
public class UserStory5Test {

    private WebDriver driver;
    private UserStory5 page;

    /**
     * Inicializa o navegador e prepara a página
     * antes da execução de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        page = new UserStory5(driver);
    }

    /**
     * Executa o cenário de teste gravado no Selenium IDE.
     *
     * Verifica que a página do Battleship é carregada
     * e executa as interações registadas no ficheiro
     * TestSuite_98898.side.
     */
    @Test
    public void UserStoryTest1() {

        // Abrir a página inicial
        page.openPage();

        // Verificar se a página foi carregada
        assertTrue(
                page.isBattleshipPage(),
                "A página do Battleship não foi carregada."
        );

        // Executar as interações gravadas
        page.clickFirstControl();

        page.clickSecondControl();

        page.clickMusicRipple();

        page.clickMusicIcons();

        page.closeSettings();
    }

    /**
     * Fecha o navegador depois da execução do teste,
     * garantindo a libertação dos recursos utilizados.
     */
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
