package JogoIlhaJava;

public class Torre extends Robo{

	public Torre(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		// Movimenta-se até duas células em cada jogada
		// Avançar: para cima
		// Retroceder: para baixo
	}

}
