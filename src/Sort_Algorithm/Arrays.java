package Sort_Algorithm;

public class Arrays {

	public static void main(String[] args) {

		// Criando um Array de inteiros com 7 posições

		int[] intArray = new int[7];

		// Atribuindo valores em cada índice.

		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		// Interando cada índice com um FOREACH e imprimindo os valores.

		for (int i : intArray) {
			System.out.print(i + " ");
		}

		System.out.println("");
		System.out.println("");

		// Uma array de inteiros ocupa 4 bytes.
		// Neste exemplo, 12 é o endereço do começo da Array.

		for (int i = 0; i < intArray.length; i++) {
			int address = 12 + (i * 4);
			System.out.println("Endereço da Array[" + i + "] = " + address);
		}

		System.out.println("");

		// Arrays são excelentes quando se sabe a posição do número que se quer buscar.
		// Então podemos dizer que a complexidade desse algoritmo é constante ou O(1).

		System.out.println("Buscar pelo Valor 55 que está no índice 4");
		System.out.println("");
		System.out.println(intArray[4]);

		System.out.println("");

		// Agora vamos buscar por um número na array sem saber o seu índice.
		// Vamos buscar pelo número 7.

		int index = -1;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 7) {
				index = i;
				break;
			}
		}

		System.out.println("Index = " + index);

		// Quando não sabemos em qual índice o número se encontra, temos que levar em
		// consideração o pior caso possível.
		// Então a medida que a Array aumenta de elementos, a busca pelo número que
		// quermos encontrar também é impactada,
		// tornando assim a busca em linear, quanto maior a array maior o tempo de
		// busca, podemos dizer então que ela seja
		// O(n)

	}
}
