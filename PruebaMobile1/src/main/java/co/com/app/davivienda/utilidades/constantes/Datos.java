package co.com.app.davivienda.utilidades.constantes;

public class Datos {

	private static final String NRO_DOCUMENTO = "41354746";
	private  static final String CLAVE_LOGIN = "2587";
	private static final int MONTO_PAGAR = 3;
	private static String saldoInicial;
	private static String saldoFinal;

	private Datos() {
		throw new IllegalStateException("Utility class");
	}

	public static String getNroDocumento() {
		return NRO_DOCUMENTO;
	}

	public static String getClave() {
		return CLAVE_LOGIN;
	}

	public static int getMontoPagar() {
		return MONTO_PAGAR;
	}

	public static String getSaldoInicial() {
		return saldoInicial;
	}

	public static String getSaldoFinal() {
		return saldoFinal;
	}

	public static void setSaldoInicial(String saldoInicial) {
		Datos.saldoInicial = saldoInicial;
	}

	public static void setSaldoFinal(String saldoFinal) {
		Datos.saldoFinal = saldoFinal;
	}


}
