package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.When;
import pages.Locators;
import utils.Utils;

import static com.codeborne.selenide.Selenide.*;

public class UntenLinkStepdefs extends Utils implements Locators {
    @When("Control unten link")
    public void controlUntenLink() {

        for (int i = 4; i <=$$(untenLink).size(); i++) {
            $$(untenLink).get(i).click();
            sleep(2000);
            $(webPageTitle).shouldBe(Condition.enabled);
            Selenide.back();
        }

    }
}
