package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables
		
		int varSemana; 
		
		// Creamos consola para introducir los datos
		
		Scanner sc=new Scanner(System.in);
		
		// Introducimos el dia de la semana
		
		System.out.print("Introduce el numero de la semana: ");
		varSemana=sc.nextInt();
		
		// Creamos la condicion con class
		
		if(varSemana>=8){
			System.out.print("La semana unicamente tiene 7 dias!!!");
		}else{
			switch(varSemana){
			
			case 1:
				System.out.print("Hoy es Lunes");
				break;
				
			case 2:
				System.out.print("Hoy es Martes");
				break;
				
			case 3:
				System.out.print("Hoy es Miercoles");
				break;
				
			case 4:
				System.out.print("Hoy es Jueves");
				break;
				
			case 5:
				System.out.print("Hoy es Viernes");
				break;
				
			case 6:
				System.out.print("Hoy es Sabado");
				break;
				
			case 7:
				System.out.print("Hoy es Domingo");
				break;
				
		}
	}
}
}
