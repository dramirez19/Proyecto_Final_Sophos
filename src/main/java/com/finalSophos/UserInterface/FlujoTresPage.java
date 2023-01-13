package com.finalSophos.UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlujoTresPage extends PageObject {

    public static final Target ALERTS_FRAME = Target.the("Botón Alerts, Frame & Windows").locatedBy("(//*[@class='card-up'])[3]");

    public static final Target ALERTS = Target.the("Botón Alerts").locatedBy("(//*[@id='item-1'])[2]");

    public static final Target ALERT_1 = Target.the("Botón Alerts").locatedBy("//*[@id='alertButton']");

    public static final Target ALERT_2 = Target.the("Botón Alerts 2").locatedBy("//*[@id='confirmButton']");
}
