package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData{

    @Dado("digito {} no campo First Name")
    public void digito_os_entre_e_no_campo_Cylinder_Capacity_ccm(String string) {
        Configuracao.id("firstname").sendKeys(string);
        
    }



}