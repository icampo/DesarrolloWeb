package EjercicioGlobal.datos;

import java.util.Scanner;

public class Asignatura {

		// Declarar variables
		
		private String nombre;
		private Double nota;
		
		// Definir constructora
	
		public Asignatura(String nombre){
		this.nombre = nombre;
		}
		
		// Metodos Getters and Setters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Double getNota() {
			return nota;
		}

		public void setNota(Double nota) {
			this.nota = nota;
		}
		
		// Indicar al sistema que se esta sobreescribiendo un metodo
		
		public String toString() {
			return nombre+": "+nota;
		}
		
		// Comparar 2 alumnos
		
		public boolean equals(Asignatura asignatura) {
			if(this.nombre.equals(asignatura.getNombre())){
				return true;
			}else{
				return false;
			}
		}
	
}