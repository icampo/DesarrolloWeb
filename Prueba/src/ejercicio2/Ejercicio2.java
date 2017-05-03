package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Declaramos las variables
		
		int varNum;
		
		// Creamos una consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducimos los datos del usuario
		
		System.out.print("Introduce un numero: ");
		varNum=sc.nextInt();
		
		// Creamos el metodo
		
		for(int i=1;i<=varNum;i++){
			System.out.print(i+" ");
		}
		
	}

}
