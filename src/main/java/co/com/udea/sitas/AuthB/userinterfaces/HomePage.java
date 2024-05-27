package co.com.udea.sitas.AuthB.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target REG_BUTTON = Target.the("Boton de registro").located(By.id(""));
    public HomePage(){}
}