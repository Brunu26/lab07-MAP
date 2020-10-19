package tiposSanduiche;

import entidades.Sanduiche;
import entidades.Tomate;
import tiposOvo.OvoGranja;
import tiposPao.PaoBola;
import tiposPresunto.PresuntoFrango;
import tiposQueijo.QueijoCheddar;

public class AmericanoSanduiche extends Sanduiche{

	
	
	
	public AmericanoSanduiche(){
		setNome("Americano");
		
	}
	
	

	private void criarQueijo(){
	queijo = new QueijoCheddar(); 
	}
	
	private void criarPresunto(){
	presunto =	new PresuntoFrango();
	}
	
	private void criarPao(){
		pao  = new PaoBola();
	}
	
	private void criarOvo(){
		ovo = new OvoGranja();
	}
	

	private void criarTomate(){
		tomate = new Tomate();
	}
	
	public void criarAmericano(){
		criarPao();
		criarOvo();
		criarPresunto();
		criarQueijo();
		criarTomate();
	}

	@Override
	public String toString() {
		return "Sanduiche Americano " + "\nInformações Nutricionais: ("+  pao +  queijo + "\n"+ ovo + 
				 tomate  + presunto + ")";
	}
	
}
