package JogoIlhaJava;

public class Peao extends Robo{

	public Peao(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		// Movimenta-se apenas uma célula em cada jogada:
		// Avançar: para direita
		// Retroceder: para esquerda
	}

}
