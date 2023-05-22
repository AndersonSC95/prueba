package co.edu.udea.certificacion.calidad.stepdefinitions;

import com.calidad.calidadautomation.questions.Validacion;
import com.calidad.calidadautomation.tasks.OpenThe;
import com.calidad.calidadautomation.userinterfaces.UsuarioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class FindHomePageStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor estudiante = Actor.named("Anderson");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        estudiante.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaPrincipal(){
        estudiante.can(BrowseTheWeb.with(driver));
    }

    @When("escriba la palabra U de A")
    public void  escribaLaPalabraUdeA(){
        estudiante.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @Then("puedo ver el link de la pagina oficial")
    public void puedoVerElLinkOficial(){
        estudiante.should(seeThat(Validacion.theHomePage(),equalTo(true)));
    }
    
}
