package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.INPUT_TEXT;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.LINK_HOMEPAGE_UDEA;

public class UdeaHomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("U de A").into(INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(LINK_HOMEPAGE_UDEA));
    }

    public static UdeaHomePage go(){
        return Tasks.instrumented(UdeaHomePage.class);
    }
}
