package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entidades.Sanduiche;
import tiposSanduiche.AmericanoSanduiche;
import tiposSanduiche.BauruSanduiche;
import tiposSanduiche.MistoSanduiche;

public class TesteSanduiche {

	
		AmericanoSanduiche ame = new AmericanoSanduiche();
		BauruSanduiche bau = new BauruSanduiche();
		MistoSanduiche misto = new MistoSanduiche();
		Sanduiche sand = new Sanduiche();
		
		String san = "Sanduiche Comum\n"+
				"Informações: (Pao pao com 200.0 calorias, Queijo Queijo com 200.0 calorias, Ovo de ovo com 100.0 calorias,\nTomate com 70.0 calorias, Presunto de Presunto com 250.0 calorias)";
		String americano = "Sanduiche Americano \n" +
			"Informações Nutricionais: (Pao Bola com 280.0 calorias, Queijo Cheddar com 113000.0 calorias, \nOvo de Granja com 74000.0 calorias,Tomate com 70.0 calorias, Presunto de Frango com 45000.0 calorias)";
		String bauru = "Sanduiche Bauru\n"+
				"Informações Nutricionais: (Pao Francês com 300.0 calorias, Queijo Prato com 106000.0 calorias, \nTomate com 70.0 calorias, Presunto de Peru com 36000.0 calorias)";
		String mistoS = "Sanduiche Misto\n"+
				"Informações Nutricionais: (Pao Integral com 313.0 calorias, Queijo Prato com 106000.0 calorias, )";
	@Test
	public void testAmericano() {
		ame.criarAmericano();
		assertEquals(americano, ame.toString());
	}
	@Test
	public void testBauru(){
		bau.criarBauru();
		assertEquals(bauru, bau.toString());
	}

	@Test
	public void testMisto(){
		misto.criarMisto();
		assertEquals(mistoS, misto.toString());
	}
	
	@Test
	public void testSanduiche(){
		sand.criarSanduiche();
		assertEquals(san, sand.toString());
	}
}
