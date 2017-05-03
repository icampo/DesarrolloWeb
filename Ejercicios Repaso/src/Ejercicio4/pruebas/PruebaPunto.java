package Ejercicio4.pruebas;

import Ejercicio4.geometria.Punto;

public class PruebaPunto {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Asignamos el objeto
		
		Punto punto1;
		Punto punto2;
		Punto punto3;
		Punto punto4;
		
		punto1=new Punto(1,3);
		punto2=new Punto(2,6);
		punto3=new Punto(punto1);
		punto4=new Punto(punto2);
		
		System.out.println("Punto-1: X: "+punto1.getX()+" Y: "+punto1.getY());
		System.out.println("Punto-2: X: "+punto2.getX()+" Y: "+punto2.getY());
		System.out.println("Punto-3: X: "+punto3.getX()+" Y: "+punto3.getY());
		System.out.println("Punto-4: X: "+punto4.getX()+" Y: "+punto4.getY());
		
	}

}
