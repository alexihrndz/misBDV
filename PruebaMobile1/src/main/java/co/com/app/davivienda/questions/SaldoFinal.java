package co.com.app.davivienda.questions;

import co.com.app.davivienda.utils.MostrarSaldo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.app.davivienda.utilidades.constantes.Datos.getMontoPagar;
import static co.com.app.davivienda.utilidades.constantes.Datos.getSaldoFinal;
import static co.com.app.davivienda.utilidades.constantes.Datos.getSaldoInicial;


public class SaldoFinal implements Question<Boolean> {

	private static final Logger LOGGER = LoggerFactory.getLogger(SaldoFinal.class);

	@Override
	public Boolean answeredBy(Actor actor) {
		double saldoFinal;
		double saldoInicial;
		int montoPagar;
		boolean cero = false;
		saldoInicial= MostrarSaldo.saldoNumero(getSaldoInicial());
		saldoFinal = MostrarSaldo.saldoNumero(getSaldoFinal());
		montoPagar = getMontoPagar();
		
		double resta = saldoFinal + montoPagar - saldoInicial;

        LOGGER.info("Resta: " + resta);
		
		if (resta == 0) {
			cero = true;
			} 				
		return cero;
	}
	
	public static SaldoFinal saldoFinal() {
		return new SaldoFinal();
		
	}

}
