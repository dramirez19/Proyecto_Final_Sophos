package com.finalSophos.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class flujo_unoStepDefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} Desea navegar a la pagina web {string}")
    public void deseaNavegarAlaPaginaWeb(String actor, String url){
        theActorCalled(actor).attemptsTo(Open.url(url));
    }
}
