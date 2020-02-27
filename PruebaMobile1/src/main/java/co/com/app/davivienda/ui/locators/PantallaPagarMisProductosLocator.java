package co.com.app.davivienda.ui.locators;

import co.com.app.davivienda.utilidades.mobileobjectfinder.Locator;



public class PantallaPagarMisProductosLocator {

    public static final Locator CAMPO_PRODUCTO_PAGAR_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@text='Producto a pagar']");
    public static final Locator TDC_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[contains(@text ,'{0}')][@index='0']"); //****3796

}
