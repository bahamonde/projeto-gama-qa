package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class EnterInsurantData {

    @Dado("digito {} no campo First Name")
    public void digito_o_nome(String string) {
        Configuracao.id("firstname").sendKeys(string);        
    }

    @Dado("digito {} no campo Last Name")
    public void digito_o_sobrenome(String string) {
        Configuracao.id("lastname").sendKeys(string);        
    }

    @Dado("digito {} no campo Date of Birth")
    public void digito_o_aniversario(String string) {
        Configuracao.id("birthdate").sendKeys(string);        
    }

    @Dado("seleciono a opcao Female no campo Gender")
public void seleciono_a_opcao_Female_no_campo_Gender() {
    Configuracao.cssSelectors(".ideal-radiocheck-label").get(3).click();
}

@Dado("digito Rua Flores no campo Street Address")
public void digito_Rua_Flores_no_campo_Street_Address() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Dado("seleciono a Brazil no campo Country")
public void seleciono_a_Brazil_no_campo_Country() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Dado("digito {int} no campo Street Zip Code")
public void digito_no_campo_Street_Zip_Code(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

    @Dado("digito <cidade> no campo City")
public void digito_cidade_no_campo_City() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Dado("seleciono Employee no campo Occupation")
public void seleciono_Employee_no_campo_Occupation() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Dado("marco Speeding no campo Hobbies")
public void marco_Speeding_no_campo_Hobbies() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Dado("digito linkedin.com\\/in\\/sena no campo Website")
public void digito_linkedin_com_in_sena_no_campo_Website() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Dado("envio uma foto no campo Picture")
public void envio_uma_foto_no_campo_Picture() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


    



}