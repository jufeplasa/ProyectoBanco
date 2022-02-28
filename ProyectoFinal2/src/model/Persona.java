package model;

public class Persona {
	public String nombre;
	public String apellido;
	public String profesion;
	public int edad;
	private String id;
	private Cuenta[] cuenta;
	public Persona(String nombre, String apellido, String profesion, int edad, String id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		this.edad = edad;
		this.id = id;
		cuenta= new Cuenta[7];
	}
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
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Cuenta[] getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta[] cuenta) {
		this.cuenta = cuenta;
	}
}
