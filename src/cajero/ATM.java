package cajero;

import producto.Cuenta;
import sucursal.Banco;

public class ATM {
	
	private Banco banco;
	private Dispensador dispensador;
	private Cuenta cuentaOperacion;
	
	public ATM() {
		
	}
	
	public ATM(Banco banco) {
		super();
		this.banco = banco;
		this.dispensador = new Dispensador();
	}
	
	public Double mostrarSaldo() {
		return this.dispensador.getMontoDispenser();
	}

	/*
	public boolean autenticar(int nroCuenta, int NIP) {
		// llena cuentaOperacion con lo que recibe de validarCuenta
		cuentaOperacion = banco.validarCuenta(nroCuenta, NIP);
		if(cuentaOperacion == null) {
			return false;
		}else {
			return true;
		}
		
	}
	*/
	public Double consultarSaldo() {
		return cuentaOperacion.verSaldo();
	}
	/*
	public Double depositar(double deposito) {
		return cuentaOperacion.depositarFondo(deposito);
	}
	
	public Double retirar(double retiro) {
		
		if(dispensador.haySaldoDisponible(retiro)) {
			return cuentaOperacion.retirarEfectivo(retiro);			
		}else {
			//llamar a pantalla para mostrar que el ATM no tiene
			//saldo suficiente para el retiro que quiere hacer.
		}
	}
	*/
	public void cerrarSesion() {
		cuentaOperacion = null;
	}
	
	public boolean sesionActiva() {
		return cuentaOperacion == null; //Revisar si hace lo que creo que hace.
	}
}









