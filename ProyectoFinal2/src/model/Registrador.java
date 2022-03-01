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
			mensaje="No se puede borrar, no hay bancos existentes.";
		}
		else {
			boolean cuentas=false;
			for(int i=0;i<cuenta.size()&&!cuentas;i++) {
				if(cuenta.get(i).getNombre().equalsIgnoreCase(bankName)) {
					cuentas=false;
				}
			}
			if(!cuentas) {
				banco.remove(tempBank);
				mensaje="El banco fue eliminado con exito.";
			}
			else {
				mensaje="No se puede borrar, el banco tiene cuentas existentes.";
			}
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
	
	public Persona buscarPersona(String id) {
		Persona auxPerson=null;
		boolean find=false;
		for(int i=0;i<persona.size()&&!find;i++) {
			if(persona.get(i).getId().equalsIgnoreCase(id)) {
				auxPerson=persona.get(i);
				find=true;
			}
		}
		return auxPerson;
	}
	
	public Cuenta buscarCuenta(String numeroCuenta) {
		Cuenta auxCuenta=null;
		boolean find=false;
		for(int i=0;i<cuenta.size()&&!find;i++) {
			if(cuenta.get(i).getNumCuenta().equalsIgnoreCase(numeroCuenta)) {
				auxCuenta=cuenta.get(i);
				find=true;
			}
		}
		return auxCuenta;
	}
	
	public String abrirCuenta(String bankName, String numCuenta,String idP, String tipoC, double saldoI,String fecha) {
		String mensaje="";
		Banco tempBank=buscarBanco(bankName);
		Persona tempPerson=buscarPersona(idP);
		Cuenta tempCuenta=buscarCuenta(numCuenta);
		
		if(tempBank==null||tempPerson==null) {
			mensaje="No se puede abrir la cuenta. Revise si el banco o la persona existen. ";
		}
		else if(tempPerson.getEdad()<18) {
			mensaje="No se puede abrir la cuenta. El propietario es menor de edad.";
		}
		else {
			Cuenta auxCuenta= new Cuenta(tempBank,numCuenta,fecha,tempPerson, tipoC, saldoI); 
			if(tempCuenta==null) {
				cuenta.add(auxCuenta);
				mensaje="";
			}
		}
		return mensaje;
	}
	
}
