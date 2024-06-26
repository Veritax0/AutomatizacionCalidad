package co.com.udea.sitas.AuthB.stepdefinitions;

import co.com.udea.sitas.AuthB.questions.AlertValidation;
import co.com.udea.sitas.AuthB.questions.InvalidDataValidation;
import co.com.udea.sitas.AuthB.tasks.*;
import co.com.udea.sitas.AuthB.userinterfaces.SignInPage;
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
public class RegistroStepDefinition {

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

    @Given("que el usuario desea registrarse en el sistema de la aerolinea")
    public void queElUsuarioDeseaRegistrarseEnElSistemaDeLaAerolinea() {
        //usuario.attemptsTo(OpenSite.page(new SignInPage()));
    }

    @And("se encuentra en la pagina de registro")
    public void seEncuentraEnLaPaginaDeRegistro() {
        usuario.attemptsTo(OpenSite.page(new SignInPage()));
    }

    @When("ingresa su informacion al crear la cuenta")
    public void ingresaSuInformacionAlCrearLaCuenta() {
        usuario.attemptsTo(FillSignIn.fillSignIn());
    }

    @Then("el sistema indica que el usuario ha sido creado")
    public void elSistemaIndicaQueElUsuarioHaSidoCreado() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(AlertValidation.homePage(), Matchers.containsString(StringConst.VALID_REGISTER)));
    }

    @When("ingresa informacion invalida al crear la cuenta")
    public void ingresaInformacionInvalidaAlCrearLaCuenta() {
        usuario.attemptsTo(InvalidFillSignIn.fillSignIn());
    }

    @Then("el sistema indica que ha habido un error en los datos ingresados")
    public void elSistemaIndicaQueHaHabidoUnErrorEnLosDatosIngresados() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(InvalidDataValidation.homePage(), Matchers.containsString(StringConst.INVALID_REGISTER)));
    }

    @Given("que el usuario desea registrarse en el sistema de la aerolinea con una cuenta de google")
    public void queElUsuarioDeseaRegistrarseEnElSistemaDeLaAerolineaConUnaCuentaDeGoogle() {
        //usuario.attemptsTo(OpenSite.page(new SignInPage()));
    }

    @When("selecciona registrarse con su cuenta de google")
    public void seleccionaRegistrarseConSuCuentaDeGoogle() {
        usuario.attemptsTo(GoogleSignIn.googleSing());
    }
}
