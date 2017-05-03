package EjercicioForWhile;

import java.util.Scanner;

public class programaWhile {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
				// Declaramos las variables
				
				int num;
				int suma=0;
				int i=0;
				
				// Declaramos la consola
				
				Scanner sc=new Scanner(System.in);
				
				// Creamos condicion
				
				do{
					System.out.print("Introduce el numero: ");
					num=sc.nextInt();
					suma=suma+num;
					i++;
				}while(i<4);
				
				System.out.print("La suma total es " +suma);
				
	}

}
