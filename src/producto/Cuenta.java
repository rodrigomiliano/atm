package producto;

// Importo la clase Usuario del paquete cliente.
import cliente.Usuario;

public class Cuenta {
	
	/********** Variables **********/
	
	// ¿Por qué uso clases y no el dato primitivo? int - Integer / double - Double
	private int cuenta;
	private int nip;
	private Double saldo;
	private Usuario usuario;
	
	/********** Constructores **********/

	// Constructor por defecto:
	public Cuenta(){
			
	}
	
	/* ¿Qué constructores necesito realmente? El profesor usó otros. */
		
	// Constructor:
	public Cuenta(int cuenta, int nip, double saldo, Usuario usuario){
		this.cuenta = cuenta;
		this.nip = nip;
		this.saldo = saldo;
		this.usuario = usuario;
	}
	
	/*********** Métodos **********/
	
	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	// Ver saldo:
	public Double verSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	// Depositar dinero:
	public Double depositarDinero(Double deposito){
		if (deposito > 0){
			setSaldo(saldo + deposito);
		}else{
			return;
			// devolver ERROR.
		}
	}
	
	// Verificar saldo:
	public boolean tieneSaldo(Double monto){
		return saldo >= monto;
	}
	
	// Retirar dinero:
	public Double retirarDinero(Double retiro){
		if (tieneSaldo(retiro)){
			setSaldo(saldo - retiro);
		}else{
			System.out.println("No hay saldo suficiente para realizar la extracción");
		}
		return saldo;
	}
	
	// Sobrescritura del método toString:
	@Override
	public String toString() {
		return "Cuenta #" + cuenta + "\nNIP: " + nip + "\nSaldo: " + saldo + "\nUsuario: " + usuario
				+ "]";
	}
	
	/* Tengo que revisar bien esto para entender cómo lo implementa:
	 * 
	 * @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nip == null) ? 0 : nip.hashCode());
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}

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
	 * 
	 */
}

