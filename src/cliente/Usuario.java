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

	// GETTER Y SETTER DE NOMBRE	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	// GETTER Y SETTER DE APELLIDO
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// GET NOMBRE COMPLETO
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "Cliente: " + nombre + " " + apellido;
	}
		
}