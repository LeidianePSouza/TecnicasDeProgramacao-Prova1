package JogoIlhaJava;


public class Andador extends Robo
{
	public Andador(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super(nome, identificador, posicaoX, posicaoY, plano, posicionar);
		// Movimenta-se em qualquer número de células desejada:
		// Avançar: para cima
		// Retroceder: para baixo
	}
}


