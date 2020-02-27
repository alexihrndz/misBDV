package co.com.app.davivienda.ui.locators;

import co.com.app.davivienda.utilidades.mobileobjectfinder.Locator;

public class PantallaLoginLocator {

    public static final Locator TXT_NRO_DOCUMENTO_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.widget.EditText[@resource-id='userId']");
    public static final Locator BTN_INGRESAR_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@resource-id='btnLoginInit']");
    public static final Locator TXT_CLAVE_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.widget.EditText[@resource-id='passwordClavevirtual']");
    public static final Locator BTN_INGRESAR2_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@resource-id='btnClavevirtual']");
    public static final Locator BTN_REGISTRAR_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@text='SI']");
    public static final Locator BTN_REGISTRAR_RESULTADO_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@resource-id='btnVirtualRegisterResult']");
}
