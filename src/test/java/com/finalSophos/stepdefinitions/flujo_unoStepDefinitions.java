package com.finalSophos.stepdefinitions;

import com.finalSophos.tasks.NuevoFlujo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

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
}
