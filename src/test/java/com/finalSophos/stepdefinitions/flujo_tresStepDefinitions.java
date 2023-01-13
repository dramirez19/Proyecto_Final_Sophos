package com.finalSophos.stepdefinitions;

import com.finalSophos.Tasks.NuevoFlujoDos;
import com.finalSophos.Tasks.NuevoFlujoTres;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class flujo_tresStepDefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}
    @When("Probar las alertas y agregar el nombre {string}")
    public void probarLasAlertasYAgregarElNombre(String nombre) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(NuevoFlujoTres.with(nombre));
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.id("confirmButton")).click();
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.id("promtButton")).click();
        getDriver().switchTo().alert().sendKeys(nombre);
        getDriver().switchTo().alert().accept();

    }

}
