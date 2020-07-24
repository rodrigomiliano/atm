package test;

import cajero.ATM;
import sucursal.Banco;

public class testATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco("Rio");
		System.out.println(banco.getNombre());
		
		ATM atm = new ATM(banco);
		System.out.println("El saldo es: ");
		System.out.println(atm.mostrarSaldo());
		
		
		
	}

}
