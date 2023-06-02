package JogoIlhaJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite o tamanho do Tabuleiro: ");
		Scanner tamanho = new Scanner(System.in);
	
		Plano.montarTabuleiro(4);
		Plano.posicionarPecas(true);
	
	}
}

