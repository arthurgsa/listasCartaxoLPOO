import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite um número: ");
            soma += ler.nextInt();
        }

        System.out.println("A média dos números é: " + (soma / 100.0));

        ler.close();
    }
}
