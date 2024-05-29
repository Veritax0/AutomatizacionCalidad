package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.*;
import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.GOOGLE_ACCOUNT;
import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.GOOGLE_BUTTON;

public class GoogleSignInSelect implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GOOGLE_BUTTON));
        actor.attemptsTo(Click.on(GOOGLE_ACCOUNT));
    }

    public static GoogleSignInSelect inTextArea(){
        return Tasks.instrumented(GoogleSignInSelect.class);
    }
}