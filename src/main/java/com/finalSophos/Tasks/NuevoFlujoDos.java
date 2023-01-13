package com.finalSophos.Tasks;

import com.finalSophos.UserInterface.FlujoDosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


public class NuevoFlujoDos implements Task {

    private String fecha;
    private String hora;

    public NuevoFlujoDos(String fecha, String hora){
        this.fecha=fecha;
        this.hora = hora;
    }
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Scroll.to(FlujoDosPage.WIDGET),
                Click.on(FlujoDosPage.WIDGET),
                Scroll.to(FlujoDosPage.DATE_PICKER),
                Click.on(FlujoDosPage.DATE_PICKER),
                Click.on(FlujoDosPage.SELECT_DATE),
                Click.on(FlujoDosPage.SELECT_DAY.of(fecha)),
                Click.on(FlujoDosPage.SELECT_DATE_TIME),
                Click.on(FlujoDosPage.SELECT_DAY.of(fecha)),
                Click.on(FlujoDosPage.SELECT_TIME.of(hora))
        );
    }

    public static NuevoFlujoDos with(String fecha, String hora) {
        return Tasks.instrumented(NuevoFlujoDos.class, fecha, hora);
    }
}
