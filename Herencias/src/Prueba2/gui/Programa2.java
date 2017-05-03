package Prueba2.gui;

import java.util.Scanner;

import Prueba2.model.Alumno;
import Prueba2.model.GestorAlumnos;

public class Programa2 {
	
	private static GestorAlumnos ga=new GestorAlumnos();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int opc=0;
		
		ga.leerListado();
		
		do{
			mostrarMenu();
			//Leeropcion
			opc=sc.nextInt();
			sc.nextLine();
			// Ejecutar Opcion
			ejecutarOpcion(opc);
		}while(opc!=6);
		System.out.println("Cerrando Sesion...");
	}
	
	public static void mostrarMenu(){
		
		System.out.println("***** I.E.S Zubiri-Manteo *****");
		System.out.println("--------------------------------");
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("");
		System.out.println("1.- Añadir Alumnos");
		System.out.println("2.- Modificar Alumnos");
		System.out.println("3.- Borrar Alumnos");
		System.out.println("4.- Buscar Alumnos");
		System.out.println("5.- Listar Alumnos");
		System.out.println("6.- Salir");
		System.out.println("");
		System.out.print("Opcion: ");
		
		
	}
	
	public static void ejecutarOpcion(int opc){
		
		switch(opc){
		
		// Añadir alumnos
	
			case 1:	
				addAlumno();
				break;
				
			case 2:
				modAlumno();
				break;
				
			// Eliminar Alumnos
				
			case 3:
				delAlumno();
				break;
			
			// Buscar Alumnos
			
			case 4: 
				srcAlumno();
				break;
			
			// Leer listado de alumnos
				
			case 5:
				System.out.println("");
				lstAlumno();
				break;
		
		}
		
	}
		private static void addAlumno(){
			
		Alumno al=pideDatosAlumno();
		ga.addAlumno(al);
		ga.guardarListado();
		
	}
		
		private static void modAlumno(){
		
			System.out.println("Introduce el indice del Alumno: ");
			int index=sc.nextInt();
			
			Alumno al=pideDatosAlumno();
			ga.modAlumno(index,al);
			ga.guardarListado();
		}
		
		private static void delAlumno(){
			try{
				int index=pideIndice();
				
				System.out.print("Seguro que deseas eliminar el usuario?");
				char conf=sc.nextLine().toUpperCase().charAt(0);
				
				if(conf=='S'){
					
					System.out.println("");
					System.out.println("Eliminando Alumno...");
					System.out.println("");
					ga.delAlumno(index);
					ga.guardarListado();
					
				}
				else{
					System.out.println("");
					System.out.print("Cancelando proceso de eliminación de Alumno...");
					System.out.println("");
				}
				}catch(StringIndexOutOfBoundsException ex){
					System.out.println("");
					System.out.println("No existe el indice de dicho Alumno");
					System.out.println("");
				}catch(IndexOutOfBoundsException be){
					System.out.println("");
					System.out.println("No existe el indice de dicho Alumno");
					System.out.println("");
				}
		}
		
		private static void srcAlumno(){
				System.out.println("");
				System.out.print("Introduce el indice del Alumno a mostrar: ");
				String nombre=sc.nextLine();
			
				Alumno al=ga.getAlumno(nombre);
				
				System.out.println("");
				System.out.println(al);
				System.out.println("");
	
		}
		
		private static void lstAlumno(){
			ga.leerListado();
			
			if(ga.getSize()>0){
			
			for(int i=0;i < ga.getSize();i++){
				System.out.println("Indice "+i+" | "+ga.getAlumno(i));
				System.out.println("");
			}
			}else{
				System.out.println("");
				System.out.println("No hay ningún Alumno registrado");
				System.out.println("");
			}
		}
		
		private static Alumno pideDatosAlumno(){
			
			System.out.println("Introduce el nombre del nuevo Alumno:");
			String nombre=sc.next();
					
			System.out.println("Introduce la nota del nuevo Alumno:");
			double nota=sc.nextDouble();
			
			System.out.println("");
			System.out.println("Creando usuario nuevo...");
			System.out.println("");
					
			Alumno al=new Alumno(nombre,nota);
			
			return al;
		}
		
		private static int pideIndice(){
			System.out.print("Indice: ");
			int index=sc.nextInt();
			sc.nextLine();
			return index;
		}
		
}
