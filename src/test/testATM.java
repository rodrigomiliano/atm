package test;

import cajero.ATM;
import cliente.Usuario;
import producto.Cuenta;
import sucursal.Banco;

public class testATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco("Rio");
		System.out.println(banco.getNombre());
		
		ATM atm = new ATM(banco);
		System.out.println("El saldo es: ");
		System.out.println(atm.mostrarSaldo());
		
		//banco.agregarCuenta(null);
		
		
		/*genero el 1º vehiculo para ingresar (1/10 dentro del garaje)
		Coche renault = new Coche(10000, "Renault", 5);//le doy kilometros, marca y puertas
		System.out.println("¿El Garaje esta lleno? " + garaje.estaLleno());
		garaje.ingresarVehiculo(renault);
		System.out.println("Detalle actualizado del garaje: \n" + garaje.toString());*/
		System.out.println("");
		Banco banco2 = new Banco("ASD");
		Usuario mGonzalez = new Usuario("Mariano", "Gonzalez");
		Cuenta cuenta001 = new Cuenta(11111, 11111, 8000, mGonzalez);		
		//System.out.println("Cuentas: " + banco.toString());
		
		System.out.println(banco);
		
			
	
		
		
		
	}

}
