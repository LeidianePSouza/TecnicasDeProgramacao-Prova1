package JogoIlhaJava;

public class Rainha extends Robo{

	public Rainha(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		// Movimenta-se como o Bispo, porém, até 4 células em cada jogada
		//Avançar: para cima
		//Retroceder: para baixo
	}

}
