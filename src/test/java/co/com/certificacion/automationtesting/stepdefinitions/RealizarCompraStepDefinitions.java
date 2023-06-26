package co.com.certificacion.automationtesting.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.certificacion.automationtesting.tasks.SeleccionarProductos.seleccionarProductos;
import static co.com.certificacion.automationtesting.utils.constants.Urls.*;


public class RealizarCompraStepDefinitions {
    @Before
    public void configuracionInicial (){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Lizeht");

    }

    @Given("el usuario ingresa a la pagina de automationtesting")
    public void elUsuarioIngresaALaPaginaDeAutomationtesting() {

    OnStage.theActorInTheSpotlight().wasAbleTo(new OpenUrl(automationTesting));

    }
    @When("el usuario selecciona los productos que desea comprar")
    public void elUsuarioSeleccionaLosProductosQueDeseaComprar() {

        OnStage.theActorInTheSpotlight().attemptsTo(seleccionarProductos());


    }
    @When("ingresa sus datos personales")
    public void ingresaSusDatosPersonales() {

    }
    @Then("EL usuario finaliza la compra")
    public void elUsuarioFinalizaLaCompra() {

    }
}
