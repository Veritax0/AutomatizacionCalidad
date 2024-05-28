package co.com.udea.sitas.AuthB.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.TITLE_HOMEPAGE;

public class HomePageValidation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITLE_HOMEPAGE).getText();
        return msg;
    }

    public static HomePageValidation homePage(){
        return new HomePageValidation();
    }
}