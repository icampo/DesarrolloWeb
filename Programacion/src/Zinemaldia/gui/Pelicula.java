package Zinemaldia.gui;

public class Pelicula {
	
	// Declarar los atributos
	
	private String titulo;
	private Director director=new Director();
	private int duracion;
	private boolean visto;
	
	// Metodo constructor 
	
	public Pelicula(){
		titulo="";
	}
	
	public Pelicula (String titulo){
		this.setTitulo(titulo);
	}
	
	public Pelicula(String titulo, String director, int duracion, boolean visto){
		
	}
	
	// Declarar metodos

	public void setEdadDirector(int edad){
		director.setEdad(edad);
	}
	
	public int getEdadDirector(){
		return director.getEdad();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director.getNombre();
	}

	public void setDirector(String director) {
		this.director = new Director();
		this.director.setNombre(director);
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

}
