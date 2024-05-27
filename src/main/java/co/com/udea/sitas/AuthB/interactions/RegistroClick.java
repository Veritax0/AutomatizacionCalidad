package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.sitas.AuthB.userinterfaces.HomePage.REG_BUTTON;

public class RegistroClick implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Enter.theValue("Sitas").into(INPUT_TEXT)); ejemplo para introducir un texto
        actor.attemptsTo(Click.on(REG_BUTTON));
    }
}