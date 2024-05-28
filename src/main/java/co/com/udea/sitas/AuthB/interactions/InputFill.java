package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.*;

public class InputFill implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("juan.verao").into(USER_NAME_INPUT));
        actor.attemptsTo(Enter.theValue("1234").into(USER_PASSWORD_INPUT));//ejemplo para introducir un texto
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static InputFill inTextArea(){
        return Tasks.instrumented(InputFill.class);
    }
}