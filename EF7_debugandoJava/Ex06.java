import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double media = 0;
		
		for (int i = 0; i < 100; i++) {
			System.out.print("Digite um número: ");
			double numero = leitor.nextDouble();
			media = numero + numero / 100;
		}
		
		System.out.println("Média: " + media);
	}
}

/*
EXERCÍCIO RESOLVIDO:
A lógica matemática não é correta. A linha 12 precisa ser alterada para "media = MEDIA + numero / 100".

-- CORREÇÃO: 

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double media = 0;
		
		for (int i = 0; i < 100; i++) {
			System.out.print("Digite um número: ");
			double numero = leitor.nextDouble();
			media = media + numero / 100;
		}
		
		System.out.println("Média: " + media);
	}
}
 */