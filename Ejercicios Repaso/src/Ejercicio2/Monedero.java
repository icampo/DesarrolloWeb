package Ejercicio2;

import java.util.Scanner;

class Monedero {
double dinero=0;

public Monedero(double vDinero) {
dinero = vDinero;
}

// Constructor para ingresar dinero

public void ingresarDinero(double vDinero) {
dinero += vDinero;
}

//Constructor para extraer dinero

public void sacarDinero(double vDinero) {
if (vDinero <= dinero) {
dinero -= vDinero;
}else{
	System.out.println("No Dispones de esa cantidad de dinero");
	System.out.println("");
}
}

//Constructor para consultar dinero

public double consultarDinero() {
return dinero;
}

// Metodo para el monedero

public static void main(String args[]){
	
Scanner sc=new Scanner(System.in);
Monedero objetoDinero= new Monedero(0);
int opcion=0;

// Menu del programa
do{
System.out.println("***Banco Nacional***");
System.out.println("--------------------");
System.out.println("1. Ingresar Dinero");
System.out.println("2. Extraer Dinero");
System.out.println("3. Consultar Cuenta");
System.out.println("4. Salir");


opcion=sc.nextInt();

switch(opcion){

case 1:
	System.out.println("");
	System.out.println("Ingrese la cantidad deseada: ");
	double ingresar=sc.nextDouble();
	objetoDinero.ingresarDinero(ingresar);
	System.out.println("");
	System.out.println("Ingresando... "+ingresar+"€");
	System.out.println("");
	break;
	
case 2:
	System.out.println("");
	System.out.println("Extrae la cantidad deseada: ");
	double extraer=sc.nextDouble();
	objetoDinero.sacarDinero(extraer);
	System.out.println("");
	System.out.println("Extrayendo... "+extraer+"€");
	System.out.println("");
	break;
	
case 3:
	System.out.println("");
	System.out.println("Dinero Actual: "+objetoDinero.consultarDinero());
	System.out.println("");
	break;
	
case 4:
	System.out.println("");
	System.out.println("Saliendo de su cuenta....");
	break;
}
}
while(opcion!=4);
System.out.println("Gracias por usar nuestros servicios");
}
}
