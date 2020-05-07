package Sort_Algorithm;

public class sort_bubbleSort {

	// Metodo para comparar os elementos, e caso o elemento A for maior que o
	// elemento B, eles serão trocados de posição.

	public static void troca(int[] array, int i, int j) {
		if (i == j)
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void main(String[] args) {

		int intArray[] = { 99, 12, 31, -8, -3, 1, 10 };

		// Implementando o primeiro laço FOR para poder comparar o índice atual com o
		// próximo da lista.

		for (int ultimoIndexNaoOrdenado = intArray.length - 1; ultimoIndexNaoOrdenado > 0; ultimoIndexNaoOrdenado--) {

			// Laço FOR interno, ele serve para comparar os índices com o do laço FOR acima.

			for (int i = 0; i < ultimoIndexNaoOrdenado; i++) {

				// Condicional IF que compara o índice atual do primeiro FOR com o segundo FOR,
				// e confirma se são maiores, menores ou iguais.

				if (intArray[i] > intArray[i + 1])

					// Caso o indicie atual (intArray[i]) seja maior que o próximo índice
					// (intArray[i +1]) sera usada a função troca, para remanejar seus valores.

					troca(intArray, i, i + 1);

			}

		}

		// Bubble Sorte é quadrático, porque dentro de sua implementação ele tera dois
		// laços FOR para poder remanejar todos os seus elementos, tornando-o assim um
		// algorítimo ineficiente em relação ao tempo de execução.
		// O(n^2).

		// Impressão feita, apos a ordenação de valores.

		System.out.println(java.util.Arrays.toString(intArray));

	}

}
