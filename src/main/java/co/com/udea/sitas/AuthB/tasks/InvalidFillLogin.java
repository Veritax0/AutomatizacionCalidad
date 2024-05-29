package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.FillLoginForm;
import co.com.udea.sitas.AuthB.interactions.InvalidFillLoginForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class InvalidFillLogin implements Task {
    public static InvalidFillLogin fillLogin() {
        return Tasks.instrumented(InvalidFillLogin.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(InvalidFillLoginForm.inTextArea());
    }
}