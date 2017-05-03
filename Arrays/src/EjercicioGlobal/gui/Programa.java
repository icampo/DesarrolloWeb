package EjercicioGlobal.gui;

import java.util.Scanner;

import EjercicioGlobal.datos.Alumno;
import EjercicioGlobal.datos.Asignatura;

public class Programa {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		Alumno alu1;
		Alumno alu2;
		String nomAlu;
		String nomAsig;
		Double notaAsig;
		
		// Crear consola
		
		Scanner sc=new Scanner(System.in);
		
		// Pedir nombre del alumno
		
				System.out.print("Introduce el nombre del alumno: ");
				nomAlu=sc.nextLine();
					
		// crear un alumno
					
				alu1=new Alumno(nomAlu);
				// alu2=new Alumno(nomAlu);
				/* Así se comparan los objetos
				System.out.println(alu1==alu2);
				alu2=alu1;
				System.out.print(alu1.equals(alu2));
				*/
		// Mientras no deje vacio el nombre de la asignatura pedir asignaturas
		
		do{
	
			// Solicitar nombre de la asignatura
			
			System.out.print("Introduce el nombre de la asignatura: ");
			nomAsig=sc.nextLine();
			
			if(!nomAsig.equals("")){
			
				// Pido la nota 
				
				System.out.print("Introduce la nota de la asignatura: ");
				notaAsig=sc.nextDouble();
				
				// Saltar fin de linea
				
				sc.nextLine();
				
				// Crear la asignatura
			
				// Asignatura asig=new Asignatura(nomAsig);
				// asig.setNota(notaAsig);
		
				// Añadir la asignatura al alumno
			
				// alu1.addAsig(asig);
				
				// Añadir a la asignatura la nota
				
				alu1.addAssig(nomAsig, notaAsig);
				
			}
			
		}	
		while(!nomAsig.equals(""));
		
		// Mostrar resultado del expediente Juan[ln:4,prog:5,ddbb:1]
		
		for(int i = 0;i < 40;i++){
			System.out.print("-");
		}
		
		System.out.println("");
		System.out.println(alu1);
		System.out.println("Nota Media: "+alu1.getMedia());
		System.out.println("Nota Maxima: "+alu1.getMax());
		
	}

}
