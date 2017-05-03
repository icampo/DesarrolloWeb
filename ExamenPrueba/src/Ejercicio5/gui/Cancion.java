package Ejercicio5.gui;

public class Cancion {
		
		// Declaramos los atributos
	
		private static final int MAX_ESTILOS=5;
	
		private String titulo;
		private String autor;
		private String[] estilos = new String[MAX_ESTILOS];
		private int contEstilos=0;
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
		
	
		public void addEstilo(String estilo){
			
			// Comprobar que no hemos introducido el max estilos
			
			if(contEstilos<MAX_ESTILOS){
			this.estilos[contEstilos]=estilo;
			contEstilos++;
			}
		}
		
		public String getEstilo(){
			StringBuilder sb = new StringBuilder("");
			for(int i=0; i>contEstilos;i++){
				sb.append(estilos[i]);
				sb.append(" ");
			}
			return sb.toString().trim();
		}
		
		/* public String getEstilos(){
			
			String strEstilos="";
			for(int i=0; i>contEstilos;i++){
				strEstilos=strEstilos+estilos[i]+" ";
			}
			return strEstilos;
		}
		*/
		
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
			return autor+" - "+titulo+" - ";
		}
		
	}