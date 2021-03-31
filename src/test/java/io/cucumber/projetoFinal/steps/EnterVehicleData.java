package io.cucumber.projetoFinal.steps;

import io.cucumber.java.pt.*;
import io.cucumber.projetoFinal.servicos.Configuracao;
import io.cucumber.projetoFinal.steps.CompartilhadoSteps;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData{

    @Dado("seleciono a {} do campo Make")
    public void seleciono_a_marca_do_campo_Make(String string) {
        Configuracao.selectOptionsByExamples(string);
        
    }


    @Dado("seleciono o {} do campo Model")
    public void seleciono_o_modelo_do_campo_Model(String string) {
        Select var = new Select(Configuracao.cssSelector("select#model"));
        var.selectByVisibleText(string);
        
        
    }

    @Dado("digito os {} entre 1 e 2000 no campo Cylinder Capacity [ccm]")
    public void digito_os_entre_e_no_campo_Cylinder_Capacity_ccm(String string) {
        Configuracao.id("cylindercapacity").sendKeys(string);
        
    }

    @Dado("digito {} entre 1 e 2000 no campo Engine Performance [kW]")
    public void digito_entre_e_no_campo_Engine_Performance_kW(String string) {
        Configuracao.id("engineperformance").sendKeys(string);
    }

    @Dado("digito a {} no campo Date of Manufacture")
    public void digito_a_no_campo_Date_of_Manufacture(String string) {
        Configuracao.id("dateofmanufacture").sendKeys(string);
    }

    @Dado("seleciono o {} no campo Number of Seats do carro de 1 a 9")
    public void seleciono_o_no_campo_Number_of_Seats(String string) {
        Select var = new Select(Configuracao.cssSelector("select#numberofseats"));
        var.selectByVisibleText(string);
    }

    @Dado("seleciono a opcao Yes no campo Right Hand Drive")
    public void seleciono_yes_no_campo_Right_Hand_Drive() {
       Configuracao.cssSelector("span.ideal-radio").click();
       //Configuracao.cssSelector("input#righthanddriveno>input>span#text").click();
               
    }

    @Dado("seleciono a {} no campo Number of Seats da moto de 1 a 3")
    public void seleciono_a_no_campo_Number_of_Seats(String string) {
        Select var = new Select(Configuracao.cssSelector("select#numberofseatsmotorcycle"));
        var.selectByVisibleText(string);
    }

    @Dado("seleciono o {} no campo Fuel Type")
    public void seleciono_o_Diesel_no_campo_Fuel_Type(String string) {
        Select var = new Select(Configuracao.cssSelector("select#fuel"));
        var.selectByVisibleText(string);
    }

    @Dado("digito a {} 1 e 1000 no campo Payload [kg]")
    public void digito_a_e_no_campo_Payload_kg(String string) {
        Configuracao.id("payload").sendKeys(string);
    }

    @Dado("digito a {} 100 e 50000 no campo Total Weight [kg]")
    public void digito_a_e_no_campo_Total_Weight_kg(String string) {
        Configuracao.id("totalweight").sendKeys(string);
    }

    @Dado("digito o {} entre 500 e 100000 no campo List Price [$]")
    public void digito_o_entre_e_no_campo_List_Price(String string) {
        Configuracao.id("listprice").sendKeys(string);
    }

    @Dado("digito a {} no campo License Plate Number")
    public void digito_a_placa_no_campo_License_Plate_Number(String string) {
        Configuracao.id("licenseplatenumber").sendKeys(string);
    }

    @Dado("digito a {} entre 100 e 100000 no campo Annual Mileage [mi]")
    public void digito_a_entre_e_no_campo_Annual_Mileage_mi(String string) {
        Configuracao.id("annualmileage").sendKeys(string);
    }

    

    @Entao("devo ver o primeiro campo {string}")
    public void devo_ver_o_primeiro_campo(String string) {
        assertEquals(string, Configuracao.cssSelectors("label.main").get(15).getText());
        Configuracao.fechar();     
    }
    

}