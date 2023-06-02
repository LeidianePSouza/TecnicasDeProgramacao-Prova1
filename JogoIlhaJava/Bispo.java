package JogoIlhaJava;

public class Bispo extends Robo{

	public Bispo(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		// Movimenta-se pelas diagonais até duas células em cada jogada
		// Avançar: para cima
		// Retroceder: para baixo
	}

}
