package test;

import java.util.Scanner;
import cajero.ATM;
import dao.BancoDAO;
import sucursal.Banco;

public class testATM {

	final static int CONSULTA_SALDO = 1;
	final static int DEPOSITO = 2;
	final static int RETIRO = 3;
	final static int SALIR = 4;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		BancoDAO m1 = new BancoDAO();

		Banco banco = m1.crearBanco("Banco Galicia");

		ATM cajero = new ATM(banco);
		

		inicio(cajero);

		System.out.println("Fin");
		scanner.close();

	}

	private static void inicio(ATM cajero) {
		boolean continuar = true;

		while (continuar == true) {

			int nroCuenta = getInt("Ingrese el numero de cuenta: ");
			int nip = getInt("Ingrese el NIP: ");

			boolean autenticado = cajero.autenticar(nroCuenta, nip);
			//System.out.println("Autenticado: " + autenticado); //Verifica si exista una cuenta y nip segun lo ingresado
			if (autenticado) {
				//System.out.println("Puedo operar con el cajero");
				cajero.getDatosCuenta();
				menuOpeaciones(cajero);
			} else {
				System.out.println("Cuenta y NIP incorrecto");
			}
			System.out.print("¿Desea continar? ingrese true/false"); // ver si se puede armar un mensaje de error ingrese opcion si/no
			continuar = scanner.nextBoolean(); 
			System.out.println();
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
		System.out.println(" * " + DEPOSITO + " - Depósito");
		System.out.println(" * " + RETIRO + " - Retiro");
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

	private static double getDouble(String mensaje) {//para evitar ingreso de letras al depositar o retirar
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

