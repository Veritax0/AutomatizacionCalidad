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
public class RegistroInvalidoStepDefinition {

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

    @Given("que el usuario desea registrarse en el sistema de la aerolinea")
    public void deseoRegistrarme(){
        //todo task
    }

    @Given("se encuentra en la pagina de registro")
    public void estoyEnElRegistro(){
        //todo task
    }

    @When("ingresa informacion invalida al crear la cuenta")
    public void ingresaMiInfo(){
        //todo task
    }

    @Then("el sistema indica que ha habido un error en los datos ingresados")
    public void usuarioCreado(){
        //todo task
    }
}
