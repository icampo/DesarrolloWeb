import java.util.Scanner;

public class CalcularMes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Declarar variables
		
		int varMes;
		String mesTxt;
		
		// Definir Scanner
		
		Scanner sc=new Scanner(System.in);
		
		// Introducir dato en la consola
		
		System.out.print("Introduce el numero del mes: ");
		varMes=sc.nextInt();
		
		// Mostrar según el número del mes, el nombre de dicho mes
		
		switch(varMes){
		case 1:
			mesTxt="Enero";
			System.out.print(mesTxt);
			break;
			
		case 2:
			mesTxt="Febrero";
			System.out.print(mesTxt);
			break;
			
		case 3:
			mesTxt="Marzo";
			System.out.print(mesTxt);
			break;
			
		case 4:
			mesTxt="Abril";
			System.out.print(mesTxt);
			break;
			
		case 5:
			mesTxt="Mayo";
			System.out.print(mesTxt);
			break;
			
		case 6:
			mesTxt="Junio";
			System.out.print(mesTxt);
			break;
			
		case 7:
			mesTxt="Julio";
			System.out.print(mesTxt);
			break;
			
		case 8:
			mesTxt="Agosto";
			System.out.print(mesTxt);
			break;
			
		case 9:
			mesTxt="Septiembre";
			System.out.print(mesTxt);
			break;
			
		case 10:
			mesTxt="Octubre";
			System.out.print(mesTxt);
			break;
			
		case 11:
			mesTxt="Noviembre";
			System.out.print(mesTxt);
			break;
			
		case 12:
			mesTxt="Diciembre";
			System.out.print(mesTxt);
			break;
		}
	}

}
