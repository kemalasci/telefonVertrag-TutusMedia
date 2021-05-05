package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Locators;
import utils.Utils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DslStepdefs extends Utils implements Locators {
    String tariff;
    int index;
    int size;

    @Given("Navigate to Telefon Vertrag Dsl Page")
    public void navigateToTelefonVertragDslPage() {
        Configuration.startMaximized = true;

        open(url);
        $(akzeptiere).click();
        $(dsl).shouldBe(Condition.appear).click();

    }

    @When("the information of the Dsl tariffs should be appear")
    public void theInformationOfTheDslTariffsShouldBeAppear() {
        $(dslSub).shouldBe(Condition.appear);

        if ($(dslSub).getText().equals("DSL"))
            for (SelenideElement tariff : $$(dslTarifNameList)) {
                System.out.println(tariff.getText());
                Assert.assertTrue(tariff.getText().contains("DSL"));
            }


    }

    @Then("User should be able to see the correct information about selected DSL product")
    public void userShouldBeAbleToSeeTheCorrectInformationAboutSelectedDSLProduct() {
        size = $$(dslButonList).size();
        index = randomSayi(size);

        tariff = $$(dslTarifNameList).get(index).getText();
        System.out.println("Tarif" + tariff);

        $$(dslButonList).get(index).click();
        $(actuelTarif).shouldHave(text(tariff));
        String actualTarifName = $(actuelTarif).getText();
        System.out.println(actualTarifName);

        Assert.assertEquals(actualTarifName, tariff);


        //

    }


    @And("Extra products should be purchased according to the tariff.")
    public void extraProductsShouldBePurchasedAccordingToTheTariff() {
        $(warenKorb).shouldBe(Condition.visible).scrollTo().click();
        sleep(1000);
        size = $$(fritzBoxList).size();
        index = randomSayi(size);

        $$(fritzBoxList).get(index).scrollTo().hover().shouldBe(Condition.visible).click();
        $(extrasSicherheitsPaket).scrollTo().click();
        $(talkTariff).scrollTo().click();


    }

    @And("Total paycheck between the shopping cart and the personal information page")
    public void totalPaycheckBetweenTheShoppingCartAndThePersonalInformationPage() {
        int total1 = stringToTotal($$(salaryList));
        $(jetztBestellen).shouldBe(Condition.appear).click();

        int total2 = stringToTotal($$(salaryList));
        Assert.assertEquals(total1, total2);

    }

    @And("fill the form and test bank details negative")
    public void fillTheFormAndTestBankDetailsNegative() {
        //size = $$(ausweisList).size();
        //index = randomSayi(size);

        $$(gender).get(0).click();
        $(frauGender).shouldBe(Condition.enabled).click();
        $$(titel).get(1).click();
        $(titelDr).shouldBe(Condition.enabled).click();
        $(name).sendKeys("adsfasdf");
        $(surName).sendKeys("bbbbbbbb");
        $(telefon).sendKeys("01784561122");
        $(emailWarenKorp).sendKeys(randomString());
        $(plz).sendKeys(randomPlz());
        $(wohnOrt).sendKeys("Koln");
        $(strasse).sendKeys("sdfasdfasdfasd");
        $(hausNumber).sendKeys("1231");

        $$(ausweisList).get(1).shouldBe(Condition.appear).click();
        $(ausstellungOrt).sendKeys(randomCountry());
        $(geburstDatum).sendKeys(randomDate());
        sleep(2000);
        $(geburstOrt).sendKeys(randomCountry());
        sleep(2000);
        $(gültigkeit).sendKeys(randomDate());

        $(ausweisNumber).sendKeys("132132121");
        $(lageTelefonDose).scrollTo().sendKeys("Asagi Ayranci");
        $(iban).sendKeys("DE65 4605 0001 2565 0136 57");
        sleep(2000);
        $(versand).scrollTo().shouldBe(Condition.appear).click();
        $(weiter).click();
        $(ibanFalseMsj).shouldHave(text("IBAN."));
        sleep(4000);
    }
}
//a[text()='Weiter']