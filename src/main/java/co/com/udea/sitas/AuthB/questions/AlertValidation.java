package co.com.udea.sitas.AuthB.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.SUCCESS_ALERT;

public class AlertValidation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(SUCCESS_ALERT).getText();
        return msg;
    }

    public static AlertValidation homePage(){
        return new AlertValidation();
    }
}