package JogoIlhaJava;

public class Plano {

	protected Celula tabuleiro[][];
	protected int tam;
	
	public Plano(int tamanho, Celula tabuleiro[][]) {
		this.tam = tamanho;
		this.tabuleiro = tabuleiro;
	}	
	
	public static void montarTabuleiro(int tamanho) {
		Celula	tabuleiro[][] = new Celula[tamanho][tamanho];
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				System.out.println(" # ");
			}
		}
	}
			
	public static void posicionarPecas(boolean posicionar) {
		 posicionar = true;
		 Bug.posicaoAleatoriaX();
		 Bug.posicaoAleatoriaY();
		 Aluno.posicaoAleatoriaX();
		 Aluno.posicaoAleatoriaY();
	}
}

