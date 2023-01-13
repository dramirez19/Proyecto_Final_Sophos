package com.finalSophos.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/finalSophos/stepdefinitions",
        features = "src/test/resources/com.finalSophos/features/flujo_tres.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class flujo_tres {
}
