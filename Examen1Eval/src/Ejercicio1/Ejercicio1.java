package Ejercicio1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

				// Declaramos las variables

				int años;
				String varUser;
				int fecha = LocalDateTime.now().getYear();
				
				// Añadimos consola para introducir datos

				Scanner sc = new Scanner(System.in);
				
				// Pedimos que el usuario introduzca los datos
				
				// Edad
				
				System.out.print("Edad: ");
				años=sc.nextInt();
				
				// Nombre
				
				System.out.print("Nombre: ");
				varUser = sc.next();
				
				// Calculo para la fecha de nacimiento

				int nacimiento = fecha-años;
				
				// Mostramos el resultado final

				System.out.print(varUser + " naciste el año "+nacimiento);
				
				
	}

}
