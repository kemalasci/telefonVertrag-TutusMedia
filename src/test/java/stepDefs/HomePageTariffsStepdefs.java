package stepDefs;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Locators;

import static com.codeborne.selenide.Selenide.*;

public class HomePageTariffsStepdefs implements Locators {
    @Given("Navigate to Telefon Vertrag Home Page")
    public void navigateToTelefonVertragHomePage() {
        Configuration.startMaximized = true;
        open(url);
        $(akzeptiere).click();
    }
    @When("Kabel tariffs should be appear")
    public void kabelTariffsShouldBeAppear() {
        $(kabel).shouldBe(Condition.appear).click();
        $$(dslTarifNameList).shouldHave(CollectionCondition.size(8));
        sleep(3000);

    }

    @Then("DSL tariffs should be appear")
    public void dslTariffsShouldBeAppear() {
        $(dsl).click();
        $$(dslTarifNameList).shouldHave(CollectionCondition.size(4));
        sleep(3000);
    }

    @And("GigaTV tariffs should be appear")
    public void gigatvTariffsShouldBeAppear() {
        $(gigaTV).click();
        $$(gigaSub).shouldHave(CollectionCondition.size(4));
    }



}
