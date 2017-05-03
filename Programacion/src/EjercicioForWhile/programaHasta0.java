package EjercicioForWhile;

import java.util.Scanner;

public class programaHasta0 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Declaramos variables
		
		int num;
		int sum=0;
		int i=0;
		
		// Declaramos consola
		
		Scanner sc=new Scanner(System.in);
		
		// Creamos condicion
		
		do{
			System.out.print("Introduce el numero: ");
			num=sc.nextInt();
			sum=sum+num;
			i++;
		}while(num!=0);
		
		System.out.print("La suma total es " +sum);
		System.out.print(" y la cantidad de numeros introducidos han sido "+(i-1)+".");
		
	}

}
