package model;

import java.util.ArrayList;
import java.util.List;

public class Registrador {
	private List<Persona> persona;
	private List<Banco> banco;
	private List<Cuenta> cuenta;
	
	public Registrador() {
		persona= new ArrayList<Persona>();
		banco=new ArrayList<Banco>();
		cuenta=new ArrayList<Cuenta>();
	}
	
	public String agregarPersona(String nombre, String apellido, String profesion, int edad, String id) {
		Persona auxPersona=new Persona(nombre, apellido,profesion,edad,id);
		String mensaje="";
		if(persona.isEmpty()) {
			persona.add(auxPersona);
			mensaje="La persona "+nombre+" con # de identificacion "+id+" fue agregado correctamente";
		}
		else {
			boolean continuar=true;
			for(int i=0;i<persona.size()&&continuar;i++) {
				if(persona.get(i).getId().equalsIgnoreCase(id)) {
					continuar=false;
					mensaje="No se agrego a la persona, su ID ya esta registrada";
				}
			}
			if(continuar) {
				persona.add(auxPersona);
				mensaje="La persona "+nombre+" con # de identificacion "+id+" fue agregado correctamente";
			}
		}
		
		return mensaje;
	}
	
	public String abrirBanco(String id, String nombre, double montoMax, double montoMin, double cobroT, double interesA) {
		String mensaje="";
		Banco auxBanco= new Banco(id,nombre,montoMax,montoMin,cobroT,interesA);
		if(banco.isEmpty()) {
			banco.add(auxBanco);
			mensaje="El banco "+nombre+" se abrio con exito.";
		}
		else {
			boolean continuar=true;
			for(int i=0;i<banco.size()&&continuar;i++) {
				if(banco.get(i).getId().equalsIgnoreCase(id)||banco.get(i).getNombre().equalsIgnoreCase(nombre)) {
					continuar=false;
					mensaje="No se abrio el banco. El nombre o ID esta en uso.";
				}
			}
			if(continuar) {
				banco.add(auxBanco);
				mensaje="El banco "+nombre+" se abrio con exito.";
			}
		}
		
		return mensaje;
	}
	
	public String cerrarBanco(String bankName) {
		String mensaje="";
		Banco tempBank=buscarBanco(bankName);
		if(tempBank==null) {
			
		}
		else {
			
		}
		return mensaje;
	}
	
	public Banco buscarBanco(String bankName) {
		Banco auxBank=null;
		boolean find=false;
		for(int i=0;i<banco.size()&&!find;i++) {
			if(banco.get(i).getNombre().equalsIgnoreCase(bankName)) {
				auxBank=banco.get(i);
				find=true;
			}
		}
		return auxBank;
	}
	
}
