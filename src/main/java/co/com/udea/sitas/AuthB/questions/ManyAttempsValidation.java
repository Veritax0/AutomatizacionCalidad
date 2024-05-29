package co.com.udea.sitas.AuthB.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.MANY_ATTEMPTS_ALERT;
import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.FORM_HELPER;

public class ManyAttempsValidation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(MANY_ATTEMPTS_ALERT).getText();
        return msg;
    }

    public static ManyAttempsValidation homePage(){
        return new ManyAttempsValidation();
    }
}