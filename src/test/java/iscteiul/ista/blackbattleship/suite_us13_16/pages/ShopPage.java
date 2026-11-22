package iscteiul.ista.blackbattleship.suite_us13_16.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Page Object for the shop and its avatar sections.
 */
public class ShopPage {

    @FindBy(xpath = "//img[@alt='Monsters']")
    private SelenideElement monstersSection;

    /**
     * Opens the "Monsters" avatar section.
     *
     * @return this page
     */
    @Step("Open the Monsters avatar section")
    public ShopPage openMonstersAvatars() {
        monstersSection.click();
        return this;
    }

    /**
     * Returns the name shown on the card of the given avatar.
     *
     * @param avatarName name of the avatar
     * @return avatar name element
     */
    public SelenideElement avatarName(String avatarName) {
        return $x("//app-avatar-product//*[normalize-space()='" + avatarName + "']");
    }

    /**
     * Returns the buy button, which shows the price, of the given avatar.
     *
     * @param avatarName name of the avatar
     * @return avatar price element
     */
    public SelenideElement avatarPrice(String avatarName) {
        return $x("//app-avatar-product[.//*[normalize-space()='" + avatarName + "']]"
                + "//app-shop-purchase-product-button/button");
    }
}
