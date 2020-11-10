package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.model.DatosUsuario;
import static co.com.proyectobase.screenplay.userinterface.PaginaDeRegistroDatosBasicos.*;

import static co.com.proyectobase.screenplay.userinterface.PaginaDeRegistroDireccion.*;

import static co.com.proyectobase.screenplay.userinterface.PaginaUltimoPasoRegistro.*;

import static co.com.proyectobase.screenplay.userinterface.PaginaDeRegistroDatosDispositivos.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class Registrar implements Task {

    private DatosUsuario datos;

    public Registrar(DatosUsuario datos) {
        this.datos = datos;
    }

    public static Registrar enLaPaginaConMis(DatosUsuario datos) {
        return Tasks.instrumented(Registrar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.getNombre()).into(NOMBRE),
                Enter.theValue(datos.getApellido()).into(APELLIDO),
                Enter.theValue(datos.getCorreo()).into(CORREO),
                SelectFromOptions.byVisibleText(datos.getMes()).from(SELECCIONAR_MES),
                SelectFromOptions.byVisibleText(datos.getDia()).from(SELECIONAR_DIA),
                SelectFromOptions.byVisibleText(datos.getAno()).from(SELECCIONAR_ANO),
                Type.theValue(datos.getIdioma()).into(SELECCIONAR_IDIOMA).thenHit(Keys.ENTER),
                Click.on(NEXT_LOCATION),
                Enter.theValue(datos.getCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.getCodigoPostal()).into(CODIGO_POSTAL),
                Type.theValue(datos.getPais()).into(PAIS),
                Click.on(NEXT_DEVICES),
                Click.on(NEXT_LAST_STEP),
                Enter.theValue(datos.getContrasena()).into(CONTRASENA),
                Enter.theValue(datos.getContrasena()).into(CONFIRMAR_CONTRASENA),
                Click.on(ACEPTO_UNO),
                Click.on(ACEPTO_DOS),
                Click.on(COMPLETE_SETUP)
               );

    }
}
