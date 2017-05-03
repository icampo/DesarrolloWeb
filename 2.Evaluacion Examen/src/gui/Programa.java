package gui;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import manager.GestorPlantacion;
import model.Plantacion;

public class Programa  {
	
	private static Scanner sc=new Scanner(System.in);
	private static DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
	private static GestorPlantacion gp=new GestorPlantacion();
	
	private static int opcion = 0;
	private static final int OPCION_SALIDA = 5;
	
	public static void main(String[] args) {
		
		do {
			try {
				mostrarMenu();
				opcion=pedirOpcion();
				ejecutarOpcion(opcion);
			} catch (InputMismatchException e) {
				System.out.println("Introduce un numero entero valido...");
				sc.nextLine();
			} catch (NumberFormatException | ParseException e) {
				System.out.println("Introduce los datos segun el formato indicado...");
			} 
		} while (opcion!=OPCION_SALIDA);
		
	}
	
	private static void mostrarMenu() {
		System.out.println("** GESTIÓN DE PLANTACIONES **");
		System.out.println("1.-Sembrar/Plantar");
		System.out.println("2.-Recolectar");
		System.out.println("3.-Listas");
		System.out.println("4.-Alertas");
		System.out.println("5.-Salir");
		System.out.print("opcion: ");	
	}
	
	private static int pedirOpcion() throws InputMismatchException{
		int opc=sc.nextInt();
		sc.nextLine();
		return opc;
	}
	
	private static void ejecutarOpcion(int opcion) throws NumberFormatException, InputMismatchException, ParseException, IndexOutOfBoundsException {
		switch (opcion) {
		case 1:
			plantar();
			break;
		case 2:
			recolectar();
			break;
		case 3:
			mostrarTotales();
			break;
		case 4:
			mostrarAlertas();
			break;
		case 5:
			salir();
			break;
		default:
			System.out.println("Introduce un numero valido (1-5)");
			break;
		}
	}
	
	private static void plantar() throws NumberFormatException, InputMismatchException, ParseException{
		Plantacion p=pedirDatos();
		gp.plantar(p);
	}
	
	private static void recolectar(){
		
	}
	
	private static void mostrarAlertas(){
	
	}
	
	private static void mostrarTotales() {
		System.out.println("Plantaciones: "+gp.getPlantaciones());
	}
	
	private static Plantacion pedirDatos() throws NumberFormatException, ParseException, InputMismatchException{
		Plantacion plantacion = pedirDatosP();
		System.out.print("Fecha Recogida: ");
		String fechaRec=sc.next();
		System.out.print("Especie: ");
		plantacion.setEspecie(sc.next());
		System.out.print("Cantidad Plantada: ");
		plantacion.setCantPlant(sc.nextInt());
		return plantacion;
	}
	
	private static Plantacion pedirDatosP() throws NumberFormatException, ParseException{
		System.out.print("Introduce la Parcela: ");
		int parcela=sc.nextInt();
		System.out.print("Introduce la fecha de plantacion: ");
		String fechaPlan=sc.next();
		System.out.print("Introduce la cantidad recogida: ");
		int cantRec=sc.nextInt();
		return new Plantacion();
	}
	
	private static void salir(){
		System.out.print("Cerrando sesion...");
	}
	
}
