package iscteiul.ista.blackbattleship.suite_us13_16;

import iscteiul.ista.blackbattleship.suite_us13_16.pages.BattleshipHomePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;

/**
 * Selenide acceptance test for User Story 16 - Read the Battleship rules.
 */
@Epic("Battleship")
@Feature("Game guide")
@Story("US16 - Consultar as regras do jogo Battleship")
class UserStory16SelenideTest extends BattleshipSelenideTest {

    /**
     * Checks that the rules section and its text are shown on the Battleship page.
     */
    @Test
    @DisplayName("US16 - Rules are shown on the Battleship page")
    void rulesAreShownOnBattleshipPage() {
        BattleshipHomePage home = BattleshipHomePage.openPage();

        home.rulesTitle().shouldHave(exactText("Rules of Battleship game online"));
        home.rulesText().shouldHave(text("Battleship is a turn-based 2-player game"));
    }
}
