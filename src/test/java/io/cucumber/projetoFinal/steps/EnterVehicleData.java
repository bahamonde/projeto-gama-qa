package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData{

    @Dado("seleciono a {String} do campo Make")
    public void seleciono_a_marca_do_campo_Make(String marca) {
        //Settings.cssSelector("select#make option").click();
        assertEquals(marca, Configuracao.cssSelector("select#make option").getText());
    }

    @Dado("digito <performance> entre {int} e {int} no campo Engine Performance [kW]")
    public void digito_performance_entre_e_no_campo_Engine_Performance_kW(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("digito <data> no campo Date of Manufacture")
    public void digito_data_no_campo_Date_of_Manufacture() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("seleciono o <assentos> no campo Number of Seats")
    public void seleciono_o_assentos_no_campo_Number_of_Seats() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("seleciono o <combustivel> no campo Fuel Type")
    public void seleciono_o_combustivel_no_campo_Fuel_Type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("digito o <preco> entre {int} e {int} no campo List Price [$]")
    public void digito_o_preco_entre_e_no_campo_List_Price_$(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("digito a <placa> no campo License Plate Number")
    public void digito_a_placa_no_campo_License_Plate_Number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("digito a <milhagem> entre {int} e {int} no campo Annual Mileage [mi]")
    public void digito_a_milhagem_entre_e_no_campo_Annual_Mileage_mi(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("devo ver o primeiro campo {string}")
    public void devo_ver_o_primeiro_campo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}