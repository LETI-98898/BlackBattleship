package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object para a User Story 2.
 */
public class UserStory2 {

    private final WebDriver driver;

    private final By buttonLocator =
            By.cssSelector(".w-100:nth-child(2) > .btn .flex-grow-1");

    public UserStory2(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Abre a página principal.
     */
    public void openPage() {
        driver.get("https://papergames.io/en/battleship");
    }

    /**
     * Executa a ação principal da User Story 2.
     */
    public void clickButton() {
        driver.findElement(buttonLocator).click();
    }
}