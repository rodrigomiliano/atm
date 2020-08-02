package dao;

import sucursal.Banco;
import producto.Cuenta;
import cliente.Usuario;

public class BancoDAO {	
		
		public Banco crearBanco(String nombre) {
			Banco banco = new Banco(nombre);
			
			System.out.println(banco.getNombre());
			
			banco.agregarCuenta(crearCuenta("Andres", "Alsina", 11111, 22222, 8000.0));
			banco.agregarCuenta(crearCuenta("Carlos", "Crosa", 33333, 44444, 11000.0));
			banco.agregarCuenta(crearCuenta("Manuel", "Martinez", 55555, 66666, 3000.0));
			return banco;
		}

		private Cuenta crearCuenta(String nombre, String apellido, Integer numeroCuenta, Integer nip, double saldoInicial) {
			Usuario usuario = new Usuario(nombre, apellido);
			Cuenta cuenta = new Cuenta(numeroCuenta, nip, saldoInicial, usuario);
			return cuenta;
		}

	
}
