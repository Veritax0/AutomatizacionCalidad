package co.com.udea.sitas.AuthB.stepdefinitions;

import co.com.udea.sitas.AuthB.questions.AlertValidation;
import co.com.udea.sitas.AuthB.questions.InvalidDataValidation;
import co.com.udea.sitas.AuthB.questions.ManyAttempsValidation;
import co.com.udea.sitas.AuthB.tasks.*;
import co.com.udea.sitas.AuthB.userinterfaces.LoginPage;
import co.com.udea.sitas.AuthB.utils.StringConst;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

@RunWith(Cucumber.class)
public class AutenticacionStepDefinition {

    //driver
    @Managed(driver = "chrome")
    public WebDriver driver;
    //actor
    private Actor usuario = Actor.named("user");

    //inicializar
    @Before
    public void init() {
        usuario.can(BrowseTheWeb.with(driver));
        setTheStage(new OnlineCast());
    }

    @Given("que estoy en la pagina de inicio de sesion")
    public void queEstoyEnLaPaginaDeInicioDeSesion() {;
        usuario.attemptsTo(OpenSite.page(new LoginPage()));
    }

    @When("ingreso nombre de usuario y contrasena validos")
    public void ingresoNombreDeUsuarioYContrasenaValidos() {
        usuario.attemptsTo(FillLogin.fillLogin());
    }

    @Then("deberia ver la pagina de bienvenida")
    public void deberiaVerLaPaginaDeBienvenida() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(AlertValidation.homePage(), Matchers.containsString(StringConst.VAL_HOME_PAGE)));
    }

    @Given("que el usuario prefiere usar una cuenta externa para autenticarse")
    public void queElUsuarioPrefiereUsarUnaCuentaExternaParaAutenticarse() {
        usuario.attemptsTo(OpenSite.page(new LoginPage()));
    }

    @When("elige autenticarse con una cuenta de Google u otro servicio")
    public void eligeAutenticarseConUnaCuentaDeGoogleUOtroServicio() {
        usuario.attemptsTo(GoogleLogIn.googleLog());
    }

    @Then("el sistema le permite usar otros servicios de cuentas para acceder")
    public void elSistemaLePermiteUsarOtrosServiciosDeCuentasParaAcceder() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(AlertValidation.homePage(), Matchers.containsString(StringConst.VALID_LOGIN)));
    }

    @When("ingreso nombre de usuario y contrasena invalidos")
    public void ingresoNombreDeUsuarioYContrasenaInvalidos() {
        usuario.attemptsTo((InvalidFillLogin.fillLogin()));
    }

    @Then("deberia ver un mensaje de error indicando credenciales invalidas")
    public void deberiaVerUnMensajeDeErrorIndicandoCredencialesInvalidas() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(InvalidDataValidation.homePage(), Matchers.containsString(StringConst.INVALID_LOGIN)));
    }

    @Given("que he intentado iniciar sesion sin exito tres veces")
    public void queHeIntentadoIniciarSesionSinExitoTresVeces() {
        usuario.attemptsTo(OpenSite.page(new LoginPage()));
        usuario.attemptsTo(ManyAttemptsInvalidFillLogin.fillLogin());
    }

    @When("intento iniciar sesion por cuarta vez con credenciales invalidas")
    public void intentoIniciarSesionPorCuartaVezConCredencialesInvalidas() {
        usuario.attemptsTo((InvalidFillLogin.fillLogin()));
    }

    @Then("deberia ver un mensaje de error indicando que he excedido el limite de intentos")
    public void deberiaVerUnMensajeDeErrorIndicandoQueHeExcedidoElLimiteDeIntentos() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ManyAttempsValidation.homePage(), Matchers.containsString(StringConst.MANY_ATTEMPTS_INVALID_LOGIN)));
    }

    @And("deberia recibir un correo para confirmar mi identidad")
    public void deberiaRecibirUnCorreoParaConfirmarMiIdentidad() {
    }
}
