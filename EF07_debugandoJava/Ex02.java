import java.util.Scanner;

public class Ex02 {
	public static void main (String [] args){
        Scanner leitor =  new Scanner (System.in);
            
        System.out.println ("Escreva um numero: ");
        int num = leitor.nextInt();

        if (num < 50){
            System.out.println ("Numero maior que 50");
        } else {
            System.out.println ("Numero menor que 50");
        }
    }
}

/* EXERCÍCIO RESOLVIDO: 
O TESTE ESTÁ COM O OPERADOR ERRADO. O CORRETO SERIA: if "(num > 50)"

-- CORREÇÃO:

import java.util.Scanner;

public class Ex02 {
	public static void main (String [] args){
        Scanner leitor =  new Scanner (System.in);
            
        System.out.println ("Escreva um numero: ");
        int num = leitor.nextInt();

        if (num > 50){
            System.out.println ("Numero maior que 50");
        } else {
            System.out.println ("Numero menor que 50");
        }
    }
}

*/