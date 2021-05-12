package stepDefs;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class BlogKontrolAlternatif {
    @Test
    public void test01(){
        open("https://telefonvertrag.de/blog/");

        int i = 0;
        int arrSize = 0;
        while (true){
            arrSize = $$(By.xpath("//div/span[text()='Blog']")).size();

            if (Selenide.atBottom()) {
                break;
            }else {
                if ($(By.xpath("//div/span[text()='Blog']"), i).exists()) {
                    $(By.xpath("//div/span[text()='Blog']"), i).scrollTo();
                    i++;
                    System.out.println(i);
                }
            }

        }
    }
}





