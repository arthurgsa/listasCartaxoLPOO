import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o saldo inicial: ");
		double saldoInicial = leitor.nextInt();
		
		System.out.print("Digite o total de debitos: ");
		double debitos = leitor.nextInt();
		
		System.out.print("Digite o total de creditos: ");
		double creditos = leitor.nextInt();
		
		double saldoFinal = saldoInicial - debitos + creditos;
		
		if (saldoFinal > 0) {
			System.out.println("Saldo positivo em R$ " + saldoFinal);
		} else {
			System.out.println("Saldo negativo em R$ " + saldoFinal);
		}
	}
}

/* 
EXERCíCIO RESOLVIDO:
Necessário adicionar a lógica para saldo 0.

-- CORREÇÃO:

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o saldo inicial: ");
		double saldoInicial = leitor.nextInt();
		
		System.out.print("Digite o total de debitos: ");
		double debitos = leitor.nextInt();
		
		System.out.print("Digite o total de creditos: ");
		double creditos = leitor.nextInt();
		
		double saldoFinal = saldoInicial - debitos + creditos;
		
		if (saldoFinal > 0) {
			System.out.println("Saldo positivo em R$ " + saldoFinal);
		} else if (saldoFinal < 0) {
			System.out.println("Saldo negativo em R$ " + saldoFinal);
		} else {
			System.out.println("Saldo Zero");
		}
	}
}
 */
