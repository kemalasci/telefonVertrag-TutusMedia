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
     $(mailInput).shouldBe(Condition.appear).scrollTo().sendKeys("kayitkayiticin@gmail.com");
      sleep(4000);
       $(registrationButton).click();
       sleep(4000);
      // $(newsletterButtonAlert).shouldBe(Condition.appear).shouldHave(Condition.text("400"));
       Assert.assertEquals(newsletterButtonAlert,"400: kayitkayiticin@gmail.com is already a list member. Use PUT to insert or update list members." );
   }


}
