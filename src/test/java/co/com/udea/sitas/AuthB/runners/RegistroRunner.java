package co.com.udea.sitas.AuthB.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Registro.feature/",
        glue = "co.com.udea.sitas.AuthB.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegistroRunner {}