package co.com.app.davivienda.ui.pages;


import net.serenitybdd.screenplay.targets.Target;

import static co.com.app.davivienda.ui.locators.PantallaLoginLocator.TXT_NRO_DOCUMENTO_LOCATOR;
import static co.com.app.davivienda.ui.locators.PantallaLoginLocator.BTN_INGRESAR_LOCATOR;
import static co.com.app.davivienda.ui.locators.PantallaLoginLocator.BTN_INGRESAR2_LOCATOR;
import static co.com.app.davivienda.ui.locators.PantallaLoginLocator.TXT_CLAVE_LOCATOR;
import static co.com.app.davivienda.ui.locators.PantallaLoginLocator.BTN_REGISTRAR_LOCATOR;
import static co.com.app.davivienda.ui.locators.PantallaLoginLocator.BTN_REGISTRAR_RESULTADO_LOCATOR;
import static co.com.app.davivienda.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class Login {

	public static final Target TXT_NRO_DOCUMENTO =
			Target.the("Numero de Documento").located(theElementBy(TXT_NRO_DOCUMENTO_LOCATOR));
	public static final Target BTN_INGRESAR   =
			Target.the("Boton ingresar").located(theElementBy(BTN_INGRESAR_LOCATOR));
	public static final Target TXT_CLAVE =
			Target.the("Clave").located(theElementBy(TXT_CLAVE_LOCATOR));
	public static final Target BTN_INGRESAR2 =
			Target.the("Boton ingresar").located(theElementBy(BTN_INGRESAR2_LOCATOR));
	public static final Target BTN_REGISTRAR =
			Target.the("Boton registrar dispositivo").located(theElementBy(BTN_REGISTRAR_LOCATOR));
	public static final Target BTN_REGISTRAR_RESULTADO =
			Target.the("Resultado de registro").located(theElementBy(BTN_REGISTRAR_RESULTADO_LOCATOR));

}
