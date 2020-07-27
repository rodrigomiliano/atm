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
				
		System.out.println("");
		
		// Creo un banco, un usuario y una cuenta, y luego agrego esa cuenta al banco
		Banco banco2 = new Banco("Santander");
		Usuario mGonzalez = new Usuario("Mariano", "Gonzalez");
		Cuenta cuenta11111 = new Cuenta(11111, 11111, 8000, mGonzalez);
		banco2.agregarCuenta(cuenta11111);
		// Creo otro usuario y otra cuenta, y las agrego al ultimo banco
		Usuario fRodriguez = new Usuario("Fabian", "Rodriguez");
		Cuenta cuenta22222 = new Cuenta(22222, 22222, 3300, fRodriguez);
		banco2.agregarCuenta(cuenta22222);
		
		
		//System.out.println(banco2.getCantidadCuentas());
		System.out.println("");
		System.out.println(banco2.toString());
		//System.out.println(banco2.cuentas.length);
		
		//String[] pepe = {"aaa","bbb","ccc"};
		//System.out.println(pepe.length);
		
		
		ATM cajero01 = new ATM();
        cajero01.menu();
	
		
		
		
	}

}
