package JogoIlhaJava;

import java.util.Random;

public class Aluno {

	protected String nome;
	protected Plano plano;
	protected int posicaoX;
	protected int posicaoY;
	protected boolean posicionar;
	
	public static void posicaoAleatoriaX() {
		Random posicaoX = new Random();
		boolean posicaoAleatoria = posicaoX.nextBoolean();
	}
	
	public static void posicaoAleatoriaY() {
		Random posicaoY = new Random();
		boolean posicaoAleatoria = posicaoY.nextBoolean();
	}
}
