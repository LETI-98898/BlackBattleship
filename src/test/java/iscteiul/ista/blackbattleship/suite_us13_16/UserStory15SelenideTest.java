package iscteiul.ista.blackbattleship.suite_us13_16;

import iscteiul.ista.blackbattleship.suite_us13_16.pages.BattleshipHomePage;
import iscteiul.ista.blackbattleship.suite_us13_16.pages.ShopPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;

/**
 * Selenide acceptance test for User Story 15 - Browse the avatar shop.
 */
@Epic("Battleship")
@Feature("Shop")
@Story("US15 - Explorar a loja de Avatares")
class UserStory15SelenideTest extends BattleshipSelenideTest {

    /**
     * Opens the avatar shop and checks that an avatar is listed with its price.
     */
    @Test
    @DisplayName("US15 - Shop lists avatars with their prices")
    void shopListsAvatarsWithPrices() {
        ShopPage shop = BattleshipHomePage.openPage()
                .openShop()
                .openMonstersAvatars();

        shop.avatarName("Mr. Happy").shouldHave(exactText("Mr. Happy"));
        shop.avatarPrice("Mr. Happy").shouldHave(exactText("990"));
    }
}
