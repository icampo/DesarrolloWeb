package gui;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import model.Alquilable;
import model.Alumno;
import model.Persona;
import model.Profesor;
public class Programa {

	public static void main(String[] args) {
		//crear un array con 10 alumnos, nombre y nota
		Alumno[] listado=new Alumno[10];
		listado[0]=new Alumno("Juan",2);
		listado[1]=new Alumno("Pedro",3);
		listado[2]=new Alumno("Luis",8);
		listado[3]=new Alumno("Nati",9);
		listado[4]=new Alumno("Cipriano",7);
		listado[5]=new Alumno("Elene",3);
		listado[6]=new Alumno("Indalecio",10);
		listado[7]=new Alumno("Juanma",9);
		listado[8]=new Alumno("Matilde",7);
		listado[9]=new Alumno("Aitor",4);
		
		//ordenar el array por nota utilizando Arrays.sort()
		Arrays.sort(listado);
		
		//mostrar el array ordenado por
		for(int i=0; i<listado.length;i++){
			System.out.println(listado[i]);
		}
		
		// TODO Auto-generated method stub
		Persona p1=new Persona("Juan");
		Persona profe1=new Profesor("Aitor");
		Persona profe0= profe1;
		((Profesor)profe1).saluda();
		if (profe1 instanceof Profesor){
			Profesor profe2= (Profesor)profe1;
			profe2.setPrecioHora(60);
			//Alquilable b=new Alquilable();->NO!!
			Alquilable a=profe2;//->OK!!
			//Alquilable aluAlqu=new Alumno();->NO!!
			Alquilable[] lista=new Alquilable[100];
			
		}
		//pruebas interface Alquilable
		
				
		System.out.println(p1);
		System.out.println(profe1);
		
		Persona al1=new Alumno("juan",5);
	
		al1.setNombre("Marius");
		System.out.println(al1);
		
		
		
	}
}