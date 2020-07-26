package sucursal;

import java.util.Arrays;

import producto.Cuenta;

public class Banco {

	//ATRIBUTOS
	private String nombre;
	public Cuenta[] cuentas;
	private int cantidadCuentas; 
	private int cantidadMaxima; 
		
	
	//CONSTRUCTOR
	public Banco(String nombre) {
		super();
		this.nombre = nombre;		
		this.cantidadCuentas = 0 ; 
		this.cantidadMaxima = 10; 
		this.cuentas = new Cuenta [cantidadMaxima];
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

	

	public int getCantidadCuentas() {
		return cantidadCuentas;
	}

	public void setCantidadCuentas(int cantidadCuentas) {
		this.cantidadCuentas = cantidadCuentas;
	}

	

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
		
	

    //METODO PARA AGREGAR CUENTAS 
	public void agregarCuenta(Cuenta cuenta) {
		if (!limiteCuentas()) {
			for (int i = 0; i < cuentas.length; i++) {
				if (cuentas[i] == null) {
					cantidadCuentas++;
					cuentas[i] = cuenta;
					System.out.println("Se agrega una nueva cuenta al banco en posicion: " + i + "\nDetalle cuenta: \n" + cuentas[i]);
					break;
				}
			}
		} else {
			System.out.println("Se ha llegado al lìmite de cuentas permitidas en el Banco");
		}
	}
			
	// BOOLEANO PARA RETORNAR LIMITE DE CUENTAS
	public boolean limiteCuentas() {
    	return (cantidadMaxima==cantidadCuentas);
    }

	

	// TO STRING
	@Override
	public String toString() {
		return "Banco: " + nombre +	", cantidad de Cuentas: " + cantidadCuentas + ", cantidad Maxima: " + cantidadMaxima + ", Cuentas: \n" + Arrays.toString(cuentas);
	}
	
	
	
	
	
	
	//METODO PARA ??
	/*	public Cuenta validarCuenta(Integer numeroCuenta, Integer nip) {
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
		*/
	
	
	
	
	
}
