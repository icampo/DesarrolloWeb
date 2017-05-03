package bikini.gui;

import java.io.IOException;
import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import ToDo.model.GestorTareas;
import bikini.model.Entrena;
import bikini.model.gestorEntrena;

public class Programa {
		
		private static int OPCION_SALIR=6;
		private static gestorEntrena ge=new gestorEntrena();
		private static Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) {
			
			// Declaramos las opciones para los cases
			
			int opcion=0;
			
			// Menu Principal
			
			do{
				// Mostrar menu
				mostrarMenu();
				//Leeropcion
				opcion=leerOpcion();
				// Ejecutar Opcion
				ejecutarOpcion(opcion);
			}while(opcion!=OPCION_SALIR);
		}
		
		// Metodo para mostrar opcion
		
		public static void mostrarMenu(){
			
			System.out.println("***** I.E.S Zubiri-Manteo *****");
			System.out.println("--------------------------------");
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("");
			System.out.println("1.- Nuevo");
			System.out.println("2.- Eliminar");
			System.out.println("3.- Modificar");
			System.out.println("4.- Listar");
			System.out.println("5.- Totales");
			System.out.println("6.- Salir");
			System.out.println("");
			System.out.print("Opcion: ");
		
		}
		
		// Metodo para leer la opcion introducida
		
		private static int leerOpcion() {
			try{
			int opc=sc.nextInt();
			sc.nextLine();
			return opc;
			}catch(InputMismatchException IM){
				System.out.println("");
				System.out.println("La opción ha de ser númerica");
				// Para saltar lo escrito anteriormente
				sc.nextLine();
				pulseIntro();
				return 0;
			}
		
		}
		
		// Metodo para pulsar el intro
		
		private static void pulseIntro(){
			System.out.println("Pulse Intro para continuar...");
			// Esperar a que se pulse intro
			sc.nextLine();
		}
		
		private static void ejecutarOpcion(int opc){
			
			switch(opc){
			
				// Añadir Tarea
		
				case 1:	
					addEntrena();
					break;
			
				// eliminar los entrenamientos
					
				case 2:
					delEntrena();
					break;
					
				// Modificar los entrenamientos
					
				case 3:
					modEntrena();
					break;
					
				// Mostrar los entrenamientos
					
				case 4:
					lstEntrena();
					break;
					
				// Mostrar los datos de los entrenamientos
					
				case 5:
					TlEntrena();
					break;
				
				// Salir del programa
					
				case 6:
					System.out.println("Cerrando Sesion...");
					break;
					
				default:
					System.out.println("La opción tiene que ser entre 1 o 6");
					System.out.println("");
					break;
			}
	}
		
		// Creamos el metodo de añadir datos
		
		private static void addEntrena(){
		try {
			ge.addEntrena(pideDatoslf());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}
		
		// Metodo para pedir los datos
		
		private static Entrena pideDatoslf(){
			Entrena e = new Entrena();
			return e;
		}
		
}
