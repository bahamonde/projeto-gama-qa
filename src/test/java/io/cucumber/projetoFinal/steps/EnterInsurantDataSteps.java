package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataSteps {

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

    @Dado("digito {} no campo Street Address")
    public void digito_Rua_no_campo_Street_Address(String string) {
        Configuracao.id("streetaddress").sendKeys(string);
    }

    @Dado("seleciono {} no campo Country")
    public void seleciono_pais_no_campo_Country(String string) {
        Select var = new Select(Configuracao.cssSelector("select#country"));
        var.selectByVisibleText(string);
    }
    
    @Dado("digito {} no campo Street Zip Code")
    public void digito_no_campo_Street_Zip_Code(String string) {
        Configuracao.id("zipcode").sendKeys(string);
    }

        @Dado("digito {} no campo City")
    public void digito_cidade_no_campo_City(String string) {
        Configuracao.id("city").sendKeys(string);
    }
    
    @Dado("seleciono {} no campo Occupation")
    public void seleciono_Employee_no_campo_Occupation(String string) {
        Select var = new Select(Configuracao.cssSelector("select#occupation"));
        var.selectByVisibleText(string);
    }

    @Dado("marco Bungee Jumping e Skydiving no campo Hobbies")
    public void marco_BungeeJumping_Skydiving_no_campo_Hobbies() {
        Configuracao.cssSelectors(".ideal-radiocheck-label").get(5).click();
        Configuracao.cssSelectors(".ideal-radiocheck-label").get(7).click();
    }

    @Dado("digito {} no campo Website")
    public void digito_linkedin_com_in_sena_no_campo_Website(String string) {
        Configuracao.id("website").sendKeys(string);
    }

    @Dado("clico no botao next para para a proxima aba")
    public void clico_no_botao_next_para_proxima_aba() {
        Configuracao.cssSelector("button#nextenterproductdata").click();
    }

    @Entao("devo ver o campo {string}")
    public void devo_ver_o_campo(String string) {
        assertEquals(string, Configuracao.cssSelectors("label.main").get(28).getText());         
    }

    /*@Dado("envio uma foto no campo Picture")
    public void envio_uma_foto_no_campo_Picture() {
        Configuracao.uploadFile();        
    }*/


    



}