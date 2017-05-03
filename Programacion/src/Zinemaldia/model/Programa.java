package Zinemaldia.model;

import java.util.Scanner;

import Zinemaldia.gui.Pelicula;

public class Programa {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Declarar variables
		
		String titulo;
		Pelicula peli;
		
		// Declarar consola
		
		Scanner sc=new Scanner(System.in);
		
		// Pedir datos en la consola
		
		System.out.print("Introduce titulo de la pelicula: ");
		titulo=sc.nextLine();
		
		peli=new Pelicula(titulo);
		
		System.out.print("Introduce el director de la pelicula: ");
		peli.setDirector(sc.nextLine());
		
		System.out.print("Introduce la edad del director de la pelicula: ");
		peli.setEdadDirector(sc.nextInt());
		
		System.out.print("Introduce la duracion de la pelicula: ");
		peli.setDuracion(sc.nextInt());
		
		// Asignarle los datos introducidos por un usuario

		
		
		// Mostrar resultados
		
		
		
	}

}
