package co.com.udea.sitas.AuthB.userinterfaces;

import co.com.udea.sitas.AuthB.utils.UrlConstante;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target USER_NAME_INPUT = Target.the("Campo de usuario").located(By.id("emailInput"));
    public static final Target USER_PASSWORD_INPUT = Target.the("Campo de contraseña").located(By.id("passInput"));
    public static final Target LOGIN_BUTTON = Target.the("Boton de inicio de sesion").located(By.id("loginButton"));
    public static final Target SUCCESS_ALERT = Target.the("alerta").located(By.id("textTitle"));
    public static final Target GOOGLE_LOGIN = Target.the("Google ogin").located(By.id("button-label"));
    public static final Target MANY_ATTEMPTS_ALERT = Target.the("alerta").located(By.id("attempsAlert"));

    public LoginPage() {
        this.setDefaultBaseUrl(UrlConstante.URL_LOGIN);
    }
}
