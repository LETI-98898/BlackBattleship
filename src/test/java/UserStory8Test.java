
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 4.
 *
 * Testa a configuração do tempo ilimitado
 * e a gravação das definições do jogo.
 */
public class UserStory8Test {

    private WebDriver driver;
    private UserStory8 page;

    /**
     * Inicializa o navegador antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        page = new UserStory8(driver);
    }

    /**
     * Testa a configuração do tempo ilimitado.
     */
    @Test
    public void UserStoryTest4() {

        // Abrir a página inicial
        page.openPage();

        // Verificar se a página foi carregada
        assertTrue(
                page.getCurrentUrl().contains(
                        "papergames.io"
                ),
                "A página inicial não foi carregada."
        );

        // Executar o primeiro clique
        page.clickFirstControl();

        // Verificar se a opção de tempo ilimitado está disponível
        assertTrue(
                page.isUnlimitedTimeVisible(),
                "A opção Set unlimited time não está visível."
        );

        // Selecionar tempo ilimitado
        page.selectUnlimitedTime();

        // Verificar se a opção para guardar está disponível
        assertTrue(
                page.isSaveSettingsVisible(),
                "O botão Save settings não está visível."
        );

        // Guardar as definições
        page.saveSettings();

        // Executar o último clique
        page.clickSecondControl();
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
