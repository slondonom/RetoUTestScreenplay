package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaUltimoPasoRegistro {
    public static final Target CONTRASENA = Target.the("").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("").located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target ACEPTO_UNO = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACEPTO_DOS = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("").located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target MENSAJE_ESPERADO = Target.the("").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
