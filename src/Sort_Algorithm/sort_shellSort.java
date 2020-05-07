package Sort_Algorithm;

public class sort_shellSort {
	public static void main(String[] args) {

		int intArray[] = { 3, -3, -6, 2, 11, 1, 9 };

		// O primeiro la�o FOR vai iterar com apenas matade da Array.
		// E depois ela sera dividida mais uma vez

		for (int intervalo = intArray.length / 2; intervalo > 0; intervalo /= 2) {

			for (int i = intervalo; i < intArray.length; i++) {
				int novoElemento = intArray[i];

				// A vari�vel (j) irar percorrer.

				int j = i;

				while (j >= intervalo && intArray[j - intervalo] > novoElemento) {
					intArray[j] = intArray[j - intervalo];
					j -= intervalo;

				}

				intArray[j] = novoElemento;
			}

		}

		// Impress�o feita, apos a ordena��o de valores.

		System.out.println(java.util.Arrays.toString(intArray));

		// � dif�cil de dizer a sua complexidade de tempo porque ela depende do
		// intervalo. No pior caso sera O(n^2), mas em alguns casos ela pode performar
		// muito melhor. E n�o requerer tantas trocas de posi��o de elementos.

	}
}
