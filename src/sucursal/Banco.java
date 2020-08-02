package sucursal;

import java.util.ArrayList;
import java.util.List;
import producto.Cuenta;

public class Banco {
	
	// VARIABLES
	private String nombre;
	public List<Cuenta> cuentas;
	
	
	// CONSTRUCTOR
	public Banco(String nombre) {		
		this.nombre = nombre;		
		this.cuentas = new ArrayList();
	}
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
		

	// METODO PARA AGREGAR CUENTAS AL LISTADO
	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
			
	//METODO PARA VALIDAR CUENTA AL INGRESAR CUENTA Y NIP
		public Cuenta validarCuenta(Integer numeroCuenta, Integer nip) {
			//System.out.println("Parametro: " + numeroCuenta + " - " + nip); //para ver Cuenta y NIP ingresado
			Cuenta cuentaObtenida = null;
			Cuenta cuentaBuscada  = new Cuenta(numeroCuenta, nip);
			//System.out.println("Cuenta Buscada: " + cuentaBuscada.getNumeroCuenta() + "; NIP buscado: " + cuentaBuscada.getNip());//para ver Cuenta y NIP ingresado
			for (Cuenta cuenta : cuentas) {
				//System.out.println("Cuenta: " + cuenta.getNumeroCuenta() + " NIP: " + cuenta.getNip());//para ver Cuenta y NIP ingresado
				//System.out.println("¿Pertenecen a un cliente esa cuenta y NIp? " + cuenta.equals(cuentaBuscada));
				if (cuenta.equals(cuentaBuscada)) {
					cuentaObtenida = cuenta;
					break;
				}
			}
			// En caso que no se encuentre me avisa
			//if (cuentaObtenida == null) {
			//	System.out.println("Cuenta no encontrada");
			//}
			return cuentaObtenida;
		}


		@Override
		public String toString() {
			return "Banco [nombre=" + nombre + ", cuentas=" + cuentas + "]";
		}
		
	
	
	
	
	
}
