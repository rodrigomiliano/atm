package cliente;

public class Usuario {
	
	/********** Variables **********/
	
	private String nombre;
	private String apellido;
	
	/********** Constructores **********/
	
	// Constructor por defecto:
	public Usuario() {
	
	}
	
	// Constructor:
	public Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/********** Métodos **********/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	
	// Sobrescritura del método toString:
	@Override
	public String toString() {
		return "Cliente: " + nombre + " " + apellido;
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	*/

}
