package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Locators;
import utils.Utils;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.*;

public class NewsletterAnmeldenFunctionStepdefs extends Utils implements Locators {


    @When("Subscribe to the newsletter")
    public void subscribeToTheNewsletter() {
        $(mailInput).shouldBe(Condition.appear).scrollTo().sendKeys(mail);
        sleep(2000);
        $(registrationButton).click();
        sleep(2000);
       String b = $(anmeldenControl).shouldBe(Condition.enabled).getText();
       Assert.assertEquals(b, "400: kayitkayiticin@gmail.com is already a list member. Use PUT to insert or update list members.");
        $(newsletterAbmelden).shouldBe(Condition.appear).click();

        $(inputNewsAbmelden).sendKeys(mail);
        sleep(4000);
        $(buttonAbmelden).shouldHave(Condition.appear).click();
        String a = $(abmeldenControl).shouldBe(Condition.visible).getText();
        Assert.assertEquals(a, "Die Adresse kayitkayiticin@gmail.com wurde soeben aus unserem Newsletter Verteiler entfernt.");
    }


}
