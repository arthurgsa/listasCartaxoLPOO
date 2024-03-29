import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o canal: ");
		int canal = leitor.nextInt();
		
		switch (canal) {
		case 2:
			System.out.println("SBT");
		case 4:
			System.out.println("BAND");
		case 6:
			System.out.println("REDETV!");
		case 9:
			System.out.println("RECORD");
		case 13:
			System.out.println("GLOB0");
		default:
			System.out.println("Canal Inválido");
		}
	}
}

/* 
EXERCÍCIO RESOLVIDO:
Não há a utilização do "break" em nenhum case.

-- CORREÇÃO:

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o canal: ");
		int canal = leitor.nextInt();
		
		switch (canal) {
		case 2:
			System.out.println("SBT");
			break;
		case 4:
			System.out.println("BAND");
			break;
		case 6:
			System.out.println("REDETV!");
			break;
		case 9:
			System.out.println("RECORD");
			break;
		case 13:
			System.out.println("GLOB0");
			break;
		default:
			System.out.println("Canal Inválido");
		}
	}
}
 */
