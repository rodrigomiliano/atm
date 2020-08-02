package pantalla;

import java.util.Scanner;

import cajero.ATM;

public class Menu {
	final static int CONSULTA_SALDO = 1;
	final static int RETIRO = 2;
	final static int DEPOSITO = 3;
	final static int SALIR = 4;
	static Scanner scanner = new Scanner(System.in);
	
	public void inicio(ATM cajero) {
		boolean continuar = true;
		String ingreso = "y";
		
		while (continuar == true) {		
		switch (ingreso) {
		case "y":
			System.out.println("BIENVENIDO");
			int nroCuenta = getInt("Ingrese el numero de cuenta: ");
			int nip = getInt("Ingrese el NIP asociado al n° de cuenta especificado: ");
			boolean autenticado = cajero.autenticar(nroCuenta, nip);
			
			if (autenticado) {				
				cajero.getDatosCuenta();
				menuOpeaciones(cajero);
			} else {
				System.out.println("Cuenta y NIP incorrecto");
			}
			System.out.print("¿Desea continar? ingrese Y para continuar, N para salir: ");
			ingreso = scanner.next().toLowerCase();
			continuar = true;
			System.out.println();
			
			break;

		default:
			continuar = false;
			System.out.println("Fin de sesión. Muchas gracias por operar con nosotros.");
			System.out.println("------------------------------------------------");
			System.out.println("------------------------------------------------");
			inicio(cajero);
			//scanner.close();
			break;
		}

		}
	}

	private static void menuOpeaciones(ATM cajero) {
		mostrarOpcionesOperaciones();
		int operacion = getOperacionValida();
		while (operacion != SALIR) {
			if (operacion == CONSULTA_SALDO) {
				
				System.out.println("Consultar Saldo");
				System.out.println("El saldo de su cuenta es: " + cajero.consultarSaldo());
				
			} else if (operacion == DEPOSITO) {
				
				System.out.println("Depositar");
				Double monto = getDouble("Ingrese el monto a depositar: ");
				Double nuevoSaldo = cajero.depositar(monto);
				System.out.println("Su nuevo saldo es: " +  nuevoSaldo);
				
			} else if (operacion == RETIRO) {
				
				System.out.println("Retirar");
				Double monto = getDouble("Ingrese el monto a retirar: ");
				Double nuevoSaldo = cajero.retirarDinero(monto);
				System.out.println("Su nuevo saldo es: " +  nuevoSaldo);
				
			}
			mostrarOpcionesOperaciones();
			operacion = getOperacionValida();
		}
	}

	private static int getOperacionValida() {
		boolean continuar = true;
		int operacion = -1;
		while (continuar == true) {
			operacion = getInt("Ingrese la operacion: ");
			if (operacion == CONSULTA_SALDO ||
				operacion == DEPOSITO ||
				operacion == RETIRO ||
				operacion == SALIR) {
				continuar = false;
			} else {
				System.out.println("La operación seleccionada no existe, ingrese nuevamente la operación");
				continuar = true;
			}
		}
		return operacion;
	}

	private static void mostrarOpcionesOperaciones() {
		System.out.println("------------------------------------------------");
		System.out.println("- Opciones de Operaciones                      -");
		System.out.println("------------------------------------------------");
		System.out.println(" * " + CONSULTA_SALDO + " - Consulta de Saldo");
		System.out.println(" * " + RETIRO + " - Retiro");
		System.out.println(" * " + DEPOSITO + " - Depósito");		
		System.out.println(" * " + SALIR + " - Salir");
		System.out.println("------------------------------------------------");
	}

	private static int getInt(String mensaje) { //Para evitar ingreso de letras al pedir cuenta y NIP
		int valor = -1;
		while (valor < 0) {
			try {
				scanner = new Scanner(System.in);
				System.out.print(mensaje);
				valor = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Ingrese un valor entero válido");
				valor = -1;
			}
		}
		return valor;
	}

	private static double getDouble(String mensaje) {// Para evitar ingreso de letras al depositar o retirar
		double valor = -1D;
		while (valor < 0) {
			try {
				scanner = new Scanner(System.in);
				System.out.print(mensaje);
				valor = scanner.nextDouble();
			} catch (Exception e) {
				System.out.println("Ingrese un valor decimal válido");
				valor = -1;
			}
		}
		return valor;
	}
}
