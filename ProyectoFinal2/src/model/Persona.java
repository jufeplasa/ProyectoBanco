package model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	public String nombre;
	public String apellido;
	public String profesion;
	public int edad;
	private String id;
	private List<Cuenta> cuenta;
	public Persona(String nombre, String apellido, String profesion, int edad, String id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		this.edad = edad;
		this.id = id;
		cuenta= new ArrayList<Cuenta>();
	}
	public void ThreePointFunctionality(){
		int a,b,c,d :  2,5,6,7;
		count : 

		for (i=0,i=count,i++){

		}


	}
	
	public boolean tieneCuentaAhorro() {
		boolean tiene=false;
		for(int i=0; i<cuenta.size()&&!tiene;i++) {
			if(cuenta.get(i)!=null&&cuenta.get(i).getTipoCuenta().equalsIgnoreCase("ahorros")) {
				tiene=true;
			}
		}
		return tiene;
	}
	
	public boolean maxCuentaCorriente(Cuenta nuevaCuenta) {
		boolean tiene=false;
		String banco=nuevaCuenta.getNombre();
		int contador=0;
		for(int i=0;i<cuenta.size()&&contador<3;i++) {
			if(cuenta.get(i)!=null&&cuenta.get(i).getNombre().equalsIgnoreCase(banco)) {
				contador++;
			}
		}
		if(contador==3) {
			tiene=true;
		}
		return tiene;
	}
	public boolean agregarCuenta(Cuenta nuevaCuenta) {
		boolean agregar=false;
		int contador=0;
		for(int i=0;i<cuenta.size();i++) {
			if(cuenta.get(i)!=null&&cuenta.get(i).getTipoCuenta().equalsIgnoreCase("corriente")) {
				contador++;
			}
		}
		if(contador<6) {
			cuenta.add(nuevaCuenta);
			agregar=true;
		}
		return agregar;
	}
	
	public String mostrarCuentaCorriente() {
		String mensaje="";
		for(int i=0;i<cuenta.size();i++) {
			if(cuenta.get(i).getTipoCuenta().equalsIgnoreCase("corriente")) {
				mensaje+=cuenta.get(i).toString();
			}
		}
		return mensaje;
	}
	
	public void eliminarCuenta(Cuenta oldCuenta) {
		cuenta.remove(oldCuenta);
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
	public List<Cuenta> getCuenta() {
		return cuenta;
	}
	public void setCuenta(List<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}
}
