package com.finalSophos.UserInterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlujoUnoPage extends PageObject {

    public static final Target ELEMENT = Target.the("Botón Elements").locatedBy("(//*[@class='card-up'])[1]");
    public static final Target WEB_TABLE = Target.the("Botón Web Tables").locatedBy("(//*[@id='item-3'])[1]");
    public static final Target ADD_REGISTER = Target.the("Botón Add").locatedBy("//*[@id='addNewRecordButton']");
    public static final Target FIRST_NAME = Target.the("Campo First Name").locatedBy("//*[@id='firstName']");
    public static final Target LAST_NAME = Target.the("Campo Last Name").locatedBy("//*[@id='lastName']");
    public static final Target EMAIL = Target.the("Campo Email").locatedBy("//*[@id='userEmail']");
    public static final Target AGE = Target.the("Campo Age").locatedBy("//*[@id='age']");
    public static final Target SALARY = Target.the("Campo Salary").locatedBy("//*[@id='salary']");
    public static final Target DEPARTMENT = Target.the("Campo Department").locatedBy("//*[@id='department']");
    public static final Target SUBMIT = Target.the("Botón Submit").locatedBy("//*[@id='submit']");
    public static final Target DELETE = Target.the("Botón Submit").locatedBy("//*[@id='delete-record-1']");
    public static final Target VALIDAR = Target.the("Validación").locatedBy("//*[contains(text(), '{0}')]");

}


