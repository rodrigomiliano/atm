package sucursal;

import java.util.ArrayList;
import java.util.List;
import producto.Cuenta;

public class Banco {
	
	// VARIABLES
	private String nombre;
	private List<Cuenta> cuentas;
	
	
	// CONSTRUCTOR
	public Banco(String nombre) {		
		this.nombre = nombre;		
		this.cuentas = new ArrayList();
	}
	
	// GETTER Y SETTER DE NOMBRE 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	
	// GETTER Y SETTER DE CUENTAS
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
	
			
	// METODO PARA VALIDAR CUENTA AL INGRESAR CUENTA Y NIP
		public Cuenta validarCuenta(Integer numeroCuenta, Integer nip) {			
			Cuenta cuentaObtenida = null;
			Cuenta cuentaBuscada  = new Cuenta(numeroCuenta, nip);			
			for (Cuenta cuenta : cuentas) {
				if (cuenta.equals(cuentaBuscada)) {
					cuentaObtenida = cuenta;
					break;
				}
			}			
			return cuentaObtenida;
		}


	// TO STRING	
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", cuentas=" + cuentas + "]";
	}
	
}
