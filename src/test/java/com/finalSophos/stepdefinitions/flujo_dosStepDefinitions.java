package com.finalSophos.stepdefinitions;

import com.finalSophos.Tasks.NuevoFlujoDos;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class flujo_dosStepDefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}


    @When("Seleccionar la fecha {string} y Seleccionar la hora {string} en el Date Picker")
    public void seleccionarLaFechaYSeleccionarLaHoraEnElDatePicker(String fecha, String hora) {
        theActorInTheSpotlight().attemptsTo(NuevoFlujoDos.with(fecha, hora));
    }
}

