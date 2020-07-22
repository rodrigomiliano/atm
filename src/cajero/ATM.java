package cajero;

import producto.Cuenta;
import sucursal.Banco;

public class ATM {
	private Banco banco;
	private Dispensador dispensador;
	private Cuenta cuentaOperacion;

	
	public boolean autenticar(int nroCuenta, int NIP) {
		return true;
	}
	
	public Double consultarSaldo() {
		return 0.00;
	}
	
	public Double depositar(double deposito) {
		return 0.00;
	}
	
	public Double retirar(double retiro) {
		return 0.00;
	}
	
	public void cerrarSesion() {
		
	}
	
	public boolean sesionActiva() {
		return true;
	}
}









