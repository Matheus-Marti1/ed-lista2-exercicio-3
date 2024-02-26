package view;

import controller.ContarParesController;

public class Principal {

	public static void main(String[] args) {
		ContarParesController par = new ContarParesController();
		int vet[] = { 1, 3, 5, 2, 4, 8, 7, 13 };
		int qtdeNumPares = 0;
		int tamanho = vet.length;
		System.out
				.println("Quantidade de números pares no vetor: " + par.contarNumerosPares(vet, tamanho, qtdeNumPares));
		System.exit(0);
	}

}
