package co.com.udea.sitas.AuthB.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

@RunWith(Cucumber.class)
public class AutenticacionIntentosExcedidos {

    //actor
    private Actor usuario = Actor.named("user");

    //driver
    @Managed(driver = "chrome")
    public WebDriver driver;

    //inicializar
    @Before
    public void init(){
        usuario.can(BrowseTheWeb.with(driver));
        setTheStage(new OnlineCast());
    }

    @Given("que he intentado iniciar sesion sin exito tres veces")
    public void queHeIntentadoIniciarSesionSinExitoTresVeces() {
    }

    @When("intento iniciar sesion por cuarta vez con credenciales invalidas")
    public void intentoIniciarSesionPorCuartaVezConCredencialesInvalidas() {
    }

    @Then("deberia ver un mensaje de error indicando que he excedido el limite de intentos")
    public void deberiaVerUnMensajeDeErrorIndicandoQueHeExcedidoElLimiteDeIntentos() {
    }

    @And("deberia recibir un correo para confirmar mi identidad")
    public void deberiaRecibirUnCorreoParaConfirmarMiIdentidad() {
    }
}
