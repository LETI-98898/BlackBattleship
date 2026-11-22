package iscteiul.ista.blackbattleship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for User Story 15 - Browse the avatar shop.
 */
public class UserStory15 extends BattleshipBasePage {

    private final By shopLink = By.cssSelector("a.nav-link[href*='/en/shop']");
    private final By monstersSection = By.xpath("//img[@alt='Monsters']");

    /**
     * Creates the page object.
     *
     * @param driver WebDriver used by Selenium
     */
    public UserStory15(WebDriver driver) {
        super(driver);
    }

    /**
     * Opens the shop from the side menu.
     */
    public void openShop() {
        click(shopLink);
    }

    /**
     * Opens the "Monsters" avatar section of the shop.
     */
    public void openMonstersAvatars() {
        click(monstersSection);
    }

    /**
     * Returns the name shown on the avatar card with the given name.
     *
     * @param avatarName name of the avatar to look for
     * @return avatar name shown on the card
     */
    public String getAvatarName(String avatarName) {
        return textOf(By.xpath("//app-avatar-product//*[normalize-space()='" + avatarName + "']"));
    }

    /**
     * Returns the price shown on the buy button of the given avatar.
     *
     * @param avatarName name of the avatar
     * @return avatar price, as shown on the page
     */
    public String getAvatarPrice(String avatarName) {
        return textOf(By.xpath("//app-avatar-product[.//*[normalize-space()='" + avatarName + "']]"
                + "//app-shop-purchase-product-button/button"));
    }
}
