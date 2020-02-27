package co.com.app.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.app.davivienda.ui.pages.Menu.OPC_PAGOS_RECARGAS;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.CAMPO_PRODUCTO_PAGAR;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.TDC;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.CAMPO_MONTO;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.OPC_OTRO_MONTO;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.CAMPO_OTRO_MONTO;
import static co.com.app.davivienda.ui.pages.Menu.OPC_PAGAR_MIS_PRODUCTOS;
import static co.com.app.davivienda.utilidades.constantes.Datos.getMontoPagar;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.app.davivienda.utils.ManejoTeclado.ocultarTeclado;
import static co.com.app.davivienda.ui.pages.ConsultaConsolidada.BTN_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PagarTdc implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(BTN_MENU),
				WaitUntil.the(OPC_PAGOS_RECARGAS, isVisible()),
				Click.on(OPC_PAGOS_RECARGAS),
				WaitUntil.the(OPC_PAGAR_MIS_PRODUCTOS, isVisible()),
				Click.on(OPC_PAGAR_MIS_PRODUCTOS),
				WaitUntil.the(CAMPO_PRODUCTO_PAGAR, isVisible()),
				Click.on(CAMPO_PRODUCTO_PAGAR)
				);

		actor.attemptsTo(WaitUntil.the(TDC.of("****6698"), isVisible()),
				Click.on(TDC.of("****6698")),
				WaitUntil.the(CAMPO_MONTO, isVisible()),
				Click.on(CAMPO_MONTO),
				Click.on(OPC_OTRO_MONTO),
				Enter.theValue(Integer.toString(getMontoPagar())).into(CAMPO_OTRO_MONTO)
				);

		ocultarTeclado();
	}
	public static PagarTdc prepararPago () {
		return instrumented(PagarTdc.class);
	}
}
