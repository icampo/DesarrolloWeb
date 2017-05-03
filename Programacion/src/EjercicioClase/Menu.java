package EjercicioClase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Declarar variables
		
		int opcionSel=0;
		
		/* Variables solamente para el metodo if
		
		int opcionSaludo=1;
		int opcionHora=2;
		int opcionFecha=3;
		int opcionSalir=4;
		
		*/
 		
		// Declarar para leer consola
		
		Scanner sc=new Scanner(System.in);
		
		// Creamos condicion
		
		do{
			
			// Mostrar menu
			
			System.out.println("*** Menu ***");
			System.out.println("1. Saludo");
			System.out.println("2. Hora");
			System.out.println("3. Fecha");
			System.out.println("4. Salir");
			System.out.print("Opcion: ");
			System.out.print("");

			// Leer la opcion seleccionada
			
			opcionSel=sc.nextInt();
			System.out.println("");
			
			// Ejecutar la opcion selecionada
		
			/* Metodo if
			
			if(opcionSel==1){
			
				System.out.println("Buenos Dias");
				System.out.println("");
			}
			
			if(opcionSel==2){
				System.out.println(LocalTime.now());
				System.out.println("");
			}
			
			if(opcionSel==3){
				System.out.println(LocalDate.now());
				System.out.println("");
			}
			
			if(opcionSel==4){
				System.out.println("Has salido del programa");
				System.out.println("");
			}
			
			*/
			
			// Metodo Switch
			
			switch(opcionSel){
			
			case 1:
				
				System.out.println("Buenos Dias");
				System.out.println("");
				break;
			
			case 2:
				
				System.out.println(LocalTime.now());
				System.out.println("");
				break;
				
			case 3:
				
				System.out.println(LocalDate.now());
				System.out.println("");
				break;
				
			case 4:
				
				System.out.println("Has salido del programa");
				System.out.println("");
				break;
		
			}
			
		}while(opcionSel!=4);
			
		}
	
	}
