package Ejercicio5.programa;

import java.util.Scanner;

import Ejercicio5.gui.Cancion;

public class Programa {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variables
		
		String titulo;
		String autor;
		
		// Crear consola
		
		Scanner sc=new Scanner(System.in);

		// Crear la introduccion de la 1 cancion
		
		System.out.print("Introduce el titulo de la cancion: ");
		titulo=sc.nextLine();
		
		// Crear objeto de la cancion 1
		
		Cancion c1=new Cancion(titulo);
		
		// Crear la introduccion de la 1 cancion
		
		System.out.print("Introduce el titulo del autor: ");
		autor=sc.nextLine();
		c1.setAutor(autor);
		
		
		// Crear la introduccion de la 2 cancion
		
		System.out.print("Introduce el titulo de la cancion: ");
		titulo=sc.nextLine();
		
		// Crear objeto de la cancion 
		
		Cancion c2=new Cancion(titulo);
		
		System.out.print("Introduce el titulo del autor: ");
		autor=sc.nextLine();
		c2.setAutor(autor);
		
		// Metodo automatico para cancion 1
		/*
		Cancion c1=new Cancion("Donde estan mi carro");
		c1.setAutor("Manolo");
		c1.setEstilo("Rumba");
		c1.setDuracion(3);
		*/
		
		// Metodo automatico para cancion 2
		/*
		Cancion c2=new Cancion("Porrompompero");
		c2.setAutor("Manolo");
		c2.setEstilo("Rumba");
		c2.setDuracion(4);
		*/
		
		// Imprimir las canciones
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
