         package EjerciciosNotas.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Declarar variables
		
		double varNota;
		double notaAprobado;
		double notaSuspendido;
		double media;
		double mediaNota = 0;
		int i=0;
		int a=0;
		int s=0;
		
		// Declarar para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Crear condicion
		
		do{
			
		// Mostrar menu para introduccion de notas
			
			System.out.println("***Notas del Alumnado***");
			System.out.println("");
			System.out.print("Introduce la nota: ");
			
			// Calculo de la media
			
			varNota=sc.nextDouble();
			
			if(varNota>=0 && varNota<=10){
			
			if(varNota>=5){
				notaAprobado=a;
				a++;
			}
			if(varNota<5){
				notaSuspendido=s;
				s++;
			}
			
			i++;
			
			mediaNota=mediaNota+varNota;
			media=mediaNota/i;
			
			System.out.println("");
			System.out.println("Aprobados y Suspendidos:");
			System.out.println("");
			System.out.println("Aprobados "+a);
			System.out.println("Suspendidos "+s);
			
			// Mostrar media
			
			System.out.println("");
			System.out.println("Media del alumnado: " +media);
			System.out.println("");
			}
			else{
				System.out.println("");
				System.out.println("Nota incorrecta");
				System.out.println("");
			}
				
		}while(varNota>0);
		System.out.println("El valor introducido es negativo");
		
	}

}
