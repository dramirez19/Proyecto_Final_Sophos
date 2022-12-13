package com.finalSophos.stepdefinitions;

import com.finalSophos.Questions.ValidarRegistro;
import com.finalSophos.Tasks.NuevoFlujo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.finalSophos.UserInterface.FlujoUnoPage.VALIDAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class flujo_unoStepDefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} Desea navegar a la pagina web {string}")
    public void deseaNavegarAlaPaginaWeb(String actor, String url){
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @When("Crear nuevo registro en la opcion Web Tables")
    public void crearNuevoRegistroEnLaOpcionWebTables(DataTable datosTabla) {
        theActorInTheSpotlight().attemptsTo(NuevoFlujo.with(datosTabla));
    }

    @Then("Validar la exitosa creacion del registro de nombre {string}")
    public void validarExitosaCreacionDelRegistro(String register) {
        theActorInTheSpotlight().should(seeThat(ValidarRegistro.with(VALIDAR,register),equalTo(register)));
    }

}
