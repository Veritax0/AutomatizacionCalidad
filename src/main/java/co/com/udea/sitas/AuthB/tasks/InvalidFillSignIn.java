package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.FillSignInForm;
import co.com.udea.sitas.AuthB.interactions.InvalidFillSignInForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class InvalidFillSignIn implements Task {
    public static InvalidFillSignIn fillSignIn() {
        return Tasks.instrumented(InvalidFillSignIn.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(InvalidFillSignInForm.inTextArea());
    }
}