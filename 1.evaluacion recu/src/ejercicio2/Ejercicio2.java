package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables
		
		String varColores;
		
		// Creamos la consola
		
		Scanner sc=new Scanner(System.in);

		// Solicita datos
		
		System.out.print("Introduce los colores: ");
		varColores=sc.nextLine();
		
		switch(varColores){
		
		case "Morado":
			System.out.print("San Pedro");
			break;
			
		case "Verde":
			System.out.print("Hondarribia");
			break;
			
		case "Rosa":
			System.out.print("San Juan");
			break;
	
		case "Blanco":
			System.out.print("Donostiarra");
			break;
			
		case "Amarillo":
			System.out.print("Orio");
			break;
			
		case "Azul":
			System.out.print("La Gallega");
			break;
			
		default:
			System.out.print("No existe!!!");
			break;
			
		}
	}

}
