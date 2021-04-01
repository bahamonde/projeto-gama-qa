package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class SelectPriceOption {

    @Dado("marco a opcao Platinum no campo Select Option")
    public void marco_platinum() throws InterruptedException {
        Configuracao.cssSelectors("label.choosePrice").get(2).click();
        Thread.sleep(2000);
    }

    @Dado("clico em next")
    public void clico_em_next() {
        Configuracao.cssSelector("button#nextsendquote.next").click();
    }

    @Entao("devo ver o proximo campo {string}")
    public void devo_ver_o_campo(String string) {
        assertEquals(string, Configuracao.cssSelector(".idealforms-field-email").getText());         
    }

}

