package ProgramaCuadrados;

import java.util.Scanner;

public class DibujaCuadrados {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		int numero;
		int lineas;
		int filas;
		String car="*";
		
		// Declarar consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir cuadrados en consola
		
		System.out.print("Introduce los cuadros totales: ");
		numero=sc.nextInt();
		
		// Iniciar Metodo
		
		for (lineas=1 ;lineas<=numero;lineas++){
			
			for(filas=1; filas<=numero;filas++)
			{
			System.out.print(car);
			}
			System.out.print("\n");
			}

	}
}