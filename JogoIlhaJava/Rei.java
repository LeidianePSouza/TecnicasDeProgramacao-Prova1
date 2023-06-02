package JogoIlhaJava;

public class Rei extends Robo{

	public Rei(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		// Movimenta-se como o Cavalo, porém, até 4 células em cada jogada
		// Avançar: para direita
		// Retroceder: para esquerda
	}

}
