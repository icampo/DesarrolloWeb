import java.util.Scanner;

public class Matriculado {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Definir variable para nombre 
		
		String varNombre;
		
		// Definir variable para edad
		
		int varEdad;
		
		// Definir constante de edad minima
		
		final int CONT_EDAD_MINIMA=18;
		
		// Definir Scanner para leer en consola
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir datos en consola
		
		System.out.println("Introduce datos para la Matrícla");
		
		// Introducir nombre
		
		System.out.print("Nombre: ");
		varNombre=sc.nextLine();
		
		// Introducir Edad
		
		System.out.print("Edad: ");
		varEdad=sc.nextInt();
		
		// Introducir condición
		
		// En caso de ser menor, indicar advertencia y diferencia de años
		
		if(varEdad<CONT_EDAD_MINIMA){
		System.out.println(varNombre+", tienes que ser mayor de Edad!!"); 
		System.out.println("Vuelve dentro de"+(CONT_EDAD_MINIMA-varEdad)+" años.");
		}

		// En caso de ser menor, indicar advertencia y diferencia de años
		
		else{
		System.out.println(varNombre+", tu matricula ha sido realizada");
		
	}
	}	
}
