package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;

public class CompartilhadoSteps {

    @Dado("que eu estou no site Tricentis")
    public void que_eu_estou_no_site_Tricentis() {
        Configuracao.abrir("http://sampleapp.tricentis.com/101/app.php");
    }

    @Dado("clico no botão next para avancar de aba")
    public void clico_no_botao_next() {
        Configuracao.cssSelector("button[class='next button']").click();
    }

}