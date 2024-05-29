package co.com.udea.sitas.AuthB.userinterfaces;

import co.com.udea.sitas.AuthB.utils.UrlConstante;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInPage extends PageObject {

    public static final Target IDENTIFICACION = Target.the("Identificacion").located(By.id("identificacion"));
    public static final Target IDENTIFICACION_CEDULA = Target.the("Identificacion cedula").located(By.id("identificacion-cedula"));
    public static final Target IDENTIFICACION_PASAPORTE = Target.the("Identificacion pasaporte").located(By.id("identificacion-pasaporte"));
    public static final Target NUMERO_DOCUMENTO = Target.the("Numero de documento").located(By.id("numero-documento"));
    public static final Target NOMBRE = Target.the("Nombre").located(By.id("nombre"));
    public static final Target APELLIDO = Target.the("Apellido").located(By.id("apellido"));
    public static final Target GENERO = Target.the("Genero masculino").located(By.id("genero"));
    public static final Target GENERO_MASCULINO = Target.the("Genero masculino").located(By.id("genero-masculino"));
    public static final Target GENERO_FEMENINO = Target.the("Genero femenino").located(By.id("genero-femenino"));
    public static final Target GENERO_NO_ESPECIFICADO = Target.the("Genero no especificado").located(By.id("genero-no-especificado"));
    public static final Target FECHA = Target.the("Fecha de nacimiento").located(By.id(":Rj9qunnla:"));
    public static final Target FECHA_NACIMIENTO = Target.the("Fecha de nacimiento").located(By.id("fecha-nacimiento"));
    public static final Target NUMERO_TELEFONO = Target.the("Numero de telefono").located(By.id("numero-telefono"));
    public static final Target PAIS = Target.the("Pais").located(By.id("pais"));
    public static final Target PROVINCIA = Target.the("Provincia").located(By.id("provincia"));
    public static final Target CIUDAD = Target.the("Ciudad").located(By.id("ciudad"));
    public static final Target DIRECCION = Target.the("Direccion").located(By.id("direccion"));
    public static final Target CORREO_ELECTRONICO = Target.the("Correo electronico").located(By.id("correo-electronico"));
    public static final Target CONTRASENA = Target.the("Contrasena").located(By.id("contrasena"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Confirmar contrasena").located(By.id("confirmar-contrasena"));
    public static final Target BOTON_REGISTRARME = Target.the("Boton Registrarme").located(By.id("boton-registrarme"));
    public static final Target GOOGLE_BUTTON = Target.the("Boton de registro terceros").located(By.id("boton-google"));
    public static final Target GOOGLE_ACCOUNT = Target.the("Cuenta de google").located(By.name("MBVUVe"));

    public SignInPage() {
        this.setDefaultBaseUrl(UrlConstante.URL_SIGNIN);
    }
}
