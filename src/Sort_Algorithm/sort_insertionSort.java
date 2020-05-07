package Sort_Algorithm;

public class sort_insertionSort {

	public static void main(String[] args) {
		int[] intArray = { 8, 4, 1, 5, 9, 0, 6, 3, 7, 2 };

		// Nós não iremos precisar da função (troca) neste algoritmo.
		// Ao invés de começarmos do índice 0 (zero) em Insertion Sort nós começaremos a
		// partir do segundo índice (1).

		for (int primeiroIndexDesordenado = 1; primeiroIndexDesordenado < intArray.length; primeiroIndexDesordenado++) {

			// A variável (novoElemento) foi criada para armazenar o valor que será
			// sobrescrito para não ser perdido.

			int novoElemento = intArray[primeiroIndexDesordenado];

			// Declaramos a variável (i) fora do FOR porque ela será usada também depois
			// do loop.

			int i;

			// O próximo FOR ira fazer atravessar o Array e buscar pelas posições corretas
			// para a inserção dos elementos.

			for (i = primeiroIndexDesordenado; i > 0 && intArray[i - 1] > novoElemento; i--) {

				// Neste ponto estamos fazendo a troca de elementos da direita para esquerda.

				intArray[i] = intArray[i - 1];
			}

			// Aqui estaremos atribuindo o menor valor encontrado na interação da array até
			// o momento.

			intArray[i] = novoElemento;

		}

		// Impressão feita, apos a ordenação de valores.

		System.out.println(java.util.Arrays.toString(intArray));

		// O Insertion Sort é uma algorítimo de busca de complexidade quadrática,
		// O(n^2), porem ele não vai precisar da função para trocar os elementos de
		// posição.

	}

}
