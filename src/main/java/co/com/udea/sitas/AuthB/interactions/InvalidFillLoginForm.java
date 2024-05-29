package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.*;

public class InvalidFillLoginForm implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("usuario invalido").into(USER_NAME_INPUT));
        actor.attemptsTo(Enter.theValue("1234").into(USER_PASSWORD_INPUT));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static InvalidFillLoginForm inTextArea(){
        return Tasks.instrumented(InvalidFillLoginForm.class);
    }
}