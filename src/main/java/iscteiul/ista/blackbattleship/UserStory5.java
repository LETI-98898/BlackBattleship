package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object para a User Story 1.
 */
public class UserStory5 {

    private final WebDriver driver;

    private final By buttonLocator = By.cssSelector(".btn-secondary:nth-child(2)");

    /**
     * Construtor.
     *
     * @param driver WebDriver utilizado pelo Selenium.
     */
    public UserStory5(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Abre a página principal do Battleship.
     */
    public void openPage() {
        driver.get("https://papergames.io/en/battleship");
    }

    /**
     * Executa a ação da User Story 1.
     */
    public void clickButton() {
        driver.findElement(buttonLocator).click();
    }
}