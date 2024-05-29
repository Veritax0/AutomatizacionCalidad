package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.*;

public class ManyAttemptsInvalidFillLoginForm implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 1; i <=3; i++){
            actor.attemptsTo(Enter.theValue("usuario invalido").into(USER_NAME_INPUT));
            actor.attemptsTo(Enter.theValue("1234").into(USER_PASSWORD_INPUT));
            actor.attemptsTo(Click.on(LOGIN_BUTTON));
        }
    }

    public static ManyAttemptsInvalidFillLoginForm inTextArea(){
        return Tasks.instrumented(ManyAttemptsInvalidFillLoginForm.class);
    }
}