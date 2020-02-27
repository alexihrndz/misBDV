package co.com.app.davivienda.utilidades.constantes;

public class TipoClaseConstante {

	private static final String CLASE_UTILIDAD = null;

	private TipoClaseConstante() {
		throw new IllegalStateException("Utility class");
	}

	public static String getClaseUtilidad() {
		return CLASE_UTILIDAD;
	}
}
