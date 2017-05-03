package Prueba2.model;

import java.io.Serializable;

public class Persona implements Serializable {
public String nombre;
	
	@Override
	public String toString() {
		return "nombre: "+nombre;
	}
	
	public String getNombre() {
		return Mayusculas(nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = Mayusculas(nombre);
	}
	
	private String Mayusculas(String M){
		return M.substring(0,1).toUpperCase()+M.substring(1).toLowerCase();
	}

}
