package JogoIlhaJava;

import java.util.Random;

public class Bug {

	protected String nome;
	protected Plano plano;
	protected int posicaoX;
	protected int posicaoY;
	protected boolean posicionar; 
	
	public static void posicaoAleatoriaX() {
		Random posicaoX = new Random();
		boolean posicaoAleatoriaX = posicaoX.nextBoolean();
	}
	
	public static void posicaoAleatoriaY() {
		Random posicaoY = new Random();
		boolean posicaoAleatoria = posicaoY.nextBoolean();
	}

}
