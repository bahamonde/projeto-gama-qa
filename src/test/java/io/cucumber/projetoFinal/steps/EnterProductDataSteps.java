package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class EnterProductDataSteps {

    @Dado("digito {} no campo Start Date")
    public void digito_no_campo_Start_Date(String string) {
        Configuracao.id("startdate").sendKeys(string);
    }

    @Dado("seleciono {} no campo Insurance Sum [$]")
    public void seleciono_no_campo_Start_Date(String string) {
        Select var = new Select(Configuracao.cssSelector("select#insurancesum"));
        var.selectByVisibleText(string);
    }

    @Dado("seleciono {} no campo Merit Rating")
    public void seleciono_Bonus_no_campo_Merit_Rating(String string) {
        Select var = new Select(Configuracao.cssSelector("select#meritrating"));
        var.selectByVisibleText(string);
    }

    @Dado("seleciono {} no campo Damage Insurance")
    public void seleciono_seguro_no_campo_Damage_Insurance(String string) {
        Select var = new Select(Configuracao.cssSelector("select#damageinsurance"));
        var.selectByVisibleText(string);
    }

    @Dado("marco Bungee Euro Protection no campo Optional Products")
    public void marco_produto_no_campo_Optional_Products() {
        Configuracao.cssSelectors(".ideal-radiocheck-label").get(9).click();
    }

    @Dado("seleciono {} no campo Courtesy Car")
    public void seleciono_cortesia_no_campo_Courtesy_Car(String string) {
        Select var = new Select(Configuracao.cssSelector("select#courtesycar"));
        var.selectByVisibleText(string);
    }

    @Dado("clico no botao next")
    public void clico_no_botao_next() {
        Configuracao.cssSelector("button#nextselectpriceoption").click();
    }

    @Entao("devo ver o campo a seguir {string}")
    public void devo_ver_o_campo(String string) {
        assertEquals(string, Configuracao.cssSelectors("table#priceTable tbody tr td").get(0).getText());         
    }
    
}