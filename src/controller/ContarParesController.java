package controller;

public class ContarParesController {

	public ContarParesController() {
		super();
	}

	public int contarNumerosPares(int[] vet, int tamanho, int qtdeNumPares) {
		if (tamanho == 0) {
			return qtdeNumPares;
		} else {
			int posicao = tamanho - 1;
			if (vet[posicao] % 2 == 0) {
				qtdeNumPares++;
			}
			tamanho--;
			return contarNumerosPares(vet, tamanho, qtdeNumPares);
		}
	}
}
