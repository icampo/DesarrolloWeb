import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// N�mero m�ximo de asignaturas de un alumno
		
		final int NUM_ASIG_ALUM=3;
		
		// Crear un scanner para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Definir Nombre del alumno
		
		String nombre;
		
		// Definir una var para guardar la nota De programaci�n
		
		float notaProg;
		
		// Definir una var para guardar la nota de bbdd
		
		float notaBbdd;
		
		// Definir una var para guardar la nota de leng marcas
		
		float notaLengMarcas;
		
		// Pedir las notas al usuario
		
		System.out.print("Introduce nombre del alumno ");
		nombre=sc.nextLine();
		System.out.println("Introduce las siguientes Notas...");
		System.out.print("Programaci�n: ");
		notaProg=sc.nextFloat();
		System.out.print("Lenguaje de Marcas: ");
		notaLengMarcas=sc.nextFloat();
		System.out.print("Bases de Datos: ");
		notaBbdd=sc.nextFloat();
		
		
		// Definir una var para calcular la media55
		
		double media=(double)(notaProg+notaBbdd+notaLengMarcas)/NUM_ASIG_ALUM;
		
		// Media con decimal
		
		// Escribe tu media por consola
		
		System.out.println(nombre+" tu Media es "+media);
		
		if(media<5)
		System.out.println("A este paso llegar�s a ser Presidente del Gobierno");	
		else if(media>=5 && media<=7)
		System.out.print("Que bien huele a chuleta!!!");
		else 
		System.out.print("Con que has estado investigando...");
		
	}

}
