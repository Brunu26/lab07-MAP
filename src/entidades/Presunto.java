package entidades;

import interfaceAlimentos.Alimentos;

public class Presunto implements Alimentos{

	private String tipo;
	private double calorias;
	
	public Presunto(){
		tipo ="Presunto";
		calorias = 250;
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
		return "Presunto de " + tipo + " com " + calorias+" calorias";
	}
	
}
