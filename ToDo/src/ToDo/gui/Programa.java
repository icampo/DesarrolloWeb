package ToDo.gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import ToDo.model.GestorTareas;
import ToDo.model.Tarea;

public class Programa {
	private static int OPCION_SALIR=8;
	private static GestorTareas gt=new GestorTareas();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int opc=0;
		
		do{
			//Mostrar menu
			mostrarMenu();
			//Leeropcion
			opc=leerOpcion();
			// Ejecutar Opcion
			ejecutarOpcion(opc);
		}while(opc!=OPCION_SALIR);
	}	
	
	public static void mostrarMenu(){
		
		System.out.println("***** I.E.S Zubiri-Manteo *****");
		System.out.println("--------------------------------");
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("");
		System.out.println("1.- Añadir Tarea");
		System.out.println("2.- Finalizar Tarea");
		System.out.println("3.- Listar Todas");
		System.out.println("4.- Listar Tareas Realizadas");
		System.out.println("5.- Listar Tareas No Realizadas");
		System.out.println("6.- Leer Fichero");
		System.out.println("7.- Guardar Listado");
		System.out.println("8.- Salir");
		System.out.println("");
		System.out.print("Opcion: ");
	
	}
	
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
	
	private static void pulseIntro(){
		System.out.println("Pulse Intro para continuar...");
		// Esperar a que se pulse intro
		sc.nextLine();
	}
	
	private static void ejecutarOpcion(int opc){
		
		switch(opc){
		
			// Añadir Tarea
	
			case 1:	
				addTarea();
				break;
		
			// Finalizar tarea
				
			case 2:
				finTarea();
				break;
				
			// Mostrar Tareas
			// Mostrar todas las tareas
				
			case 3:
				listarTareas(GestorTareas.LISTAR_TODAS);
				break;
				
			// Mostrar las tareas no realizadas
				
			case 4:
				listarTareas(GestorTareas.LISTAR_REALIZADAS);
				break;
				
			// Mostrar las tareas realizadas
				
			case 5:
				listarTareas(GestorTareas.LISTAR_NO_REALIZADAS);
				break;
			
			// Guardar Listado
				
			case 6:
				gt.leerTareas();
				break;			
				
			// Guardar Listado
				
			case 7:
				gt.guardarTareas();
				break;
				
			// Salir del programa
			
			case 8:
				System.out.println("Cerrando Sesion...");
				break;
				
			default:
				System.out.println("La opción tiene que ser entre 1 o 6");
				System.out.println("");
				break;
		}
}
		
		private static void addTarea(){
			// Pedir al usuario datos de la tarea
			Tarea t=new Tarea(pideTitulo());
			// Pedir al gestor de tareas que añada esta tarea
			gt.addTarea(t);
			System.out.println("");
			System.out.println("Creando tarea nueva...");
			System.out.println("");
		}
		
		private static void finTarea(){
			gt.finTarea(pideTitulo());
			System.out.print("");
		}
		
		private static String pideTitulo(){
			// Pedir tarea
			System.out.println("");
			System.out.println("Titulo: ");
			String titulo=sc.nextLine();
			return titulo;
		}
		
		private static void listarTareas(int listado){
			// Pedir al gestor todas las tareas
			// Recorrer el array de tareas
			Tarea[] lstTareas=gt.getTareas(listado);
			// Imprimir las tareas
			System.out.println("");
			for (int i = 0; i < lstTareas.length; i++) {
				System.out.println(lstTareas[i] + " "); //se muestra cada elemento del array
			}
			System.out.println("");
		}
	
}
