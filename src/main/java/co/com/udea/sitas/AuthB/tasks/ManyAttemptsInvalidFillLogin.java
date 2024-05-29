package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.InvalidFillLoginForm;
import co.com.udea.sitas.AuthB.interactions.ManyAttemptsInvalidFillLoginForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ManyAttemptsInvalidFillLogin implements Task {
    public static ManyAttemptsInvalidFillLogin fillLogin() {
        return Tasks.instrumented(ManyAttemptsInvalidFillLogin.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ManyAttemptsInvalidFillLoginForm.inTextArea());
    }
}