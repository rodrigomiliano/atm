package cajero;

import producto.Cuenta;
import sucursal.Banco;

public class ATM {
	private Banco banco;
	private Dispensador dispensador;
	private Cuenta cuentaOperacion;

	
	public boolean autenticar(int nroCuenta, int NIP) {
		return banco.validarCuenta(nroCuenta, NIP);
	}
	
	public Double consultarSaldo() {
		return cuentaOperacion.verSaldo();
	}
	
	public Double depositar(double deposito) {
		return cuentaOperacion.depositarFondo(deposito);
	}
	
	public Double retirar(double retiro) {
		
		if(dispensador.haySaldoDisponible(retiro)) {
			return cuentaOperacion.retirarEfectivo(retiro);			
		}else {
			//llamar a pantalla para mostrar que el ABM no tiene
			//saldo suficiente para el retiro que quiere hacer.
		}
	}
	
	public void cerrarSesion() {
		cuentaOperacion = null;
	}
	
	public boolean sesionActiva() {
		return cuentaOperacion == null;
	}
}









