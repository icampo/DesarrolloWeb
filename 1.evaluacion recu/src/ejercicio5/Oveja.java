package ejercicio5;

public class Oveja {

	// Declaramos las variables
	
	private String nombre;
	private long crotal;
	private double litros;
	private Oveja padre;
	private Oveja madre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCrotal() {
		return crotal;
	}

	public void setCrotal(long crotal) {
		this.crotal = crotal;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public Oveja getPadre() {
		return padre;
	}

	public void setPadre(Oveja padre) {
		this.padre = padre;
	}

	public Oveja getMadre() {
		return madre;
	}

	public void setMadre(Oveja madre) {
		this.madre = madre;
	}
	
	// Creamos los constructores
	
	public Oveja() {
		
	}
	
	public Oveja(double litros) {
		this.setLitros(litros);
	}
	
	public Oveja(Oveja o) {
		this.setMadre(o.madre);
		this.setPadre(o.padre);
		this.setLitros(o.litros);
		this.setCrotal(o.crotal);
	}

	// Creamos el to String
	
	public String toString() {
		return "Nombre: " + nombre + ", Crotal: " + crotal;
	}
	
	// Condicion para que no se repita la oveja
	
	public boolean equals(Oveja o){
		if(this.crotal==o.crotal){
			return true;
		}
		else{
			return false;
		}
	}
	
}

