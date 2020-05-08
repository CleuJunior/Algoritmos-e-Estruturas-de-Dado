package Sort_Algorithm;

public class Recursion {

	public static void main(String[] args) {

		// Implementando o fatorial de um n�mero com um la�o For.

		int fatorial = 7;
		int fatorialFor = 1;

		for (int i = fatorial; i > 0; i--) {

			fatorialFor *= i;
		}

		int fatorialRecursivo = 7;

		System.out.println("Fatorial de " + fatorial + " feito com la�o FOR: " + fatorialFor);
		System.out.println("Fatorial de " + fatorialRecursivo + " feito com um fun��o recursiva: "
				+ recFatorial(fatorialRecursivo));

	}

	// Aqui implementamos uma fun��o recursiva, uma fun��o que chama ela mesma.

	public static int recFatorial(int num) {

		// A l�gica por tr�s da fun��o � que a cada intera��o ela ira diminuir 1 do
		// valor passado como par�metro para a fun��o, ent�o ela chamar� de novo a
		// fun��o guardando a opera��o anterior no stack (pilha) at� encontrar o fator
		// de parada, para n�o entrar em um loop infinito, sua condi��o � caso o
		// par�metro passado seja ou chegue em 0. Apos a condi��o de parada toda a stack
		// vai sendo resolvida at� chegar no resultado final.

		return (num == 0) ? 1 : num * recFatorial(num - 1);

	}

}
