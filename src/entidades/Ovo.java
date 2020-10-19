package entidades;

import interfaceAlimentos.Alimentos;

public class Ovo implements Alimentos{

	private String tipo;
	private double calorias;
	
	public Ovo(){
		tipo = "ovo";
		calorias = 100;
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}
	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public double getCalorias() {
		return calorias;
	}

	@Override
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Ovo de " + tipo + " com " + calorias+" calorias,";
	}

	
	
	
}
