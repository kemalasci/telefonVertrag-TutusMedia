package stepDefs;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Locators;

import static com.codeborne.selenide.Selenide.*;

public class TopTarifStepdefs implements Locators {


    @Given("open Telefonvertrag web page")
    public void openTelefonvertragWebPage() {
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        open(url);

        $(akzeptiere).shouldBe(Condition.appear).click();
    }

    @When("control home page top tariff")
    public void controlHomePageTopTariff() {
        $$(topTarif).shouldHave(CollectionCondition.size(3));
    }

    @When("for more top tariffs click right  arrow und tariff control")
    public void forMoretopTariffsClickRightArrowUndTariffControl() {
        $(buttonRight).shouldBe(Condition.enabled).click();
        $$(topTarif).shouldHave(CollectionCondition.size(3));
        $(buttonRight).shouldBe(Condition.appear).click();
        $$(topTarif).shouldHave(CollectionCondition.size(3));
    }
}
