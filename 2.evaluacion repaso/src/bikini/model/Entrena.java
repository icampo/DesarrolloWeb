package bikini.model;

import java.util.Date;

public class Entrena {
	
	//Declaramos las variables
	
	private double kms;
	private int mins;
	private String lugar;
	private Date fecha;
	
	// Metodos getters and setters
	
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	// Metodo String to String
	
	public String toString(){
		String entrenado=fecha+", "+lugar+", "+kms;
		return entrenado;
	}
	
	// Metodo de comparacion entre 2 entremaientos
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Entrena){
			Entrena e=(Entrena) obj;
		// Comparamos si fecha y lugar coinciden  
		if(fecha==e.fecha && getLugar().equals(e.lugar)){
			return true;
		}
		}
		return false;
	}
	
}
