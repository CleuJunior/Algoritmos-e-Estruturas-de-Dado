package Sort_Algorithm;

public class sort_insertionSort {

	public static void main(String[] args) {
		int[] intArray = { 8, 4, 1, 5, 9, 0, 6, 3, 7, 2 };

		// N�s n�o iremos precisar da fun��o (troca) neste algoritmo.
		// Ao inv�s de come�armos do �ndice 0 (zero) em Insertion Sort n�s come�aremos a
		// partir do segundo �ndice (1).

		for (int primeiroIndexDesordenado = 1; primeiroIndexDesordenado < intArray.length; primeiroIndexDesordenado++) {

			// A vari�vel (novoElemento) foi criada para armazenar o valor que ser�
			// sobrescrito para n�o ser perdido.

			int novoElemento = intArray[primeiroIndexDesordenado];

			// Declaramos a vari�vel (i) fora do FOR porque ela ser� usada tamb�m depois
			// do loop.

			int i;

			// O pr�ximo FOR ira fazer atravessar o Array e buscar pelas posi��es corretas
			// para a inser��o dos elementos.

			for (i = primeiroIndexDesordenado; i > 0 && intArray[i - 1] > novoElemento; i--) {

				// Neste ponto estamos fazendo a troca de elementos da direita para esquerda.

				intArray[i] = intArray[i - 1];
			}

			// Aqui estaremos atribuindo o menor valor encontrado na intera��o da array at�
			// o momento.

			intArray[i] = novoElemento;

		}

		// Impress�o feita, apos a ordena��o de valores.

		System.out.println(java.util.Arrays.toString(intArray));

		// O Insertion Sort � uma algor�timo de busca de complexidade quadr�tica,
		// O(n^2), porem ele n�o vai precisar da fun��o para trocar os elementos de
		// posi��o.

	}

}
