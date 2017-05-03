package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Declaramos las variables
		
		double varNota;
		double total=0;
		double media=0;
		int contador=0;
		
		// Creamos consola para introducir los datos
		
		Scanner sc=new Scanner(System.in);
		
		// Creamos la condicion
		
		do{
			
			// Introducimos la nota
			
			System.out.print("Introduce la nota: ");
			varNota=sc.nextDouble();
			
			// Creamos una condicion para que no nos cuente los numeros menores que 0 y mayores 10
			
			if(varNota>=0 && varNota<=10 ){
				
			total=total+varNota;
			contador++;
			
			}
			
		}while(varNota>=0);
		
		// Creamos la media
		
		if(contador>0){
		
		media=total/contador;
		
		// Mostramos si ha aprobado o no
		
		if(media<5){
			System.out.println("Tienes un INSUFICIENTE("+media+")");
		}
		else if(media<6){
			System.out.println("Tienes un SUFICIENTE("+media+")");
		}
		else if(media<7){
			System.out.println("Tienes un BIEN("+media+")");
		}
		else if(media<9){
			System.out.println("Tienes un NOTABLE("+media+")");
		}
		else if(media<10){
			System.out.println("Tienes una SOBRESALIENTE("+media+")");
		}
		else{
			System.out.println("Tienes una MATRICULA DE HONOR("+media+")");
		}
		}
	}
}

