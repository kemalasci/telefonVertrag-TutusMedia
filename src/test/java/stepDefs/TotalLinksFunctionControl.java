package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Locators;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class TotalLinksFunctionControl implements Locators {


    @When("go to home page and web page Links Control")
    public void gotohomepageandwebpageLinkControl() {
        String baseUrl = "https://telefonvertrag.de/";
        open(baseUrl);

        $(akzeptiere).shouldBe(Condition.appear).click();


        List<SelenideElement> links = $$(By.cssSelector("a"));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLink(url);
        }
    }

    public void verifyLink(String urlLink) {

        try {
            URL link = new URL(urlLink);
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            httpConn.setConnectTimeout(2000);
            httpConn.connect();
            System.out.println(httpConn.getResponseCode() + " - " + urlLink + " - " + httpConn.getResponseMessage());
        } catch (Exception e) {
            System.out.println(urlLink + " - " + e.getMessage());
        }
    }
}
