package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Locators;

import java.util.Random;
import java.util.UUID;
import java.util.Locale;
import java.util.GregorianCalendar;

import static com.codeborne.selenide.Selenide.$$;

public class Utils implements Locators {
    public int randomSayi(int sayi) {

        // return  (int) (Math.random()*(sayi-1));

        Random index = new Random();

        return index.nextInt(sayi - 1);
    }

    public int stringToTotal(ElementsCollection salaryList) {
        int salaryTop = 0;
        for (SelenideElement salary : $$(salaryList)) {

            int intSalary = (Integer.parseInt(salary.getText().replaceAll("[^a-zA-Z0-9]", "")));
            //   System.out.println(intSalary);
            salaryTop += intSalary;

        }
        System.out.println("Total Rechnung= " + salaryTop);
        return salaryTop;
    }

    public String randomString() {
        //  String rndString = UUID.randomUUID().toString();
        String rndString = RandomStringUtils.randomAlphabetic(8);

        return rndString + "@gmail.com";
    }

    public String randomPlz() {

        Random plz = new Random();

        return Integer.toString(plz.nextInt(10000));
    }

    String obje;

    public String randomCountry() {
        Random number = new Random();
        int countryNummer = number.nextInt(200);

        String[] locales = Locale.getISOCountries();
        String countryName = locales[countryNummer];


        Locale obj = new Locale("", countryName);

        obje = obj.getDisplayCountry();


        return obje;
    }


    public String randomDate()
    {

        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1900, 2021);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return   gc.get(gc.DAY_OF_MONTH) + "." + (gc.get(gc.MONTH) + 1)+ "."+gc.get(gc.YEAR);

    }

    public int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}



