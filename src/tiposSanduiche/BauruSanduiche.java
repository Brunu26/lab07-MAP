package tiposSanduiche;

import entidades.Sanduiche;
import entidades.Tomate;
import tiposPao.PaoFrances;
import tiposPresunto.PresuntoPeru;
import tiposQueijo.QueijoPrato;

public class BauruSanduiche extends Sanduiche{

	public BauruSanduiche(){
		setNome("Bauru");
	}
	
	private void criarPao(){
		pao = new PaoFrances();
	}
	private void criarQueijo(){
		queijo = new QueijoPrato();
	}
	private void criarPresunto(){
		presunto = new PresuntoPeru();
	}
	private void criarTomate(){
		tomate = new Tomate();
	}
	
	public void criarBauru(){
		criarPao();
		criarQueijo();
		criarPresunto();
		criarTomate();
		
	}

	@Override
	public String toString() {
		return "Sanduiche Bauru" +"\nInformações Nutricionais: ("+  pao +  queijo  + "\n"+
				 tomate  + presunto + ")";
	}
	
}
