package Ejercicio4.geometria;

public class Punto {

	// Declaramos las variables
	
	private double x;
	private double y;
	
	// Metodo getters y setters
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Constructores
	
	public Punto(){
		this.x=0;
		this.y=0;
	}
	
	public Punto(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public Punto(Punto punto){
		this.x=punto.x;
		this.y=punto.y;
	}
}
