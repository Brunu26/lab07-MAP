package entidades;

import interfaceAlimentos.Alimentos;

public class Queijo implements Alimentos{

	private String tipo;
	private double calorias;
	public Queijo(){
		tipo = "Queijo";
		calorias = 200;
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
		return "Queijo " + tipo + " com " + calorias+" calorias, ";
	}
	
	
}
