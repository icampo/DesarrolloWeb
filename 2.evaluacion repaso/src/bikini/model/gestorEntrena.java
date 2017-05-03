package bikini.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Date;

public class gestorEntrena {
	
	// Declaramos la Consola
	
	Scanner sc=new Scanner(System.in);
	
	// Creamos el arraylist de nuestra lista de entrenamientos
	
	private ArrayList<Entrena> lstEntrena=new ArrayList<Entrena>();
	
	// Creamos el fichero en el que se guardaran los entrenamientos

	private static final String FICHERO_ENTRENA="entrena.txt";
	
	// Metodo para leer los datos del fichero anteriormente creado
	
	private void leerDatos() throws IOException{
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		BufferedReader br = null;
		FileReader fr = null;


		try {

			fin = new FileInputStream(FICHERO_ENTRENA);
			ois = new ObjectInputStream(fin);
			
			String linea;

			while ((linea = br.readLine()) != null) {
				// Trozear la información
				String[] datos=linea.split(",");
				double kms=Double.parseDouble(datos[0]);
				int mins=Integer.parseInt(datos[1]);
				String lugar=datos[2];
				Date fecha=Date.valueOf(datos[3]);
				// crear una tarea con la informacion
				Entrena e=new Entrena();
				// Añadir la tarea
				this.addEntrena(e);
			}
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
	// Metodo para guardar los datos del fichero anteriormente creado
	
	private void guardarDatos() throws IOException{
		
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(FICHERO_ENTRENA);
			bw = new BufferedWriter(fw);
			
			for(Entrena e:lstEntrena){
				bw.write(e.getKms()+", "+e.getMins()+", "+e.getLugar()+", "+e.getFecha()+"\r\n");
			}
	}catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}

}

	// Metodo para añadir entrenamiento
	
	public void addEntrena(Entrena e) throws IOException{
		try {
			lstEntrena.add(e);
			this.guardarDatos();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.print("Guardando fichero...");
	}
	
	// Metodo para modificar los entrenamientos ya existentes
	
	public void modEntrena(Entrena old, Entrena nuevo){
		try {
			int index=lstEntrena.indexOf(old);
			lstEntrena.set(index, nuevo);
			guardarDatos();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	// Metodo para eliminar entrenamiento
	
	public void delEntrena(Entrena e){
		lstEntrena.remove(e);
	}
	
	// Metodo para los entrenamientos
	
	public ArrayList<Entrena> getEntrena(){
		return lstEntrena;
	}
	
	// Metodo para contar los kilometros totales
	
	public double getTotalKm(){
		double totalKm=0;
		for(Entrena e:lstEntrena){
			totalKm=totalKm+e.getKms();
		}
		return totalKm;
	}
	
	// Metodo para calcular los minutos totales
	
	public int getTotalMin(){
		int totalMin=0;
		for(Entrena e:lstEntrena){
			totalMin=totalMin+e.getMins();
		}
		return totalMin;
	}
	

	// Metodo para calcular media velocidad
	
	public double getMedia(){
		double media=0;
		media=getTotalKm()/getTotalMin()*60;
		return media;
		
	}

}

