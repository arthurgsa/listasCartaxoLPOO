import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double[] valores = new double[3];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor " + (i + 1) + ":");
			valores[i] = leitor.nextInt();
		}

		double maior = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
		}

		double menor = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i] / maior + menor);
		}
	}

}

/*
EXERCÍCIO RESOLVIDO:
Apenas é necessário apagar este + aleatório na linha 32, corrigir a operação para soma e colocar a precedência na operação. "valores[i] / (maior + menor)".
Corrigir o texto da linha 11 ajuda a compreender o programa.

-- CORREÇÃO: 

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double[] valores = new double[1000];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor " + (i + 1) + ":");
			valores[i] = leitor.nextInt();
		}

		double maior = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
		}

		double menor = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i] / (maior + menor));
		}
	}

}
 */

