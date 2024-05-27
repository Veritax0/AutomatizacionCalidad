package co.com.udea.sitas.AuthB.userinterfaces;

import co.com.udea.sitas.AuthB.utils.UrlConstante;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

    public LoginPage(){
        this.openAt(UrlConstante.RELATIVE_LOGIN);
    }
}
