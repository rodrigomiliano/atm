package sucursal;

import java.util.Arrays;

import producto.Cuenta;


public class Banco {

	//ATRIBUTOS
	private String nombre;
	private Cuenta[] cuentas;
	private int cantidadCuentas; // (agregado 24/7)
	
	//CONSTRUCTOR
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		cuentas = new Cuenta[10];
		this.cantidadCuentas = 0; // (agregado 24/7)
	}

	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
		
	
	public int getCantidadCuentas() { // (agregado 24/7)
		return cantidadCuentas;
	}


	public void setCantidadCuentas(int cantidadCuentas) { // (agregado 24/7)
		this.cantidadCuentas = cantidadCuentas;
	}


	//METODO PARA AGREGAR CUENTAS (agregado 24/7)
	public void agregarCuenta(Cuenta cuenta) {
        int i = cantidadCuentas++;
        this.cuentas[i] = cuenta;
    }


	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", cuentas=" + Arrays.toString(cuentas) + ", cantidadCuentas="
				+ cantidadCuentas + "]";
	}
	
	
	
	
	/*
	public void ingresarVehiculo(Vehiculo vehiculo) {
	    if (!estaLleno()){
			for (int i = 0; i < capacidadMaxima; i++){
		    	if (vehiculos[i] == null){
		    	    capacidadOcupada = capacidadOcupada + 1;
		    		vehiculos[i] = vehiculo;
		    		System.out.println("Ingresa un vehiculo al garaje en la posición: " + i + ", vehiculo: " + vehiculos[i]);
		    		break; 
		    	}
		    }
	    } else {
	    	System.out.println("Garage lleno, el vehiculo no puede ingresar");
	    }	    
	}
	*/
	
	
	
	
	
	
	//METODO PARA ??
		public Cuenta validarCuenta(Integer numeroCuenta, Integer nip) {
			//System.out.println("Parametro: " + numeroCuenta + " - " + nip);
			Cuenta cuentaObtenida = null;
			Cuenta cuentaBuscada  = new Cuenta(numeroCuenta, nip);
			//System.out.println("Cuenta Buscada: " + cuentaBuscada.toString());
			for (Cuenta cuenta : cuentas) {
				//System.out.println("--Cuenta: " + cuenta.getNumeroCuenta() + " - " + cuenta.getNIP());
				//System.out.println("Iguales: " + cuenta.equals(cuentaBuscada));
				if (cuenta.equals(cuentaBuscada)) {
					cuentaObtenida = cuenta;
					break;
				}
			}
			// En caso que no se encuentre me avisa
			if (cuentaObtenida == null) {
				System.out.println("Cuenta no encontrada");
			}
			return cuentaObtenida;
		}
	
	
	
	
	
	
	
}
