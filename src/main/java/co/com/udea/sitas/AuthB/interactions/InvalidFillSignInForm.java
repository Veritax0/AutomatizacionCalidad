package co.com.udea.sitas.AuthB.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.udea.sitas.AuthB.userinterfaces.SignInPage.*;

public class InvalidFillSignInForm implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IDENTIFICACION),
                Click.on(IDENTIFICACION_CEDULA),
                Enter.theValue("adfasd").into(NUMERO_DOCUMENTO),
                Enter.theValue("Juan").into(NOMBRE),
                Enter.theValue("Perez").into(APELLIDO),
                Click.on(GENERO),
                Click.on(GENERO_MASCULINO),
                Click.on(FECHA),
                Type.theValue("01012000").into(FECHA),
                Enter.theValue("telefono").into(NUMERO_TELEFONO),
                Enter.theValue("Columbia").into(PAIS),
                Enter.theValue("Antiokia").into(PROVINCIA),
                Enter.theValue("Medeyin").into(CIUDAD),
                Enter.theValue("Calle Falsa 123").into(DIRECCION),
                Enter.theValue("juan.perez@example.com").into(CORREO_ELECTRONICO),
                Enter.theValue("@Password123").into(CONTRASENA),
                Enter.theValue("@Password123").into(CONFIRMAR_CONTRASENA),
                Click.on(BOTON_REGISTRARME)
        );
    }

    public static InvalidFillSignInForm inTextArea() {
        return Tasks.instrumented(InvalidFillSignInForm.class);
    }
}