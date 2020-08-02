package cajero;

public class Dispensador {

	// VARIABLES
	public final Integer billetesIniciales = 500; 
	public final Double montoBilletes = 20.0; 
	private double saldoDispenser;
	
	// CONSTRUCTOR
	public Dispensador() {
		this.saldoDispenser = billetesIniciales * montoBilletes ;
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
		return billetesIniciales;
	}

	// GETTER DE  MONTOBILLETES
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
