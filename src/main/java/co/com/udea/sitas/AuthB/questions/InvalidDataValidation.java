package co.com.udea.sitas.AuthB.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.SUCCESS_ALERT;
import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.FORM_HELPER;

public class InvalidDataValidation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FORM_HELPER).getText();
        return msg;
    }

    public static InvalidDataValidation homePage(){
        return new InvalidDataValidation();
    }
}