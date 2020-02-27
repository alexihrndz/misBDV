package co.com.app.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.app.davivienda.ui.pages.ListadoMisCuentas;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.app.davivienda.utilidades.constantes.Datos.getSaldoInicial;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static co.com.app.davivienda.ui.pages.ConsultaConsolidada.LBL_CUENTAS;
import static co.com.app.davivienda.ui.pages.ListadoMisCuentas.CUENTA_DEBITO;
import static co.com.app.davivienda.utilidades.constantes.Datos.setSaldoInicial;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarSaldoInicialCuenta implements Task {

	WebElementFacade mensaje;
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultarSaldoInicialCuenta.class);

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		WebElementFacade cuentasConsolidadas;
		cuentasConsolidadas = LBL_CUENTAS.resolveFor(actor);
		
		boolean st = true;
		int i = 1;
		do {
			st = cuentasConsolidadas.isPresent();
			if(i++ > 3) {
				st= false;
			}
		}while(!st );
		
		actor.attemptsTo(
				WaitUntil.the(LBL_CUENTAS, isClickable()), 
				Click.on(LBL_CUENTAS),
				WaitUntil.the(CUENTA_DEBITO.of("8878"), isVisible())
				);

		mensaje = ListadoMisCuentas.CUENTA_DEBITO.of("8878").resolveFor(actor);
		
		 setSaldoInicial(mensaje.getText());

		LOGGER.info("Saldo inicial ->> " + getSaldoInicial());
	}

	public static ConsultarSaldoInicialCuenta leeSaldo() {
		return instrumented(ConsultarSaldoInicialCuenta.class);
	}

}
