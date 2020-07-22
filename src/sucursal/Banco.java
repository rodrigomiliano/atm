package sucursal;

public class Banco {

	//ATRIBUTOS
	private String nombre;
	private Cuenta[] cuentas;
	
	//CONSTRUCTOR
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.cuentas = new Cuenta[];
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
