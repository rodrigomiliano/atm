package cajero;

public class Dispensador {

	// VARIABLES
	public final int billetesIniciales = 500; // esta la posibilidad de usarlo con static, habria que ver si funciona asi o no
	public final double montoBilletes = 20; // esta la posibilidad de usarlo con static, habria que ver si funciona asi o no
	private double saldoDispenser;
	
	// CONSTRUCTOR
	public Dispensador() {
		this.saldoDispenser = billetesIniciales * montoBilletes ;
	}

	//GETTERS Y SETTERS
	public double getMontoDispenser() {
		return saldoDispenser;
	}

	public void setMontoDispenser(double montoDispenser) {
		this.saldoDispenser = montoDispenser;
	}

	public int getBilletesIniciales() {
		return billetesIniciales;
	}

	public double getMontoBilletes() {
		return montoBilletes;
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
		return "Dispensador [billetesIniciales=" + billetesIniciales + ", montoBilletes=" + montoBilletes
				+ ", saldoDispenser=" + saldoDispenser + "]";
	}
	
	
	
	
	
}
