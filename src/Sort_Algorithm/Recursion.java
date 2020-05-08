package Sort_Algorithm;

public class Recursion {

	public static void main(String[] args) {

		// Implementando o fatorial de um número com um laço For.

		int fatorial = 7;
		int fatorialFor = 1;

		for (int i = fatorial; i > 0; i--) {

			fatorialFor *= i;
		}

		int fatorialRecursivo = 7;

		System.out.println("Fatorial de " + fatorial + " feito com laço FOR: " + fatorialFor);
		System.out.println("Fatorial de " + fatorialRecursivo + " feito com um função recursiva: "
				+ recFatorial(fatorialRecursivo));

	}

	// Aqui implementamos uma função recursiva, uma função que chama ela mesma.

	public static int recFatorial(int num) {

		// A lógica por trás da função é que a cada interação ela ira diminuir 1 do
		// valor passado como parâmetro para a função, então ela chamará de novo a
		// função guardando a operação anterior no stack (pilha) até encontrar o fator
		// de parada, para não entrar em um loop infinito, sua condição é caso o
		// parâmetro passado seja ou chegue em 0. Apos a condição de parada toda a stack
		// vai sendo resolvida até chegar no resultado final.

		return (num == 0) ? 1 : num * recFatorial(num - 1);

	}

}
