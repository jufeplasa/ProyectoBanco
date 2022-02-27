package model;

public class Cuenta extends Banco {
	public String numCuenta;
	public int fecha;
	private String idPropietario;
	private String tipoCuenta;
	private double saldo;
	public Cuenta(String id, String nombre, double montoMax, double montoMin, double cobroT, double interesA,
			String numCuenta, int fecha, String idPropietario, String tipoCuenta, double saldo) {
		super(id, nombre, montoMax, montoMin, cobroT, interesA);
		this.numCuenta = numCuenta;
		this.fecha = fecha;
		this.idPropietario = idPropietario;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public String getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
