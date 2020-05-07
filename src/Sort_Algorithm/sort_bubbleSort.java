package Sort_Algorithm;

public class sort_bubbleSort {

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

		int intArray[] = { 99, 12, 31, -8, -3, 1, 10 };

		// Implementando o primeiro la�o FOR para poder comparar o �ndice atual com o
		// pr�ximo da lista.

		for (int ultimoIndexNaoOrdenado = intArray.length - 1; ultimoIndexNaoOrdenado > 0; ultimoIndexNaoOrdenado--) {

			// La�o FOR interno, ele serve para comparar os �ndices com o do la�o FOR acima.

			for (int i = 0; i < ultimoIndexNaoOrdenado; i++) {

				// Condicional IF que compara o �ndice atual do primeiro FOR com o segundo FOR,
				// e confirma se s�o maiores, menores ou iguais.

				if (intArray[i] > intArray[i + 1])

					// Caso o indicie atual (intArray[i]) seja maior que o pr�ximo �ndice
					// (intArray[i +1]) sera usada a fun��o troca, para remanejar seus valores.

					troca(intArray, i, i + 1);

			}

		}

		// Bubble Sorte � quadr�tico, porque dentro de sua implementa��o ele tera dois
		// la�os FOR para poder remanejar todos os seus elementos, tornando-o assim um
		// algor�timo ineficiente em rela��o ao tempo de execu��o.
		// O(n^2).

		// Impress�o feita, apos a ordena��o de valores.

		System.out.println(java.util.Arrays.toString(intArray));

	}

}
