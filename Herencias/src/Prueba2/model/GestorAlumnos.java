package Prueba2.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorAlumnos {

	private static final String FICHERO_LISTADO=".\\alumnos.ser";
	
	// Estructura de arraylist
	
	private  ArrayList<Alumno> lstAlumnos=new ArrayList<Alumno>();
	
	public void addAlumno(Alumno a){
		
		// Metodo que añade un alumno en un fichero los datos de los alumnos
		
		lstAlumnos.add(a);
		
	}
	
	public void guardarListado(){
		
		// Metodo que guarda en un fichero los datos de los alumnos
		
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		
		try{
		fout = new FileOutputStream(FICHERO_LISTADO);
		oos = new ObjectOutputStream(fout);
		oos.writeObject(lstAlumnos);
		
		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	
	}
		
	public void leerListado(){
			
		// Metodo para leer desde un fichero los datos de los alumnos
		
			FileInputStream fin = null;
			ObjectInputStream ois = null;
			
			try {
				fin = new FileInputStream(FICHERO_LISTADO);
				ois = new ObjectInputStream(fin);
				lstAlumnos = (ArrayList<Alumno>) ois.readObject();

			}catch(FileNotFoundException fnfe)
			
			{
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {

				if (fin != null) {
					try {
						fin.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				if (ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}

	}
	
	// Metodo para eliminar alumnos
	
	public void delAlumno(int index){
		
			lstAlumnos.remove(index);
		
	}
			
	public void delAlumno(Alumno al){
		
		lstAlumnos.remove(al);

	}
	
	public void modAlumno(int index, Alumno al){
		
		// Metodo para modificar los alumnos
		
		lstAlumnos.set(index, al);
		
	}
	
	public int getSize(){
		
		// Metodo para saber el numero de alumnos que maneja este gestor
		
		return lstAlumnos.size();
		
	}
	
	// Metodo para devolver un alumno
	
	public Alumno getAlumno(int index){
		
		return lstAlumnos.get(index);
		
	}
	
	public Alumno getAlumno(String nombre){
		
		for(int i=0;i<lstAlumnos.size();i++){
			Alumno al=lstAlumnos.get(i);
			if(al.getNombre().equals(nombre)){
				return al;
			}
		}
		return null;
	}
	
}
