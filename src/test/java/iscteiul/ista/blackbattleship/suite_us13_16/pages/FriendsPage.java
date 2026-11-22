package iscteiul.ista.blackbattleship.suite_us13_16.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page Object for the friends page.
 */
public class FriendsPage {

    @FindBy(css = "app-friend-invitations > span")
    private SelenideElement pendingInvitationsMessage;

    @FindBy(xpath = "//h1[contains(.,'Friends')]")
    private SelenideElement friendsTitle;

    /**
     * Returns the message about pending friend invitations.
     *
     * @return pending invitations message element
     */
    public SelenideElement pendingInvitationsMessage() {
        return pendingInvitationsMessage;
    }

    /**
     * Returns the title of the friends list.
     *
     * @return friends list title element
     */
    public SelenideElement friendsTitle() {
        return friendsTitle;
    }
}
