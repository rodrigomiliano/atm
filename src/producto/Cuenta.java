package producto;

// Importo la clase Usuario del paquete cliente.
import cliente.Usuario;

public class Cuenta {
		
	// VARIABLES	
	private Integer numeroCuenta;
	private Integer nip;
	private Double saldo;
	private Usuario usuario;
	

	// CONSTRUCTOR POR DEFECTO
	public Cuenta(){			
	}
	
	// CONSTRUCTOR
	public Cuenta(Integer numeroCuenta, Integer nip) {
		this();
		this.numeroCuenta = numeroCuenta;
		this.nip = nip;
	}
		
	// CONSTRUCTOR
	public Cuenta(Integer numeroCuenta, Integer nip, Double saldo, Usuario usuario){
		this(numeroCuenta, nip);
		this.saldo = saldo;
		this.usuario = usuario;
	}	
	
	//GETTERS Y SETTERS
	
	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	
	public int getNip() {
		return nip;
	}

	public void setNip(Integer nip) {
		this.nip = nip;
	}

	
	public Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
		
	
	// TOSTRING
	@Override
	public String toString() {
		return "Nº Cuenta #" + numeroCuenta + ", NIP: " + nip + ", Saldo: " + saldo + ", Usuario: " + usuario + "\n";
	}
		
	 
	// HASHCODE  
	@Override
	public int hashCode() {
		final int prime = 31; //ver porque da 31
		int result = 1;
		result = prime * result + ((nip == null) ? 0 : nip.hashCode());
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}

	// EQUALS  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (nip == null) {
			if (other.nip != null)
				return false;
		} else if (!nip.equals(other.nip))
			return false;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}
	  
	// METODO CONSULTAR SALDO CUENTA
	public Double consultarSaldo() {
		return saldo;
	}
	
	
	// Depositar dinero:
	public Double depositarDinero(Double deposito){		
			setSaldo(saldo + deposito);
			return saldo;		
	}
				
		
	// Retirar dinero:
	public Double retirarDinero(Double monto){
		if (tieneSaldo(monto)){
			setSaldo(saldo - monto);
		}else{
			System.out.println("No hay saldo suficiente para realizar la extracción");
		}
		return saldo;
	}
	
	 
	// Verificar saldo:
	public boolean tieneSaldo(Double monto){
		return saldo >= monto;
	}
		
		
}

