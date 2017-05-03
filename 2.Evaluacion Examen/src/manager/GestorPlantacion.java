package manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import gui.Programa;
import model.Plantacion;

public class GestorPlantacion {
	
	Scanner sc=new Scanner(System.in);
	
	private ArrayList<Plantacion> lstParcelas = new ArrayList<Plantacion>();
	
	private final String FILENAME = "listadoParcelas.txt";
	
	public GestorPlantacion() {
		try {
			leerDatos();
		} catch (NumberFormatException e) {
			System.out.println("ERROR 404");
		}
	}
	
	private void leerDatos() {
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		BufferedReader br = null;
		FileReader fr = null;


		try {

			fin = new FileInputStream(FILENAME);
			ois = new ObjectInputStream(fin);
			
			String linea;

			while ((linea = br.readLine()) != null) {
				// Trozear la información
				String[] datos=linea.split(",");
				int parcela=Integer.parseInt(datos[0]);
				String fechaPlan=datos[1];
				String fechaRec=datos[2];
				String especie=datos[3];
				int cantPlant=Integer.parseInt(datos[4]);
				int cantRec=Integer.parseInt(datos[5]);
				// crear una tarea con la informacion
				Plantacion p=new Plantacion();
				// Añadir la tarea
				this.plantar(p);
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

	private void guardarDatos(){
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			for (Plantacion plantacion : lstParcelas) {
				bw.write(plantacion.getParcela()+":"+plantacion.getFechaPlan()+":"+plantacion.getFechaRec()+plantacion.getEspecie()+":"+plantacion.getCantPlant()+":"+plantacion.getCantRec()+"\r\n");
			}
		} catch (IOException e) {
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

	public void plantar(Plantacion p){
		lstParcelas.add(p);
		guardarDatos();
	}
	
	public void recolectar(int parcela, Date fechaPlan,int cantRec){
		for (Plantacion plantacion : lstParcelas){
			if(plantacion.getParcela()==parcela&&plantacion.getFechaPlan().equals(fechaPlan)){
				plantacion.setCantRec(cantRec);
				guardarDatos();
			}
		}
	}
	
	public Plantacion getPlantacion(int parcela, String fechaPlan){
		for(int i=0;i>lstParcelas.size();i++){
			Plantacion p=lstParcelas.get(i);
			if(p.getParcela()==parcela&&p.getFechaPlan().equals(fechaPlan)){
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Plantacion> getPlantaciones(){
		return lstParcelas;
	}
	
	public ArrayList<Plantacion> getPlanRecoger(){
		final Date FECHA=new Date();
		ArrayList<Plantacion>lstAux=new ArrayList<Plantacion>();
		for(int i=0;i>lstParcelas.size();i++){
			Plantacion p=lstParcelas.get(i);
			if(FECHA.after(p.getFechaRec())&&p.getCantRec()==0){
				lstAux.add(p);
				}
			}
		return lstAux;
	}
}
