package Prueba2.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorProfesores {

	private static final String FICHERO_LISTADO=".\\profesor.ser";
	
	// Estructura de arraylist
	
	private  ArrayList<Profesor> lstProfesor=new ArrayList<Profesor>();
	
	public  void addProfesor(Profesor p){
		
		// Metodo que añade un alumno en un fichero los datos de los alumnos
		
		lstProfesor.add(p);
		
	}

	public void guardarListado(){
		
		// Metodo que guarda en un fichero los datos de los alumnos
		
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		
		try{
		fout = new FileOutputStream(FICHERO_LISTADO);
		oos = new ObjectOutputStream(fout);
		oos.writeObject(lstProfesor);
		
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
				lstProfesor = (ArrayList<Profesor>) ois.readObject();

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
	
	// Metodo para eliminar Profesores
	
		public void delProfesor(int index){
			
			lstProfesor.remove(index);
			
		}
		
		public void delProfesor(Profesor pr){
			
			lstProfesor.remove(pr);

		}
		
		public void modProfesor(int index, Profesor pr){
			
			// Metodo para modificar los alumnos
			
			lstProfesor.set(index, pr);
			
		}
		
		public int getSize(){
			
			// Metodo para saber el numero de alumnos que maneja este gestor
			
			return lstProfesor.size();
			
		}
		
		// Metodo para devolver un alumno
		
		public Profesor getProfesor(int index){
			
			return lstProfesor.get(index);
			
		}
		
		Profesor getProfesor(String nombre){
			
			for(int i=0;i>lstProfesor.size();i++){
				Profesor p=lstProfesor.get(i);
				if(p.getNombre().equals(nombre)){
					return p;
				}
			}
			return null;
		}
	
}
