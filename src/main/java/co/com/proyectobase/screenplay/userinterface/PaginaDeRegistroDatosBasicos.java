package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistroDatosBasicos {

    public static final Target NOMBRE = Target.the("").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target APELLIDO = Target.the("").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target CORREO = Target.the("").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target SELECCIONAR_MES = Target.the("").located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target SELECIONAR_DIA = Target.the("").located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECCIONAR_ANO = Target.the("").located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target SELECCIONAR_IDIOMA = Target.the("").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_LOCATION = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

}
