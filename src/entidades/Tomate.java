package entidades;

public class Tomate {

	private double calorias;

	public Tomate(){
		calorias = 70;
	}
	
	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Tomate com " + calorias+" calorias, ";
	}
	
	
	
}
