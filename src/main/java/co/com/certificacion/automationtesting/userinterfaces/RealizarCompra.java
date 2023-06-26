package co.com.certificacion.automationtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RealizarCompra {

    public static final Target SELENIUMRUBY = Target.the("Selenium ruby").
            located(By.xpath("//a[@data-product_id='160']"));

    public static final Target MASTERINGJAVASCRIPT = Target.the("Mastering javaScript").
            located(By.xpath("//a[@data-product_id='165']"));

    public static final Target HTML5FORMS = Target.the("Html 5 forms").
            located(By.xpath("//a[@data-product_id='181']"));

    public static final Target TOTALPRODUCTOS = Target.the("Total productos").
            located(By.xpath("//a[@class='wpmenucart-contents']"));

    public static final Target VENTANA = Target.the("ventana").located(By.id("dismiss-button"));


}

