package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object para a User Story 4.
 */
public class UserStory4 {

    private final WebDriver driver;

    private final By createPrivateRoomButton =
            By.cssSelector(".w-100:nth-child(1) > .btn-lg .flex-grow-1");

    public UserStory4(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Abre a página principal do jogo.
     */
    public void openPage() {
        driver.get("https://papergames.io/en/battleship");
    }

    /**
     * Clica no botão de criação de sala privada.
     */
    public void clickCreatePrivateRoom() {
        driver.findElement(createPrivateRoomButton).click();
    }
}