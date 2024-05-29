package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.udea.sitas.AuthB.userinterfaces.LoginPage.*;
import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.*;

public class FillSignInForm implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IDENTIFICACION),
                Click.on(IDENTIFICACION_CEDULA),
                Enter.theValue("12345678").into(NUMERO_DOCUMENTO),
                Enter.theValue("Juan").into(NOMBRE),
                Enter.theValue("Perez").into(APELLIDO),
                Click.on(GENERO),
                Click.on(GENERO_MASCULINO),
                Click.on(FECHA),
                Type.theValue("01012000").into(FECHA),
                Enter.theValue("1234567890").into(NUMERO_TELEFONO),
                Enter.theValue("Argentina").into(PAIS),
                Enter.theValue("Buenos Aires").into(PROVINCIA),
                Enter.theValue("Ciudad Autonoma de Buenos Aires").into(CIUDAD),
                Enter.theValue("Calle Falsa 123").into(DIRECCION),
                Enter.theValue("juan.perez@example.com").into(CORREO_ELECTRONICO),
                Enter.theValue("@Password123").into(CONTRASENA),
                Enter.theValue("@Password123").into(CONFIRMAR_CONTRASENA),
                Click.on(BOTON_REGISTRARME)
        );
    }

    public static FillSignInForm inTextArea() {
        return Tasks.instrumented(FillSignInForm.class);
    }
}