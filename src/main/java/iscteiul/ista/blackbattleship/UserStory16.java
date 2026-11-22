package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for User Story 16 - Read the Battleship rules.
 * The rules are part of the Battleship home page.
 */
public class UserStory16 extends BattleshipBasePage {

    private final By rulesTitle = By.xpath("//h2[contains(.,'Rules of Battleship')]");
    private final By rulesText = By.xpath("//h2[contains(.,'Rules of Battleship')]/following-sibling::p[1]");

    /**
     * Creates the page object.
     *
     * @param driver WebDriver used by Selenium
     */
    public UserStory16(WebDriver driver) {
        super(driver);
    }

    /**
     * Returns the title of the rules section.
     *
     * @return rules section title
     */
    public String getRulesTitle() {
        return textOf(rulesTitle);
    }

    /**
     * Returns the first paragraph of the rules section.
     *
     * @return rules text
     */
    public String getRulesText() {
        return textOf(rulesText);
    }
}
