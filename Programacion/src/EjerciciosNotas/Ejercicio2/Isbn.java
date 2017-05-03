package EjerciciosNotas.Ejercicio2;

import java.util.Scanner;

public class Isbn {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Declarar variable
		
		String isbn;
		int suma=0;
		
		// Añadir consola
		
		Scanner sc=new Scanner(System.in);
		
		// Crear metodo
		
		System.out.print("ISBN: ");
		isbn=sc.nextLine();
		
		if(isbn.length()!=10){
			System.out.println("Tienes que introducir 10 digitos");
		}
		
		else{
		
		for(int i=0; i<=10;i++){
				char car=isbn.charAt(i);
				if(car<'0' || car>'9'){
				System.out.println("Error!!!, se ha introducido un caracter.");
				return;
				}
			}
		
		for(int i=1; i<=10;i++){
			suma=suma+i*(isbn.charAt(i-1)-'0');
		}
		
		if(suma%11==0){
			System.out.println("ISBN es correcto!!");
		}
		else{
			System.out.println("ISBN es incorrecto!!");
		}
	}
	}
}
