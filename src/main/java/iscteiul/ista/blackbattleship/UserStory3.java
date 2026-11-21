package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object para a User Story 3.
 */
public class UserStory3 {

    private final WebDriver driver;

    private final By menuButton =
            By.xpath("//span/button/span[3]");

    private final By creditButton =
            By.cssSelector(".credit");

    private final By menuItem =
            By.xpath("//div[@id='mat-menu-panel-serverApp0']/div/a/span/span");

    private final By inputField =
            By.id("mat-input-serverApp0");

    private final By updateButton =
            By.cssSelector(".btn-secondary");

    public UserStory3(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://papergames.io/en/battleship");
    }

    public void executeUserStory() {
        driver.findElement(menuButton).click();
        driver.findElement(creditButton).click();
        driver.findElement(menuItem).click();
        driver.findElement(inputField).click();
        driver.findElement(inputField).click();
        driver.findElement(updateButton).click();
    }
}