package com.finalSophos.UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlujoDosPage extends PageObject {

    public static final Target WIDGET = Target.the("Botón Widget").locatedBy("(//*[@class='card-up'])[4]");
    public static final Target DATE_PICKER = Target.the("Botón Date Picker").locatedBy("(//*[@id='item-2'])[3]");
    public static final Target SELECT_DATE = Target.the("Campo Select Date").locatedBy("//*[@id='datePickerMonthYearInput']");
    public static final Target SELECT_DAY = Target.the("Campo Select Day").locatedBy("//*[@class='react-datepicker__week']//div[contains(text(),'{0}')]");
}
