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
}
