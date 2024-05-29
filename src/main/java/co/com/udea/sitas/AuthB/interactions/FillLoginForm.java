package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.*;

public class FillLoginForm implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("juan.verao@udea.edu.co").into(USER_NAME_INPUT));
        actor.attemptsTo(Enter.theValue("@Password123").into(USER_PASSWORD_INPUT));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static FillLoginForm inTextArea(){
        return Tasks.instrumented(FillLoginForm.class);
    }
}