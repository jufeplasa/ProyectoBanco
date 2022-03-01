package model;

public class Transaccion {
	public double transaccion;
	public String tipoOperacion;
	public String destinatario;
	public String fecha;
	public String operador;
	
	public Transaccion(double transaccion, String tipoOperacion, String destinatario, String fecha, String operador) {
		this.transaccion = transaccion;
		this.tipoOperacion = tipoOperacion;
		this.destinatario = destinatario;
		this.fecha = fecha;
		this.operador = operador;
	}
	
	public double getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(double transaccion) {
		this.transaccion = transaccion;
	}
	public String getTipoOperacion() {
		return tipoOperacion;
	}
	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public double calcularDeposito(Cuenta cuenta) {
		double valor=cuenta.getCobroT();
		return valor;
	}
	
	public double calcularRetiro(Cuenta cuenta) {
		double valor=(transaccion*(cuenta.getInteresA()/100))+cuenta.getCobroT();
		return valor;
	}
}
