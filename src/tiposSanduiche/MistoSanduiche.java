package tiposSanduiche;

import entidades.Sanduiche;
import tiposPao.PaoIntegral;
import tiposQueijo.QueijoPrato;

public class MistoSanduiche extends Sanduiche{

	public MistoSanduiche(){
	
		setNome("Misto");
	}
	private void criarQueijo(){
		queijo = new QueijoPrato();
		
	}
	
	private void criarPao(){
		pao = new PaoIntegral();
	}
	
	public void criarMisto(){
		criarPao();
		criarQueijo();
	}
	
	@Override
	public String toString() {
		return "Sanduiche Misto"+"\nInformações Nutricionais: (" + pao + queijo + ")";
	}
}
