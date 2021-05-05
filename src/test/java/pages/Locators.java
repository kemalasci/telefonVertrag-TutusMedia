package pages;

import org.openqa.selenium.By;

public interface Locators {

    String url = "https://telefonvertrag.de/";

    By akzeptiere = By.xpath("//button[@data-cf-action='accept']");
    By kabel = By.xpath("(//a[text()='Kabel'])[2]");
    By kabelSub = By.xpath("//h1[text()='Kabel']");
    By dsl = By.xpath("(//a[text()='DSL'])[2]");
    By dslSub = By.xpath("//h1[text()='DSL']");
    By gigaTV = By.linkText("GigaTV");
    By gigaSub = By.cssSelector("div h3");
    By blog = By.xpath("(//a[text()='Blog'])[2]");
    By blogSub = By.xpath("//h1[text()='Blog']");
    By fritzBoxList = By.cssSelector("div.custom-radio.custom-control");
    By extrasSicherheitsPaket = By.xpath("(//div[@class='custom-checkbox custom-control'])[1]");
    By salaryList = By.cssSelector("div.price");
    By jetztBestellen = By.xpath("//a[text()='Jetzt bestellen']");
    // kabel locator
    By newsletterButtonAlert= By.xpath("//*[@id=\"__next\"]/footer/div[1]/div[1]/div[2]/div/div[1]/text()");
    By talkTariff = By.xpath("(//div[@class='custom-checkbox custom-control'])[4]");
    By kabelTarifNameList = By.cssSelector("div.plan_box.tarife-name");
    By kabelButonList = By.cssSelector("a.plan_box_price_once_btn");
    By clickTarifName = By.cssSelector("h2.in-page-hone-alle-zum-tarif");
    // By warenkorb = By.xpath("//a[text()='In den Warenkorb']");
    By topTarif = By.xpath("//a[text()='Tarifpreis monatlich']");
    By buttonRight = By.cssSelector("i[class='fa fa-long-arrow-right aktiv']");
    By dslTarifNameList = By.cssSelector("div.plan_box.tarife-name");  // $
    By dslButonList = By.cssSelector("a.plan_box_price_once_btn");    // $
    By actuelTarif = By.xpath("//h1");
    By tarifeBewertungen = By.cssSelector("ul.tabs>li:nth-child(2)");
    By vorAndNachname = By.xpath("(//input[@type='text'])[1]");
    By email = By.xpath("(//input[@type='text'])[2]");
    By kommentar = By.cssSelector("textarea.form-control");
    By bwrtngnSenden = By.cssSelector("button[type='button']");
    By warenKorb = By.cssSelector("a.once_btn");
    By gender = By.cssSelector("select.form-control");
    By frauGender = By.xpath("//option[@value='0']");
    By titel = By.cssSelector("select.form-control");
    By titelDr = By.xpath("//option[@value='2']");
    By name = By.xpath("(//input[@class='form-control'])[1]");
    By surName = By.xpath("(//input[@class='form-control'])[2]");
    By telefon = By.xpath("(//input[@class='form-control'])[3]");
    By emailWarenKorp = By.xpath("(//input[@class='form-control'])[4]");
    By plz = By.xpath("(//input[@class='form-control'])[5]");
    By wohnOrt = By.xpath("(//input[@class='form-control'])[6]");
    By strasse = By.xpath("(//input[@class='form-control'])[7]");
    By hausNumber = By.xpath("(//input[@class='form-control'])[8]");
    By ausweisList = By.xpath("(//select[@class='form-control'])[3]//option");
    By ausstellungOrt = By.xpath("(//input[@class='form-control'])[9]");
    By geburstDatum = By.xpath("(//input[@class='form-control'])[10]");
    By geburstOrt = By.xpath("(//input[@class='form-control'])[11]");
    By gültigkeit = By.xpath("(//input[@class='form-control'])[12]");
    By ausweisNumber = By.xpath("(//input[@class='form-control'])[13]");
    By lageTelefonDose = By.xpath("(//input[@class='form-control'])[14]");
    By iban = By.xpath("(//input[@class='form-control'])[16]");
    By versand = By.cssSelector("label.custom-control-label");
    By weiter = By.xpath("//a[text()='Weiter']");
    By ibanFalseMsj = By.xpath("//div[text()='Bitte kontrollieren Sie die von Ihnen eingegebene IBAN.']");
    By mailInput = By.cssSelector("input.form-control");
    By registrationButton= By.cssSelector("button.newsletter-send-button");
}
//*[@id="__next"]/main/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/select