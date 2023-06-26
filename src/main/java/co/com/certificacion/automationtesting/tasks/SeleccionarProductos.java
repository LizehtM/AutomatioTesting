package co.com.certificacion.automationtesting.tasks;

import co.com.certificacion.automationtesting.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static co.com.certificacion.automationtesting.userinterfaces.RealizarCompra.*;

public class SeleccionarProductos implements Task {

    private WebDriver driver;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HTML5FORMS));
        actor.attemptsTo(WaitUntil.the(SELENIUMRUBY, WebElementStateMatchers.isEnabled()).forNoMoreThan(8).seconds());
        actor.attemptsTo(Scroll.to(SELENIUMRUBY));
        actor.attemptsTo(Click.on(SELENIUMRUBY));
        actor.attemptsTo(Click.on(MASTERINGJAVASCRIPT));
        actor.attemptsTo(Click.on(TOTALPRODUCTOS));
        actor.attemptsTo(WaitUntil.the(TOTALPRODUCTOS, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds());
//        Alert alert = driver.switchTo().alert();
//        alert.getText();
        actor.attemptsTo(Click.on(VENTANA));

    }

    public static SeleccionarProductos seleccionarProductos (){
        return Tasks.instrumented(SeleccionarProductos.class);
    }

}
