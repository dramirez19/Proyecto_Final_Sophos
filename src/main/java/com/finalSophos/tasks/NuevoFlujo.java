package com.finalSophos.tasks;

import com.finalSophos.models.FlujoUno;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;

import java.util.Map;

import static com.finalSophos.userinterface.FlujoUnoPage.*;

public class NuevoFlujo implements Task {

    private DataTable datosTabla;

    private Map<String, String> information;

    private FlujoUno flujouno;

    public NuevoFlujo(DataTable datosTabla) {
        this.datosTabla = datosTabla;
        information = this.datosTabla.asMap(String.class, String.class);
        flujouno = new FlujoUno(information.get("First_Name"), information.get("Last_Name"),
                information.get("Email"), information.get("Age"),
                information.get("Salary"), information.get("Department"));
    }
        @Override
        public <T extends Actor> void performAs (T actor){
            actor.attemptsTo(
                    Click.on(ELEMENT),
                    Click.on(WEB_TABLE)
            );
        }





    public static NuevoFlujo with(DataTable datosTabla) {
        return Tasks.instrumented(NuevoFlujo.class, datosTabla);
    }
}
