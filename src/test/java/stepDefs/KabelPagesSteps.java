package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Locators;
import utils.Utils;

import static com.codeborne.selenide.Selenide.*;

public class KabelPagesSteps extends Utils implements Locators {

    String tariff;

    @Given("navigate to Telefon Vertrag Kabel page")
    public void navigateToTelefonVertragKabelPage() {
        Configuration.startMaximized = true;

        open(url);

       // if ($(akzeptiere).is(Condition.enabled)) {
            $(akzeptiere).click();
        //}
        $(kabel).shouldBe(Condition.appear).click();


    }

    @When("the information of the tariffs should be appear")
    public void theInformationOfTheTariffsShouldBeAppear() {

        $(kabelSub).shouldBe(Condition.appear);

        if ($(kabelSub).getText().equals("Kabel"))

            for (SelenideElement tariff : $$(kabelTarifNameList)) {
                System.out.println(tariff.getText());
                Assert.assertTrue(tariff.getText().contains("Cable"));
            }

    }

    @Then("User should be able to see the correct information about selected product")
    public void userShouldBeAbleToSeeTheCorrectInformationAboutSelectedProduct() {
        int size = $$(kabelButonList).size();
        int index = randomSayi(size);

        tariff = $$(kabelTarifNameList).get(index).getText();
        System.out.println("tariff = " + tariff);

        $$(kabelButonList).get(index).click();
   //     sleep(2000);

        $(actuelTarif).shouldHave(Condition.text(tariff));
        String actuelTarifName = $(actuelTarif).getText();
        System.out.println("actuelTarifName = " + actuelTarifName);
        Assert.assertEquals(actuelTarifName, tariff);


    }

    @Then("user should be able to write a comment about selected tariff")
    public void userShouldBeAbleToWriteACommentAboutSelectedTariff() {
        $(tarifeBewertungen).scrollTo().shouldBe(Condition.appear).click();

        $(vorAndNachname).shouldBe(Condition.appear).setValue("Techno Study");
        $(email).setValue("techno@study.com");
        $(kommentar).setValue("Tarife Kullanilabilir...");
        $(bwrtngnSenden).click();

    }

    @Then("user should be able to add tariff to the cart and place their order")
    public void userShouldBeAbleToAddTariffToTheCartAndPlaceTheirOrder() {

        $(warenKorb).scrollTo().shouldBe(Condition.appear).click();
    }


}
