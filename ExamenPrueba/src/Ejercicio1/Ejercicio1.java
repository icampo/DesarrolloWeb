package Ejercicio1;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declaramos las variables
		
		String varNombre;
		int varEdad;
		
		// Ver a�o actual
		
		Calendar fecha = new GregorianCalendar();
		int a�o = fecha.get(Calendar.YEAR);
		
		
		// Creamos la consola 
		
		Scanner sc=new Scanner(System.in);
		
		// Pedimos Nombre del usuario
		
		System.out.print("Introduce el nombre del usuario: ");
		varNombre=sc.nextLine();
		
		// Pedimos la nota del usuario
		
		System.out.print("Introduce el a�o de nacimiento del usuario: ");
		varEdad=sc.nextInt();
		
		// Mostramos los datos introducidos
		
		System.out.print(varNombre+" tienes "+(a�o-varEdad)+" a�os.");
		
	}

}
