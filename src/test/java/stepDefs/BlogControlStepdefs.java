package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.Locators;

import static com.codeborne.selenide.Selenide.*;

public class BlogControlStepdefs implements Locators {
    @When("Control blog picture")
    public void controlBlogPicture() {


        $(blog).scrollTo().shouldBe(Condition.appear).click();
        sleep(1000);

        int i = 0;
        int arrSize = 0;
        while (true){
            arrSize = $$(blogControl).size();

            if (i==arrSize) {
                break;
            }else {
                if ($(blogControl, i).exists())
                {
                    $(blogControl, i).scrollTo();



                    i++;

                    System.out.println(i);
                    sleep(2000);
                }
            }

        }

      // for (int i = 0; i < 105; i++) {
      //     if (i % 4 == 0) {
      //         sleep(2000);
      //         $(mehrErfahrenButton, i).scrollTo().shouldBe(Condition.enabled);
      //     }


      // }


    }


    //  $(pageUpButton).shouldBe(Condition.enabled).click();

    ////  $(pageUpButton).shouldBe(Condition.enabled).click();
    //   for (SelenideElement picture : $$(pictureControl)) {
    //       picture.scrollTo().shouldBe(Condition.enabled).click();
    //       picture.shouldBe(Condition.enabled);
    //
    //   }


}

