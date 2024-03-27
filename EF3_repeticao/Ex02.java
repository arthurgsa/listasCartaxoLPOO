import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota = 0;

        do {
            System.out.print("Digite uma nota entre zero e dez: ");
            nota = ler.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota: " + nota);

        ler.close();
    }
}
