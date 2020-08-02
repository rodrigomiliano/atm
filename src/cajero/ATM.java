package cajero;

import producto.Cuenta;
import sucursal.Banco;

public class ATM {
	
    // VARIABLES
	private Banco banco;
	private Dispensador dispensador;
	private Cuenta cuentaOperacion;
		
	public ATM() {		
	}
	
	public ATM(Banco banco) {
		super();
		this.banco = banco;
		this.dispensador = new Dispensador();
		mostrarSaldoDispensador();
	}
	
	// GETTERS Y SETTERS		
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Dispensador getDispensador() {
		return dispensador;
	}

	public void setDispensador(Dispensador dispensador) {
		this.dispensador = dispensador;
	}

	

	// METODO PARA AUITENTICAR CUENTA CLIENTE
	public boolean autenticar(Integer numeroCuenta, Integer nip) {
		Cuenta cuentaCliente = banco.validarCuenta(numeroCuenta, nip);
		if (cuentaCliente != null) {
			//System.out.println("Cuenta Cliente: " + cuentaCliente.toString());
			cuentaOperacion = cuentaCliente;
			return true;
		} else {
		//	System.out.println("Cuenta Cliente: no encontrada");
			return false;
		}
	}
	
	// METODO CONSULTAR SALDO
	public Double consultarSaldo() {
		mostrarSaldoDispensador();
		return cuentaOperacion.consultarSaldo();
	}
	
	
	// METODO PARA DEPOSITAR
	public Double depositar(Double deposito) {
		mostrarSaldoDispensador();
		return cuentaOperacion.depositarDinero(deposito);
	}
	
	public Double retirarDinero(Double monto) {
		Double retiro = cuentaOperacion.consultarSaldo();
		if(dispensador.haySaldoDisponible(monto)) {
			retiro = cuentaOperacion.retirarDinero(monto);
			dispensador.restar(monto);
			mostrarSaldoDispensador();
		}else {
			System.out.println("El dispenser no cuenta con suficiente dinero");
		}
		return retiro;
	}
	
	
	// MUESTRA SALDO DISPENSADOR
	public Double mostrarSaldoDispensador() {
		return this.dispensador.getMontoDispenser();
	}
	
	
	public void cerrarSesion() {//Revisar
		cuentaOperacion = null;
	}
	
	public boolean sesionActiva() {
		return cuentaOperacion == null; //Revisar si hace lo que creo que hace.
	}
	
	
	public void getDatosCuenta() {
		System.out.println("Bienvenido");
		System.out.println(" # " + cuentaOperacion.getUsuario().getNombreCompleto());
		System.out.println(" # " + cuentaOperacion.getNumeroCuenta());
		
	}
	
		
	
	
	
	
	
	
}









