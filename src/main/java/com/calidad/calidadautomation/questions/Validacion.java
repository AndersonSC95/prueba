package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION;

public class Validacion implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXT_VALIDATION).viewedBy(actor).asString();
        if(stringTemporal.contains("Copyright 2020 Todos los Derechos Reservados")){
            return true;
        }else {
            return false;
        }
    }

    public static Validacion theHomePage(){return new Validacion();}
}
