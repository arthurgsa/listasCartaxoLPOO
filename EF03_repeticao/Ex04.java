import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int maior = 0;

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite um número: ");
            int num = ler.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);

        ler.close();
    }
}
