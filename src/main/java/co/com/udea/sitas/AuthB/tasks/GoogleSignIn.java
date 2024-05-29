package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.GoogleSignInSelect;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoogleSignIn implements Task {
    public static GoogleSignIn googleSing() {
        return Tasks.instrumented(GoogleSignIn.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GoogleSignInSelect.inTextArea());
    }
}