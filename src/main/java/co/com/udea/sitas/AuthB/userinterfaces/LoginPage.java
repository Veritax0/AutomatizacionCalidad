package co.com.udea.sitas.AuthB.userinterfaces;

import co.com.udea.sitas.AuthB.utils.UrlConstante;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target USER_NAME_INPUT = Target.the("Campo de usuario").located(By.id("email"));
    public static final Target USER_PASSWORD_INPUT = Target.the("Campo de contraseña").located(By.id("pass"));

    public static final Target LOGIN_BUTTON = Target.the("Boton de inicio de sesion").located(By.name("login"));

    public static final Target TITLE_HOMEPAGE = Target.the("Pantalla de bienvenida").located(By.className("_9axz"));

    public LoginPage(){
        this.openAt(UrlConstante.RELATIVE_LOGIN);
    }
}
