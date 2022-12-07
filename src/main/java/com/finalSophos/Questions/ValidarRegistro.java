package com.finalSophos.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarRegistro implements Question<String> {

    private String text;

    private Target target;

    public ValidarRegistro(String text, Target target){
        this.text = text;
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor){
        return Text.of(target.of(text)).viewedBy(actor).asString();
    }

    public static ValidarRegistro with(Target target, String text){
        return new ValidarRegistro(text, target);
    }
}
