package Zubiri.gui;

import java.util.Scanner;

import Zubiri.modelo.Alumno;

public class Programa {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		String Nombre;
		String Asignatura;
		double Nota;
		
		Alumno alumno;
		
		// Declarar consola
		
		Scanner sc=new Scanner(System.in);
		
		alumno=new Alumno();
		
		// Pedir los datos al usuario por consola
		
		System.out.print("Nombre: ");
		Nombre=sc.nextLine();
		System.out.print("Asignatura: ");
		Asignatura=sc.nextLine();
		System.out.print("Nota: ");
		Nota=sc.nextDouble();
		
		// Asignarle los datos introducidos por un usuario
		
		alumno.setNombre(Nombre);
		alumno.setAsignatura(Asignatura);
		alumno.setNota(Nota);
		
		// Mostrar resultado
		
		System.out.print(alumno.getNombre()+" has "+alumno.getCalificacion()+" "+alumno.getAsignatura());
		
	}

}
