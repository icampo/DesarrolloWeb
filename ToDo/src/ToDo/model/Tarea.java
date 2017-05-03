package ToDo.model;

public class Tarea {

	private String titulo;
	private boolean hecho;
	
	public Tarea(String titulo){
		this.titulo=titulo;
	}
	
	public boolean isHecho(){
		return hecho;
	}
	
	public void finalizar(){
		hecho=true;
	}
	
	public String toString(){
		return titulo;
	}
	
	
}
