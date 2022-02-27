package model;

public class Banco {
	private String id;
	public String nombre;
	public double montoMax;
	public double montoMin;
	public double cobroT;
	public double interesA;
	
	public Banco(String id, String nombre, double montoMax, double montoMin, double cobroT, double interesA) {
		this.id = id;
		this.nombre = nombre;
		this.montoMax = montoMax;
		this.montoMin = montoMin;
		this.cobroT = cobroT;
		this.interesA = interesA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMontoMax() {
		return montoMax;
	}

	public void setMontoMax(double montoMax) {
		this.montoMax = montoMax;
	}

	public double getMontoMin() {
		return montoMin;
	}

	public void setMontoMin(double montoMin) {
		this.montoMin = montoMin;
	}

	public double getCobroT() {
		return cobroT;
	}

	public void setCobroT(double cobroT) {
		this.cobroT = cobroT;
	}

	public double getInteresA() {
		return interesA;
	}

	public void setInteresA(double interesA) {
		this.interesA = interesA;
	}
	
	
}
