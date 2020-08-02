package test;

import cajero.ATM;
import dao.BancoDAO;
import pantalla.Menu;
import sucursal.Banco;

public class testATM {

	public static void main(String[] args) {

		BancoDAO m1 = new BancoDAO();

		Banco banco = m1.crearBanco("Banco Galicia");

		ATM cajero = new ATM(banco);
		
		Menu menu = new Menu();
		
		menu.inicio(cajero);

		
	}

}