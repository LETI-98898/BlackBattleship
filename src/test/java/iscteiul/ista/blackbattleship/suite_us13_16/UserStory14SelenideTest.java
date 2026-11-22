package iscteiul.ista.blackbattleship.suite_us13_16;

import iscteiul.ista.blackbattleship.suite_us13_16.pages.BattleshipHomePage;
import iscteiul.ista.blackbattleship.suite_us13_16.pages.FriendsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;

/**
 * Selenide acceptance test for User Story 14 - View the friends list.
 */
@Epic("Battleship")
@Feature("Social")
@Story("US14 - Consultar a lista de amigos")
class UserStory14SelenideTest extends BattleshipSelenideTest {

    /**
     * Chooses a guest nickname, leaves the robot game and checks the friends page.
     */
    @Test
    @DisplayName("US14 - Guest with a nickname can view the friends list")
    void guestCanViewFriendsList() {
        FriendsPage friends = BattleshipHomePage.openPage()
                .clickPlayVsRobot()
                .chooseNickname("Simao130768")
                .abortGame()
                .openFriendsPage();

        friends.pendingInvitationsMessage().shouldHave(exactText("No pending invitations."));
        friends.friendsTitle().shouldHave(exactText("Friends"));
    }
}
