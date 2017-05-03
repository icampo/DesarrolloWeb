import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Declarar variable nota
		
		int varNota;
		String notaTxt;
		
		// Crear un scanner para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Solicitar Nota en consola y guardarla en la varible
		
		System.out.print("Introduce la Nota ");
		varNota=sc.nextInt();
		
		// Condicion que se ejecuta
			
			switch(varNota){
			
			case 0:
				notaTxt="F";
				System.out.print(notaTxt);
				break;
				
			case 1:
				notaTxt="F";
				System.out.print(notaTxt);
				break;
				
			case 2:
				notaTxt="F";
				System.out.print(notaTxt);
				break;
				
			case 3:
				notaTxt="F";
				System.out.print(notaTxt);
				break;
				
			case 4:
				notaTxt="F";
				System.out.print(notaTxt);
				break;
				
			case 5:
				notaTxt="C";
				System.out.print(notaTxt);
				break;
				
			case 6:
				notaTxt="C+";
				System.out.print(notaTxt);
				break;
				
			case 7:
				notaTxt="B";
				System.out.print(notaTxt);
				break;
				
			case 8:
				notaTxt="B+";
				System.out.print(notaTxt);
				break;
				
			case 9:
				notaTxt="A";
				System.out.print(notaTxt);
				break;
				
			case 10:
				notaTxt="A+";
				System.out.print(notaTxt);
				break;
				
					}					
	}
}
