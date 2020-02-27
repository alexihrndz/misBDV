package co.com.app.davivienda.ui.locators;

import co.com.app.davivienda.utilidades.mobileobjectfinder.Locator;

public class PantallaBienvenidaLocator {

    public static final Locator BTN_PERMITIR_LOCATOR = Locator.locator().withAndroid("id$com.android.packageinstaller:id/permission_allow_button");
    public static final Locator BTN_CONTINUAR_LOCATOR = Locator.locator().withAndroid("className$android.widget.ImageButton");

}
