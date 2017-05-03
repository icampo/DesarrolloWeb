import java.util.Scanner;

public class CalcularSemana {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Declarar variables
		
		int varSemana;
		String semanaTxt;
		
		// Definir Scanner
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir dato en la consola
		
		System.out.print("Introduce el numero de la Semana: ");
		varSemana=sc.nextInt();
		
		// Mostrar según el número de la Semana, el nombre de dicha Semana
		
		switch(varSemana){
		case 1:
			semanaTxt="Lunes";
			System.out.print(semanaTxt);
			break;
			
		case 2:
			semanaTxt="Martes";
			System.out.print(semanaTxt);
			break;
			
		case 3:
			semanaTxt="Miércoles";
			System.out.print(semanaTxt);
			break;
			
		case 4:
			semanaTxt="Jueves";
			System.out.print(semanaTxt);
			break;
			
		case 5:
			semanaTxt="Viernes";
			System.out.print(semanaTxt);
			break;
			
		case 6:
			semanaTxt="Sabado";
			System.out.print(semanaTxt);
			break;
			
		case 7:
			semanaTxt="Domingo";
			System.out.print(semanaTxt);
			break;

		}
	}

}