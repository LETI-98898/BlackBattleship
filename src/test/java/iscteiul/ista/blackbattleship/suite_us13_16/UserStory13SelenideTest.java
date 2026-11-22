package iscteiul.ista.blackbattleship.suite_us13_16;

import iscteiul.ista.blackbattleship.suite_us13_16.pages.BattleshipHomePage;
import iscteiul.ista.blackbattleship.suite_us13_16.pages.TournamentCreationPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;

/**
 * Selenide acceptance test for User Story 13 - Create a Battleship tournament.
 */
@Epic("Battleship")
@Feature("Tournaments")
@Story("US13 - Criar torneio de Battleship")
class UserStory13SelenideTest extends BattleshipSelenideTest {

    /**
     * Fills in the tournament form, checks the preview and checks that a guest
     * is asked to sign in when creating the tournament.
     */
    @Test
    @DisplayName("US13 - Guest fills in the tournament form and is asked to sign in")
    void createTournamentAsksGuestToSignIn() {
        TournamentCreationPage creation = BattleshipHomePage.openPage()
                .clickCreateTournament()
                .enterTournamentName("Torneio ES 130768")
                .selectLeaderboardMode();

        creation.previewGameAndMode().shouldHave(exactText("BATTLESHIP · LEADERBOARD"));

        creation.clickCreateAndShare();

        creation.continueWithEmailButton().shouldBe(visible).shouldHave(exactText("Continue with email"));
        creation.closeSignInDialog();
    }
}
