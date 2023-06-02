package JogoIlhaJava;

public class Cavalo extends Robo{

	public Cavalo(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		//Movimenta-se pelas diagonais até duas células em cada jogada
		// Avançar: para direita
		// Retroceder: para esquerda
	}

}
