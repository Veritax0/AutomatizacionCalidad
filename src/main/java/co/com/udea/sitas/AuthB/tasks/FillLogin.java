package co.com.udea.sitas.AuthB.tasks;

import co.com.udea.sitas.AuthB.interactions.InputFill;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillLogin implements Task {
    public static FillLogin fillLogin() {
        return Tasks.instrumented(FillLogin.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(InputFill.inTextArea());
    }
}