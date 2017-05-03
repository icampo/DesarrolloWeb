package ejercicio6;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		// Declarar variables
		
		Oveja oveja1;
		Oveja oveja2;
		Oveja oveja3;
		String nombre;
		long crotal;
		double litros;
		Oveja padre;
		Oveja madre;
		
		// Crear consola
		
		Scanner sc=new Scanner(System.in);
	
		// Crear la primera oveja
		
		oveja1=new Oveja();
		oveja1.setNombre("Manuela");
		oveja1.setMadre(null);
		oveja1.setPadre(null);
		oveja1.setCrotal(001);
		oveja1.setLitros(80);
		
		// Crear la segunda oveja
		
		oveja2=new Oveja();
		oveja2.setNombre("Manuel");
		oveja2.setMadre(null);
		oveja2.setPadre(null);
		oveja2.setCrotal(002);
		oveja2.setLitros(60);

		// Crear la tercera oveja
		
		oveja3=new Oveja();
		oveja3.setNombre("Miguel");
		oveja3.setMadre(oveja1);
		oveja3.setPadre(oveja2);
		oveja3.setCrotal(003);
		oveja3.setLitros(30);
		
		// Mostramos los datos de la oveja 3
		
		System.out.println("Nombre de la oveja 3: "+oveja3);
		System.out.println("[Padre] "+oveja3.getPadre());
		System.out.println("[Madre] "+oveja3.getMadre());
		
	}

}