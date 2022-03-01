package model;

public class Cuenta extends Banco {
	public String numCuenta;
	public String fecha;
	private Persona propietario;
	private String tipoCuenta;
	private double saldo;
	public Cuenta(Banco banco,String numCuenta, String fecha, Persona propietario, String tipoCuenta, double saldo) {
		super(banco.getId(), banco.getNombre(), banco.getMontoMax(), banco.getMontoMin(), banco.getCobroT(), banco.getInteresA());
		this.numCuenta = numCuenta;
		this.fecha = fecha;
		this.propietario = propietario;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getFecha() {
		return fecha;
	}
	
	public String getIdPropietario() {
		return propietario.getId();
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
