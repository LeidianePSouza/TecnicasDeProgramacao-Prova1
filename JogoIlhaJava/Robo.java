package JogoIlhaJava;

public abstract class Robo {
	
	protected String Nome;
	protected int Identificador;
	protected int posicaoX;
	protected int posicaoY;
	protected Plano plano;
	protected boolean posicionar; 
	
	public Robo(String nome, int identificador, int posicaoX, int posicaoY, Plano plano, boolean posicionar) {
		super();
		this.Nome = nome;
		this.Identificador = identificador;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.plano = plano;
		this.posicionar = posicionar;
	}

}
