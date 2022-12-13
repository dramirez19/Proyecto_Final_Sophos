package com.finalSophos.Tasks;

import com.finalSophos.Models.FlujoUno;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.finalSophos.UserInterface.FlujoUnoPage.*;

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
                    Click.on(WEB_TABLE),
                    Click.on(ADD_REGISTER),
                    Click.on(FIRST_NAME), Enter.theValue(flujouno.getFirstName()).into(FIRST_NAME),
                    Click.on(LAST_NAME), Enter.theValue(flujouno.getLastName()).into(LAST_NAME),
                    Click.on(EMAIL), Enter.theValue(flujouno.getEmail()).into(EMAIL),
                    Click.on(AGE), Enter.theValue(flujouno.getAge()).into(AGE),
                    Click.on(SALARY), Enter.theValue(flujouno.getSalary()).into(SALARY),
                    Click.on(DEPARTMENT), Enter.theValue(flujouno.getDepartment()).into(DEPARTMENT),
                    Click.on(SUBMIT),
                    Click.on(DELETE)




            );
        }





    public static NuevoFlujo with(DataTable datosTabla) {
        return Tasks.instrumented(NuevoFlujo.class, datosTabla);
    }
}
