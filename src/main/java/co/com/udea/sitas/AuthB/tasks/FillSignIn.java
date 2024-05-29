package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.FillSignInForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillSignIn implements Task {
    public static FillSignIn fillSignIn() {
        return Tasks.instrumented(FillSignIn.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FillSignInForm.inTextArea());
    }
}