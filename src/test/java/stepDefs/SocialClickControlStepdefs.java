package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.Locators;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class SocialClickControlStepdefs extends BaseStaticDriver implements Locators {

    @Given("open web page")
    public void openWebPage() {

        driver.get("https://telefonvertrag.de/");
        driver.manage().window().maximize();


        WebElement element = driver.findElement(akzeptiere);
        element.click();

    }

    @When("click social media web pages  links")
    public void clickSocialMediaWebPagesLinks() {
        String anaSayfaIDsi = driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(By.cssSelector("div.top>div.left>a"));

        for (WebElement link : linkler) {
            link.click();


        }
        Set<String> windowIDler = driver.getWindowHandles();

        for (String ID : windowIDler) {
            if (ID.equals(anaSayfaIDsi)) continue;


            driver.switchTo().window(ID);


            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("com"));

            driver.close();

        }
        driver.quit();
    }
}
