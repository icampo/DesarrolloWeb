package Ejercicio3;

public class Circulo {

	// Declaramos las variables
	
	private double radio;

	// Creamos los getters y setters
	
	public double getRadio() {
		return radio;
	}
	
	public Circulo() {
		this.radio=1;
	}
	
	public Circulo(double radio){
		if(radio>0){
		this.radio=radio;
		}
	}
	
	public Circulo(Circulo c){
		this.radio = c.radio;
	}
	
	public void setRadio(double radio) {
		if(radio>0){
		this.radio = radio;
		}
	}
	
	public double calcularArea(){
		double area;
		area = (double) (3.1416 * Math.pow(radio,2));
		return area;
	}
	
	public double calcularPerimetro(){
		double perimetro;
		perimetro = 2*Math.PI*radio;
		return perimetro;
		
	}
	
}
