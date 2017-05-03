package EjercicioForWhile;

import java.util.Scanner;

public class programaFor {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables
		
		int num;
		int suma=0;
		
		// Declaramos la consola
		
		Scanner sc=new Scanner(System.in);
		
		// Creamos condicion
		
		for( int i=0; i<4;i++){
			System.out.print("Introduce el numero: ");
			num=sc.nextInt();
			suma=suma+num;
		}
		
		System.out.print("La suma total es " +suma);
		
	}

}
