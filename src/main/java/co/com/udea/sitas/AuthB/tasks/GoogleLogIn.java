package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.GoogleLogInSelect;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoogleLogIn implements Task {
    public static GoogleLogIn googleLog() {
        return Tasks.instrumented(GoogleLogIn.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GoogleLogInSelect.inGoogleButton());
    }
}