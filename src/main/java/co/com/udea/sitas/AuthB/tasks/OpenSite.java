package co.com.udea.sitas.AuthB.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenSite implements Task {

    private PageObject page;

    public OpenSite(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(this.page));
    }

    public static OpenSite page(PageObject page){
        return Tasks.instrumented(OpenSite.class, page);
    }
}