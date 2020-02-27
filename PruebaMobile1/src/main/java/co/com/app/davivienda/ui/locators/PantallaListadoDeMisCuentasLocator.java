package co.com.app.davivienda.ui.locators;

import co.com.app.davivienda.utilidades.mobileobjectfinder.Locator;

public class PantallaListadoDeMisCuentasLocator {

    public static final Locator CUENTA_DEBITO_LOCATOR =
            Locator.locator().withAndroid("xpath$//android.view.View[contains(@text, '{0}')][@index='0']");
}
