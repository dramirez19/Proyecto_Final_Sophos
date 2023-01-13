package com.finalSophos.Tasks;

import com.finalSophos.UserInterface.FlujoTresPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.time.Duration;

public class NuevoFlujoTres implements Performable {
    private String nombre;

    public NuevoFlujoTres (String nombre){

        this.nombre=nombre;
    }


    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Scroll.to(FlujoTresPage.ALERTS_FRAME),
                Click.on(FlujoTresPage.ALERTS_FRAME),
                Scroll.to(FlujoTresPage.ALERTS),
                Click.on(FlujoTresPage.ALERTS),
                Click.on(FlujoTresPage.ALERT_1)
                );
    }

        public static NuevoFlujoTres with(String nombre) {

        return Tasks.instrumented(NuevoFlujoTres.class, nombre);
        }
    }
