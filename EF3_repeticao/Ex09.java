import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();
        int tentativas = 0;
        int chute = 0;

        while (chute != num) {
            System.out.print("Digite um número: ");
            chute = ler.nextInt();
            tentativas++;
            if (chute > num) {
                System.out.println("Seu número é maior do que o meu");
            } else if (chute < num) {
                System.out.println("Seu número é menor do que o meu");
            }
        }

        System.out.println("Você acertou em " + tentativas + " tentativas");

        ler.close();
    }
}
