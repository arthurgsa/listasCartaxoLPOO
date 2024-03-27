import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("digite um numero( < 0 para sair)");
		double num = leitor.nextDouble();

		while (num > 0) {
			System.out.print(num * 2);
		}
	}
}

/*
EXERCÍCIO RESOLVIDO:
A variável num precisa ser inicializada com um valor maior que 0 e a impressão de "digite um numero" e leitura de número precisa estar dentro do while.

-- CORREÇÃO:

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double num = 1;

		while (num > 0) {
			System.out.println("digite um numero( < 0 para sair)");
			num = leitor.nextDouble();
			System.out.print(num * 2);
		}
	}
}

 */