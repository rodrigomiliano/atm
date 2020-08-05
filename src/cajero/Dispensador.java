package cajero;

public class Dispensador {

	// VARIABLES
	private static Dispensador instance = null;
	private static final Integer BILLETES_INICIALES = 500; 
	private static final Double MONTO_BILLETES = 20.0; 
	private double saldoDispenser;
	
	// CONSTRUCTOR
	private Dispensador() {
		this.saldoDispenser = BILLETES_INICIALES * MONTO_BILLETES ;
	}
	
	public static Dispensador getInstance() {
		if (instance == null)
			instance = new Dispensador();
		return instance;
	}

	// GETTER Y SETTER DE SALDODISPENSER
	public double getSaldoDispenser() {
		return saldoDispenser;
	}

	public void setSaldoDispenser(double saldoDispenser) {
		this.saldoDispenser = saldoDispenser;
	}

	// GETTER DE BILLETESINICIALES
	public int getBilletesIniciales() {
		return BILLETES_INICIALES;
	}

	// GETTER DE  MONTOBILLETES
	public double getMontoBilletes() {
		return MONTO_BILLETES;
	}
	
	
	// METODO PARA RESTAR SALDO AL DISPENSADOR
	public void restar(Double monto) {
		saldoDispenser = saldoDispenser - monto;
	}
	
	// METODO PARA SABER SI HAY O NO SALDO EN EL DISPENSADOR
	public boolean haySaldoDisponible(Double monto) {
		return (saldoDispenser >= monto);
	}

	// TO STRING
	@Override
	public String toString() {
		return "Dispensador [billetesIniciales=" + BILLETES_INICIALES + ", montoBilletes=" + MONTO_BILLETES
				+ ", saldoDispenser=" + saldoDispenser + "]";
	}	
	
}
