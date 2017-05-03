package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Plantacion {
	
	private int parcela;
	private String fechaPlan;
	private String fechaRec;
	private String especie;
	private int cantPlant;
	private int cantRec;
	
	public Plantacion(int parcela,String fechaPlan){
		setParcela(parcela);
		setFechaPlan(fechaPlan);
	}
	
	public Plantacion(int parcela,String fechaPlan,String fechaRec,String especie,int cantPlant,int cantRec){
		setParcela(parcela);
		setFechaPlan(fechaPlan);
		setFechaRec(fechaRec);
		setEspecie(especie);
		setCantPlant(cantPlant);
		setCantRec(cantRec);
	}

	public Plantacion() {
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public String getFechaPlan() {
		return fechaPlan;
	}

	public void setFechaPlan(String fechaPlan) {
		this.fechaPlan = fechaPlan;
	}

	public String getFechaRec() {
		return fechaRec;
	}

	public void setFechaRec(String fechaRec) {
		this.fechaRec = fechaRec;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getCantPlant() {
		return cantPlant;
	}

	public void setCantPlant(int cantPlant) {
		this.cantPlant = cantPlant;
	}

	public int getCantRec() {
		return cantRec;
	}

	public void setCantRec(int cantRec) {
		this.cantRec = cantRec;
	}
	
	public String toString() {
		return "Parcela: "+getParcela()+" Fecha Plantacion: "+getFechaPlan()+" Especie Plantada: "+getEspecie();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Plantacion) {
			Plantacion plantacion = (Plantacion) obj;
			if(this.getParcela()==(plantacion.getParcela())&&this.getFechaPlan().equals(plantacion.getFechaPlan())){
				return true;
			} else return false;
		} else return false;
	}
	
}
