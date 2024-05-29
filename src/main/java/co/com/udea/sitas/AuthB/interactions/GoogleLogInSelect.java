package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.GOOGLE_LOGIN;
import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.GOOGLE_ACCOUNT;

public class GoogleLogInSelect implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GOOGLE_LOGIN));
    }

    public static GoogleLogInSelect inGoogleButton(){
        return Tasks.instrumented(GoogleLogInSelect.class);
    }
}