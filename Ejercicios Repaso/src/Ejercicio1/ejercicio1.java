package Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
	
		// Declaramos las variables
		
		int random=0;
		int numero=0;
		
		// Creamos la consola 
		
		Scanner sc = new Scanner(System.in);
		
		// creamos el numero aleatorio
		
		random= (int) (Math.random()*100 + 1);
		
		// Alerta de numero generado
		
		System.out.print("Se ha generado un número aletatorio entero "
						 + "entre 1 y 100, intente adivinarlo: ");
			
		// Introduccion del valor

		while(random != (numero = sc.nextInt())){
			if(numero < random)
				System.out.print("No has acertado: el número es mayor. Prueba otra vez: ");
			else
				System.out.print("No has acertado: el número es menor. Prueba otra vez: ");
		}

		System.out.println("Lo has adivinado Crack!!!");
		
	}

}
