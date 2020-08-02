package cliente;

public class Usuario {
	
	// VARIABLES	
	private String nombre;
	private String apellido;
	
		
	// CONSTRUCTOR POR DEFECTO
	public Usuario() {	
	}
	
	// CONSTRUCTOR
	public Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// GETTERS Y SETTERS
	
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
	
	// TOSTRING
	@Override
	public String toString() {
		return "Cliente: " + nombre + " " + apellido;
	}
		
}
