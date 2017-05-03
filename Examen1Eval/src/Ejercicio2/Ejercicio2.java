package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables

				String varAsignatura;
				// String txtAsig
				// String codAsig
		
		// Añadimos consola para introducir datos

				Scanner sc = new Scanner(System.in);
				
		// Introducimos la abreviatura de la asignatura

				System.out.print("Codigo: ");
				varAsignatura = sc.nextLine();
				
		// Creamos el metodo para indicar que asignatura es

				if(varAsignatura.equals("PR")){
					System.out.print("Asignatura: Programación");
				}
				
				else if(varAsignatura.equals("ED")){
					System.out.print("Asignatura: Entornos de Desarrollo");
				}
				
				else if(varAsignatura.equals("BD")){
					System.out.print("Asignatura: Bases de Datos");
				}
				
				else if(varAsignatura.equals("LM")){
					System.out.print("Asignatura: Lenguaje de Marcas");
				}
				
				else if(varAsignatura.equals("SI")){
					System.out.print("Asignatura: Sistemas Operativos");
				}
				
				// Método Switch
				
				/*switch(codAsig){
				 * case "PR": txtAsig="Programacion";
				 * break;
				 * * case "ED": txtAsig="Entornos de desarrollo";
				 * break;
				 * * case "BD": txtAsig="Bases de Datos";
				 * break;
				 * * case "LM": txtAsig="Lenguaje de Marcas";
				 * break;
				 * * case "PR": txtAsig="Sistemas Operativos";
				 * break;
				 * default: txtAsig="Incorrecto";
				*/
				// Mostrar el texto
				// System.out.print("Asignatura:"+txtAsig);
}

}
