package co.com.app.davivienda.ui.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.app.davivienda.utilidades.mobileobjectfinder.ElementFinder.theElementBy;
import static co.com.app.davivienda.ui.locators.PantallaBienvenidaLocator.BTN_CONTINUAR_LOCATOR;
import static co.com.app.davivienda.ui.locators.PantallaBienvenidaLocator.BTN_PERMITIR_LOCATOR;

public class Bienvenida {

	
	public static final Target BTN_PERMIITIR = Target.the("Boton permitir de android").located(theElementBy(BTN_PERMITIR_LOCATOR));
	public static final Target BTN_CONTINUAR = Target.the("Bonton continuar en Bienvenida").located(theElementBy(BTN_CONTINUAR_LOCATOR));
	
	
	
}
