package co.com.udea.sitas.AuthB.stepdefinitions;

import io.cucumber.java.Before;
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
public class AutenticacionGoogle {

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

    @Given("que el usuario prefiere usar una cuenta externa para autenticarse")
    public void queElUsuarioPrefiereUsarUnaCuentaExternaParaAutenticarse() {
    }

    @When("elige autenticarse con una cuenta de Google u otro servicio")
    public void eligeAutenticarseConUnaCuentaDeGoogleUOtroServicio() {
    }

    @Then("el sistema le permite usar otros servicios de cuentas para acceder")
    public void elSistemaLePermiteUsarOtrosServiciosDeCuentasParaAcceder() {
    }
}
