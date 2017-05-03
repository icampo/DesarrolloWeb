package Ejercicio4.gui;

public class Cancion {
		
		// Declaramos los atributos
	
		
	
		private String titulo;
		private String autor;
		private String estilo;
		private int duracion;
		private boolean escuchada;

// Constructora de titulo para coger el atributo
		
public Cancion(String titulo){
	this.titulo=titulo;
}
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getAutor() {
			return autor;
		}
		
		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public String getEstilo() {
			return estilo;
		}

		public void setEstilo(String estilo) {
			this.estilo = estilo;
		}

		public int getDuracion() {
			return duracion;
		}
		
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		
		public boolean isEscuchada() {
			return escuchada;
		}
		
		public void setEscuchada(boolean escuchada) {
			this.escuchada = escuchada;
		}
		
		@Override
		public String toString() {
			return autor+" - "+titulo;
		}
		
	}