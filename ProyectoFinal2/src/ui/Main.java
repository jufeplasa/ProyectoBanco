package ui;

import java.util.Scanner;

import model.Registrador;

public class Main {
	private static Scanner sc;
	private static Registrador registrador;
	public static void main(String [] args) {
		sc= new Scanner(System.in);
		registrador=new Registrador();
		boolean exit=false;
		while(!exit) {
			System.out.println("Que operacion desea realizar?");
			System.out.println("1: Registrar una persona");
			System.out.println("2: Abrir un banco");
			System.out.println("3: Eliminar un banco");
			System.out.println("4: Crear una cuenta");
			System.out.println("5: Eliminar Cuenta");
			System.out.println("6: Realizar transaccion");
			System.out.println("7: Salir");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println(ingresoDatosPersona());
				break;
			case 2:
				System.out.println(ingresoDatosBanco());
				break;
			case 3:
				System.out.println(solicitudCerrarBanco());
				break;
			case 4:
				System.out.println(solicitudAbrirCuenta());
				break;
			case 5:
				System.out.println(solicitudCerrarCuenta());
				break;
			case 6:
				System.out.println(iniciarTransaccion());
				break;
			case 7:
				System.out.println("Has salido del programa.");
				exit=true;
				break;
			}
		}
	}

	public static String ingresoDatosPersona() {
		String mensaje="";
		System.out.println("Cual es el nombre de la persona?");
		String nombre=sc.next();
		System.out.println("Cual es el apellido de la persona?");
		String apellido=sc.next();
		System.out.println("Cual es la edad de la persona?");
		int edad=sc.nextInt();
		sc.nextLine();
		System.out.println("Cual es la profesion de la persona?");
		String profesion=sc.next();
		System.out.println("Cual es el numero de identificacion de la persona?");
		String id=sc.next();
		mensaje=registrador.agregarPersona(nombre, apellido, profesion, edad, id);
		return mensaje;
	}

	public static String ingresoDatosBanco() {
		String mensaje="";
		System.out.println("Cual es el nombre del banco?");
		String nombre=sc.next();
		System.out.println("Cual es el numero de banco?");
		String id=sc.next();
		System.out.println("Cual es el monto maximo?");
		double mMax=sc.nextDouble();
		System.out.println("Cual es el monto minimo?");
		double mMin=sc.nextDouble();
		System.out.println("Cual es el cobro por transaccion?");
		double cobro=sc.nextDouble();
		System.out.println("Cual es el interes?");
		double interes=sc.nextDouble();
		mensaje=registrador.abrirBanco(id, nombre, mMax, mMin, cobro, interes);
		return mensaje;
	}

	public static String solicitudCerrarBanco() {
		String mensaje="";
		System.out.println("Introuce el nombre del banco a cerrar");
		String nombreB=sc.next();
		mensaje=registrador.cerrarBanco(nombreB);
		return mensaje;
	}

	public static String solicitudAbrirCuenta() {
		String mensaje="";
		System.out.println("Nombre del banco donde vas a abrir la cuenta");
		String nombreB=sc.next();
		System.out.println("Numero de cuenta");
		String numC=sc.next();
		System.out.println("Numero de identidad del propietario");
		String idPropietario=sc.next();
		System.out.println("Tipo de cuenta (Ahorros, Corriente)");
		String tipoCuenta=sc.next();
		System.out.println("Saldo inicial");
		double saldoI=sc.nextDouble();
		sc.nextLine();
		System.out.println("Fecha de apertura: dd/mm/aa");
		String fecha=sc.next();
		mensaje=registrador.abrirCuenta(nombreB, numC, idPropietario, tipoCuenta, saldoI, fecha);
		return mensaje;
	}

	public static String solicitudCerrarCuenta() {
		System.out.println("Numero de cuenta a eliminar");
		String numCuenta=sc.next();
		String mensaje=registrador.eliminarCuenta(numCuenta);
		return mensaje;
	}

	public static String iniciarTransaccion() {
		String mensaje="";
		System.out.println("Monto que se va a depositar");
		double monto=sc.nextDouble();
		sc.nextLine();
		System.out.println("A que cuenta vas a depositar?");
		String idCuenta=sc.next();
		System.out.println("Que operacion se va ejecutar (1: deposito, 2: retiro)");
		int opcion=sc.nextInt();
		sc.nextLine();
		System.out.println("Fecha de transaccion: dd/mm/aa");
		String fechaT=sc.next();
		System.out.println("Numero de identificacion de la persona que hace la transaccion");
		String idOperario=sc.next();
		if(opcion==1) {
			mensaje=registrador.realizarDeposito(monto, idCuenta, "deposito", fechaT, idOperario);
		}
		else {
			mensaje="";
		}
		return mensaje;
	}
}
