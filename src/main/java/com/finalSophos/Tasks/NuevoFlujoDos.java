package com.finalSophos.Tasks;

import com.finalSophos.UserInterface.FlujoDosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NuevoFlujoDos implements Task {

    private String fecha;

    public NuevoFlujoDos(String fecha){this.fecha=fecha;}

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(FlujoDosPage.WIDGET),
                Click.on(FlujoDosPage.DATE_PICKER),
                Click.on(FlujoDosPage.SELECT_DATE),
                Click.on(FlujoDosPage.SELECT_DAY)


        );
    }

    public static NuevoFlujoDos with(String fecha) {
        return Tasks.instrumented(NuevoFlujoDos.class, fecha);
    }
}
