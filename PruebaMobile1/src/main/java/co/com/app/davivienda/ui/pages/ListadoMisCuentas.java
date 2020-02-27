package co.com.app.davivienda.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static co.com.app.davivienda.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.app.davivienda.ui.locators.PantallaListadoDeMisCuentasLocator.CUENTA_DEBITO_LOCATOR;
import static co.com.app.davivienda.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ListadoMisCuentas {

	public static final Target CUENTA_DEBITO =
			Target.the("Cuenta 8878").locatedBy(dynamicElement(CUENTA_DEBITO_LOCATOR));
}
