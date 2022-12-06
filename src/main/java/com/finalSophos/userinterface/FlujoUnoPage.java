package com.finalSophos.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlujoUnoPage extends PageObject {

    public static final Target ELEMENT = Target.the("Botón Elements").locatedBy("(//*[@class='card-up'])[1]");
    public static final Target WEB_TABLE = Target.the("Botón Web Tables").locatedBy("(//*[@id='item-3'])[1]");
}


