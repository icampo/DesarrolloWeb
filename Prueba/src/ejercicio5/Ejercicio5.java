package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables necesarias
		
		String varGenero;
		String varDia;
		
		// Creamos la consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducimos los metodos
		
		System.out.print("Indica tu genero: ");
		varGenero=sc.nextLine();
		
		switch(varGenero){
		
			case "m":
				varGenero="Se�or";
				break;
			
			case "f":
				varGenero="Se�ora";
				break;
		
		}
		
		System.out.print("Que momento del dia (m-ma�ana / t-tarde / n-noche) es: ");
		varDia=sc.nextLine();
		
		switch(varDia){
		
			case "m":
				varDia="Buenos dias";
				break;
			
			case "t":
				varDia="Buenas tardes";
				break;
			
			case "n":
				varDia="Buenas noches";
				break;
		}
		
		System.out.print(varDia+", "+varGenero+".");
		
	}

}
