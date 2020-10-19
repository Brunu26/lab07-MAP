package entidades;

import interfaceAlimentos.Alimentos;

public class Pao implements Alimentos{

	private String tipo;
	private double calorias;
	
	public Pao(){
		tipo = "pao";
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
		return "Pao " + getTipo() + " com " + getCalorias()+" calorias, ";
	}
	
	
}
