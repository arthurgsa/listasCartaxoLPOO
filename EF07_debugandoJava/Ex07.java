import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade[] = new int[50];

		for (int i = 0; i < idade.length; i++) {

			System.out.println("Digite sua idade");
			idade[i] = leitor.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (idade[i] >= 18) {
				System.out.println(idade[i]);
			}

		}
	}
}

/*
EXERCÍCIO RESOLVIDO:
o segundo for não percorre todo o array idade, apenas os 5 primeiros valores. A condição do segundo for precisa ser alterada para "i < idade.length".

-- CORREÇÃO: 

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade[] = new int[50];

		for (int i = 0; i < idade.length; i++) {

			System.out.println("Digite sua idade");
			idade[i] = leitor.nextInt();
		}

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] >= 18) {
				System.out.println(idade[i]);
			}

		}
	}
}
 */