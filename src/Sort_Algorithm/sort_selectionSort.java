package Sort_Algorithm;

public class sort_selectionSort {

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
		int intArray[] = { 77, -1, -6, 13, 3, 9, 2 };

		// Implementando o primeiro laço FOR para poder comparar o índice atual com o
		// próximo da lista.

		for (int ultimoIndexNaoOrdenado = intArray.length - 1; ultimoIndexNaoOrdenado > 0; ultimoIndexNaoOrdenado--) {

			// Variável (maior) que vai receber o maior número da array caso esteja dentro
			// de alguma certa condição, veremos mais abaixo.

			int maior = 0;

			// Laço FOR interno, ele serve para comparar os índices com o do laço FOR acima.
			// Diferente do Bubble Sort, esse laço FOR ele é inclusivo, ou seja, ele também
			// vai comparar sempre a última posição do índice, por isso ele é
			// (i <= ultimoIndexNaoOrdenado).

			for (int i = 0; i <= ultimoIndexNaoOrdenado; i++) {

				// Condicional IF, aonde iremos comparar o índice (intArray[i]) com o índice
				// (intArray[maior]), e caso o índice (intArray[i]) for o maior (>>)
				// a variável (maior) vai
				// receber o valor de (i).

				if (intArray[i] > intArray[maior])

					maior = i;

			}
			// Apos a interação, iremos fazer a troca do ULTIMO elemento da array, com o
			// maior valor encontrando,
			// que estará armazenado na variável (maior).
			troca(intArray, maior, ultimoIndexNaoOrdenado);
		}

		// Impressão feita, apos a ordenação de valores.

		System.out.println(java.util.Arrays.toString(intArray));

		// O Selection Sort também é uma algorítimo de busca de complexidade quadrática,
		// O(n^2), porem ele precisa fazer bem menos troca que o Bubble Sort.
	}

}
