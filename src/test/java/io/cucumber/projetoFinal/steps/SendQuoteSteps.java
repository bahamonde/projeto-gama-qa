package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class SendQuoteSteps {

    @Dado("digito {} no campo E-Mail")
    public void digito_email_no_campo_EMail(String string) {
    Configuracao.id("email").sendKeys(string);
    }

    @Dado("digito {} no campo Phone")
    public void digito_no_campo_Phone(String string) {
        Configuracao.id("phone").sendKeys(string);
    }

    @Dado("digito {} no campo Username")
    public void digito_user_no_campo_Username(String string) {
        Configuracao.id("username").sendKeys(string);
    }
    
    @Dado("digito {} no campo Password")
    public void digito_senha_no_campo_Password(String string) {
        Configuracao.id("password").sendKeys(string);
    }

    @Dado("digito {} no campo Confirm Password")
    public void confirmar_no_campo_Confirm_Password(String string) {
        Configuracao.id("confirmpassword").sendKeys(string);
    }

    @Dado("digito {} no campo Comments")
    public void digito_comentario_no_campo_Comments(String string) {
        Configuracao.id("Comments").sendKeys(string);
    }

    @Dado("clico no botao Send")
    public void clico_no_botao_Send() throws InterruptedException {
        Configuracao.cssSelector("button#sendemail").click();
        Thread.sleep(15000); //Se a confirmaçao de envio no site demorar muito para carregar, aumentar o tempo de espera (em milisegundos)
    }

    @Entao("devo ver a mensagem {string}")
    public void devo_ver_a_mensagem(String string) {
        assertEquals(string, Configuracao.cssSelectors("h2").get(0).getText());
        Configuracao.fechar();  
    }

}