package aplicacao;

import entidades.Sanduiche;
import tiposSanduiche.AmericanoSanduiche;
import tiposSanduiche.BauruSanduiche;
import tiposSanduiche.MistoSanduiche;

public class Aplicacao {

	public static void main(String[] args) {

		AmericanoSanduiche americano = new AmericanoSanduiche();
		BauruSanduiche bauru = new BauruSanduiche();
		MistoSanduiche misto = new MistoSanduiche();
		Sanduiche sand = new Sanduiche();
		
		americano.criarAmericano();
		bauru.criarBauru();
		misto.criarMisto();
		sand.criarSanduiche();
		
		System.out.println("Sanduiche n�1 \n");
		System.out.println(americano);
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("Sanduiche n�2 \n");
		System.out.println(bauru);
		System.out.println("-----------------------------------------------------------------------\n");
		System.out.println("Sanduiche n�3 \n");
		System.out.println(misto);
		System.out.println("-----------------------------------------------------------------------\n");
		System.out.println("Sanduiche n�4 \n");
		System.out.println(sand);
	}

}
