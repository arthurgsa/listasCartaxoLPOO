import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o preço do ingresso: R$ ");
        double preco = ler.nextDouble();
        System.out.print("Insira o dia: (1 - Domingo, 2 - Segunda, etc): ");
        int dia = ler.nextInt();
        System.out.print("Insira sua idade: ");
        int idade = ler.nextInt();

        float porcentAPagar = 1;
        
        if (idade < 14) {
            porcentAPagar -= 0.5;
        }
        if (dia == 3) {
            porcentAPagar -= 0.5;
        }

        System.out.println("O valor a pagar é: R$ " + (preco*porcentAPagar));

        ler.close();
    }
    
}
