package model;

import java.util.ArrayList;
import java.util.List;

public class Cuenta extends Banco {
	
	public int CURRENTYEAR;
	public String numCuenta;
	public String fecha;
	private Persona propietario;
	private String tipoCuenta;
	private double saldo;
	private List<Transaccion> operacion;
	
	public Cuenta(Banco banco,String numCuenta, String fecha, Persona propietario, String tipoCuenta, double saldo) {
		super(banco.getId(), banco.getNombre(), banco.getMontoMax(), banco.getMontoMin(), banco.getCobroT(), banco.getInteresA());
		this.numCuenta = numCuenta;
		this.fecha = fecha;
		this.propietario = propietario;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
		CURRENTYEAR=2022;
		operacion=new ArrayList<Transaccion>();
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public void agregarOperacion(Transaccion operacionT) {
		operacion.add(operacionT);
	}
	
	public int getYear() {
		String [] parte=fecha.split("\\/");
		int year=Integer.parseInt(parte[2]);
		return year;
	}
	
	public String[] getFechaPartes() {
		String [] parte=fecha.split("\\/");
		return parte;
	}
	
	public String getFechaA() {
		int year=CURRENTYEAR-getYear();
		return year+" años";
	}
	
	public double getSaldoPosRetiro(Transaccion nuevaOperacion) {
		double saldoTotal=saldo-nuevaOperacion.calcularRetiro(this);
		return saldoTotal;
	}
	
	public Persona getPropietario() {
		return propietario;
	}
	
	public void setPropietario(Persona propietario) {
		this.propietario=propietario;
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
	
	public void actualizarSaldoDeposito(Transaccion operacionT) {
		saldo+=operacionT.calcularDeposito(this);
	}
	
	public void actualizarSaldoRetiro(Transaccion operacionT) {
		saldo+=operacionT.calcularRetiro(this);
	}
	
	public String toString() {
		return "La cuenta "+numCuenta+" Con saldo "+saldo+"$ hace "+getFechaA()+" años\n";
	}

}
