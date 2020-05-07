package Sort_Algorithm;

public class sort_selectionSort {

	// Metodo para comparar os elementos, e caso o elemento A for maior que o
	// elemento B, eles ser�o trocados de posi��o.

	public static void troca(int[] array, int i, int j) {
		if (i == j)
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void main(String[] args) {
		int intArray[] = { 77, -1, -6, 13, 3, 9, 2 };

		// Implementando o primeiro la�o FOR para poder comparar o �ndice atual com o
		// pr�ximo da lista.

		for (int ultimoIndexNaoOrdenado = intArray.length - 1; ultimoIndexNaoOrdenado > 0; ultimoIndexNaoOrdenado--) {

			// Vari�vel (maior) que vai receber o maior n�mero da array caso esteja dentro
			// de alguma certa condi��o, veremos mais abaixo.

			int maior = 0;

			// La�o FOR interno, ele serve para comparar os �ndices com o do la�o FOR acima.
			// Diferente do Bubble Sort, esse la�o FOR ele � inclusivo, ou seja, ele tamb�m
			// vai comparar sempre a �ltima posi��o do �ndice, por isso ele �
			// (i <= ultimoIndexNaoOrdenado).

			for (int i = 0; i <= ultimoIndexNaoOrdenado; i++) {

				// Condicional IF, aonde iremos comparar o �ndice (intArray[i]) com o �ndice
				// (intArray[maior]), e caso o �ndice (intArray[i]) for o maior (>>)
				// a vari�vel (maior) vai
				// receber o valor de (i).

				if (intArray[i] > intArray[maior])

					maior = i;

			}
			// Apos a intera��o, iremos fazer a troca do ULTIMO elemento da array, com o
			// maior valor encontrando,
			// que estar� armazenado na vari�vel (maior).
			troca(intArray, maior, ultimoIndexNaoOrdenado);
		}

		// Impress�o feita, apos a ordena��o de valores.

		System.out.println(java.util.Arrays.toString(intArray));

		// O Selection Sort tamb�m � uma algor�timo de busca de complexidade quadr�tica,
		// O(n^2), porem ele precisa fazer bem menos troca que o Bubble Sort.
	}

}
