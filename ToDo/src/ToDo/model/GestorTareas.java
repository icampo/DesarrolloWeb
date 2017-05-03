package ToDo.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class GestorTareas {
	
	public static final int LISTAR_TODAS=0;
	public static final int LISTAR_REALIZADAS=1;
	public static final int LISTAR_NO_REALIZADAS=2;
	
	private ArrayList<Tarea> lstTareas=new ArrayList<Tarea>();

	private static final String FICHERO_LISTADO="tareas.txt";
	
	public void leerTareas(){
		
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FICHERO_LISTADO);
			br = new BufferedReader(fr);
			
			String linea;

			while ((linea = br.readLine()) != null) {
				// Trozear la información
				String[] datos=linea.split(",");
				String titulo=datos[0];
				boolean hecho=Boolean.parseBoolean(datos[1]);
				// crear una tarea con la informacion
				Tarea t=new Tarea(titulo);
				if(hecho){
					t.finalizar();
				}
				// Añadir la tarea
				this.addTarea(t);
			}
			System.out.println("");
			System.out.println("Creando las tareas nuevas...");
			System.out.println("");
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
	}

	public void guardarTareas(){

			BufferedWriter bw = null;
			FileWriter fw = null;

			try {

				fw = new FileWriter(FICHERO_LISTADO);
				bw = new BufferedWriter(fw);
				
				for(Tarea t:lstTareas){
					bw.write(t.toString()+", "+t.isHecho()+"\r\n");
				}
				System.out.println("");
				System.out.println("Guardando fichero...");
				System.out.println("");

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
	
	public void modificarTareas(){
		
	}
	
	public void borrarTareas(){
		
	}
	
	public void addTarea(Tarea t){
		lstTareas.add(t);
	}
	
	public void finTarea(String titulo){
		Tarea tarea;
		for(int i=0;i<lstTareas.size();i++){
			tarea=lstTareas.get(i);
			if(tarea.toString().equals(titulo)){
				tarea.finalizar();
				System.out.println("Finalizando titulo...");
				System.out.println("");
				return;
			}
		}
		System.out.print("La tarea introducida no existe");
		System.out.print("");
		
	}
	
	public int getTareasSinHacer(){
		return 0;
	}
	
	public Tarea[] getTareas(int tipo){
		if (tipo==LISTAR_TODAS){
			return lstTareas.toArray(new Tarea[0]);
		}else{
			ArrayList<Tarea> lstAux=new ArrayList<Tarea>();
			for(Tarea t:lstTareas){
				if((tipo==LISTAR_REALIZADAS && t.isHecho())||
				(tipo==LISTAR_NO_REALIZADAS && !t.isHecho())){
					lstAux.add(t);
			}
		}
		return lstAux.toArray(new Tarea[0]);
	}	
}
	
}
