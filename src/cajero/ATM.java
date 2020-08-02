package cajero;

import producto.Cuenta;
import sucursal.Banco;

public class ATM {
	
    // VARIABLES
	private static ATM instance = null;
	private Banco banco;
	private Dispensador dispensador;
	private Cuenta cuentaOperacion;
	
	// CONSTRUCTOR POR DEFECTO
	private ATM() {		
	}
	
	// CONSTRUCTOR
	private ATM(Banco banco) {
		super();
		this.banco = banco;
		this.dispensador = Dispensador.getInstance();
		mostrarSaldoDispensador();
	}
	
	public static ATM getInstance(Banco banco) {
		if(instance == null) {
			instance = new ATM(banco);
		}
		return instance;
	}
	
	// GETTER Y SETTER DE BANCO 		
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	// GETTER Y SETTER DE DISPENSADOR
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
			cuentaOperacion = cuentaCliente;
			return true;
		} else {		
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
	
	// METODO PARA RETIRAR
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
		return this.dispensador.getSaldoDispenser();
	}
		
	
	// GET DE DATOS DE LA CUENTA AL INGRESAR
	public void getDatosCuenta() {
		System.out.println("Bienvenido");
		System.out.println(" # " + cuentaOperacion.getUsuario().getNombreCompleto());
		System.out.println(" # " + cuentaOperacion.getNumeroCuenta());
		
	}	
	
}