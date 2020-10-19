package entidades;

public class Sanduiche {

	protected String nome;
	protected Pao pao;
	protected Queijo queijo;
	protected Ovo ovo;
	protected Tomate tomate;
	protected Presunto presunto;
	
	public Sanduiche(){
		this.nome ="Sanduiche Comum";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private void criarPao(){
	    pao = new Pao();
		
	}
	private void criarQueijo(){
		queijo = new Queijo();
	}
	
	private void criarPresunto(){
		presunto = new Presunto();
	}
	
	private void criarTomate(){
		tomate = new Tomate();
	}
	private void criarOvo(){
		ovo = new Ovo();
	}
	
	public void criarSanduiche(){
		criarPao();
		criarQueijo();
		criarPresunto();
		criarTomate();
		criarOvo();
	}
	@Override
	public String toString() {
		return   getNome() +"\nInformações: ("+ pao + queijo  + ovo
				+ "\n"+ tomate + presunto+")";
	}
	
	
}
