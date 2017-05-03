package Prueba2.gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import Prueba2.model.Alumno;
import Prueba2.model.GestorAlumnos;
import Prueba2.model.GestorProfesores;
import Prueba2.model.Persona;
import Prueba2.model.Profesor;

public class Programa {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		GestorAlumnos ga=new GestorAlumnos();
		GestorProfesores gp=new GestorProfesores();
		
		int opcion;
		char conf;
		String nombre;
		double nota;
		double salario;
		int index;
		boolean salir=false;
		
		// Mostrar texto del programa
		
		while(!salir){
			
			System.out.println("***** I.E.S Zubiri-Manteo *****");
			System.out.println("--------------------------------");
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("");
			System.out.println("1.- Añadir Alumnos");
			System.out.println("2.- Modificar Alumnos");
			System.out.println("3.- Borrar Alumnos");
			System.out.println("4.- Buscar Alumnos");
			System.out.println("5.- Listar Alumnos");
			System.out.println("6.- Añadir Profesor");
			System.out.println("7.- Modificar Profesor");
			System.out.println("8.- Borrar Profesor");
			System.out.println("9.- Buscar Profesor");
			System.out.println("10.- Listar Profesor");
			System.out.println("11.- Salir");
			System.out.println("");
			System.out.print("Opcion: ");
			
			try{
				opcion=sc.nextInt();
				sc.nextLine();
				System.out.println("");
			}catch
				(InputMismatchException IE){
				opcion=0;
				sc.nextLine();
				System.out.println("");
			}
			
			Alumno a=null;
			Profesor p=null;
			
			switch(opcion){
			
			// Añadir alumnos
			
			case 1:
				
				System.out.println("Introduce el nombre del nuevo Alumno:");
				nombre=sc.next();
				
				System.out.println("Introduce la nota del nuevo Alumno:");
				nota=sc.nextDouble();
				
				a=new Alumno(nombre,nota);
				ga.addAlumno(a);
				ga.guardarListado();
				
				break;
			
			// Modificar Alumnos
				
			case 2:
				
				System.out.println("Introduce el indice del Alumno: ");
				index=sc.nextInt();
				
				System.out.println("Introduce el nombre del nuevo Alumno:");
				nombre=sc.next();
				
				System.out.println("Introduce la nota del nuevo Alumno:");
				nota=sc.nextDouble();
				
				a=new Alumno(nombre,nota);
				ga.modAlumno(index, a);
				ga.guardarListado();
				
				break;
				
			// Eliminar Alumnos
				
			case 3:
				
				try{
				System.out.print("Introduce el indice del Alumno a eliminar: ");
				index=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Seguro que deseas eliminar el usuario?");
				conf=sc.nextLine().toUpperCase().charAt(0);
				
				if(conf=='S'){
					
					System.out.println("");
					System.out.println("Eliminando Alumno...");
					System.out.println("");
					ga.delAlumno(index);
					ga.guardarListado();
					
				}
				else{
					System.out.print("Cancelando proceso de eliminación de Alumno...");
					System.out.println("");
				}
				}catch(StringIndexOutOfBoundsException ex){
					System.out.println("No existe el indice de dicho Alumno");
					System.out.println("");
				}catch(IndexOutOfBoundsException be){
					System.out.println("No existe el indice de dicho Alumno");
					System.out.println("");
				}
				
				break;
			
			// Buscar Alumnos
			
			case 4: 
			
				try{
				System.out.println("Introduce el indice del Alumno a mostrar: ");
				System.out.println("");
				index=sc.nextInt();
				sc.nextLine();
				System.out.println("");
				
				ga.leerListado();
				
				System.out.println(ga.getAlumno(index));
				System.out.println("");
				}catch(java.util.InputMismatchException im){
					System.out.println("");
					System.out.println("Introduce un valor númerico para el indice");
					System.out.println("");
					sc.nextLine();
				}catch(java.lang.IndexOutOfBoundsException ib){
					System.out.println("Indice no existente");
					System.out.println("");
				}
				
				break;
			
			// Leer listado de alumnos
				
			case 5:
				
				ga.leerListado();
				
				if(ga.getSize()>0){
				
				for(int i=0;i < ga.getSize();i++){
					System.out.println("Indice "+i+" | "+ga.getAlumno(i));
					System.out.println("");
				}
				}else{
					System.out.println("No hay ningún Alumno registrado");
					System.out.println("");
				}
				break;
			
			// Crear Profesor	
			
			case 6:
				
				System.out.println("Introduce el nombre del nuevo Profesor:");
				nombre=sc.next();
				
				System.out.println("Introduce el salario del nuevo Profesor:");
				salario=sc.nextDouble();
				
				p=new Profesor(nombre,salario);
				gp.addProfesor(p);
				gp.guardarListado();
				
				break;
			
			// Modificar Profesores
				
			case 7:
				
				System.out.println("Introduce el indice del Profesor: ");
				index=sc.nextInt();
				
				System.out.println("Introduce el nombre del nuevo Profesor:");
				nombre=sc.next();
				
				System.out.println("Introduce el salario del nuevo Profesor:");
				salario=sc.nextDouble();
				
				System.out.println("");
				
				p=new Profesor(nombre,salario);
				gp.modProfesor(index, p);
				gp.guardarListado();
				
				break;
			
			// Eliminar Profesores
				
			case 8:
				
				try{
				System.out.print("Introduce el indice del Alumno a eliminar: ");
				index=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Seguro que deseas eliminar el usuario?");
				conf=sc.nextLine().toUpperCase().charAt(0);
				
				if(conf=='S'){
					
					System.out.println("");
					System.out.println("Eliminando Profesor...");
					System.out.println("");
					gp.delProfesor(index);
					gp.guardarListado();
					
				}
				else{
					System.out.print("Cancelando proceso de eliminación de Profesor...");
					System.out.println("");
				}
				}catch(StringIndexOutOfBoundsException ex){
					System.out.println("No existe el indice de dicho Profesor");
					System.out.println("");
				}catch(IndexOutOfBoundsException be){
					System.out.println("No existe el indice de dicho Profesor");
					System.out.println("");
				}
				
				break;
			
			// Buscar Profesores
				
			case 9: 
				
				try{
				System.out.println("Introduce el indice del Profesor a mostrar: ");
				System.out.println("");
				index=sc.nextInt();
				sc.nextLine();
				
				gp.leerListado();
				
				System.out.println("");
				System.out.println(gp.getProfesor(index));
				System.out.println("");
				}catch(java.util.InputMismatchException im){
					System.out.println("");
					System.out.println("Introduce un valor númerico para el indice");
					System.out.println("");
					sc.nextLine();
				}catch(java.lang.IndexOutOfBoundsException ib){
					System.out.println("");
					System.out.println("Indice no existente");
					System.out.println("");
				}
			
				break;
			
			// Leer listado de profesores
				
			case 10:
				
				gp.leerListado();
				
				if(gp.getSize()>0){
				
				for(int i=0;i < gp.getSize();i++){
					System.out.println("Indice "+i+" | "+gp.getProfesor(i));
					System.out.println("");
				}
				}else{
					System.out.println("No hay ningún Profesor registrado");
					System.out.println("");
				}
				break;
				
			case 11:
				
				System.out.println("Saliendo de la sesion actual...");
				System.out.println("Sesión Terminada");
				System.out.println("");
				salir=true;
				break;
			
			default:
				
				System.out.println("Opción no valida");
				System.out.println("");
				break;
			}
			
		}
	}

}
