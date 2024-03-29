import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o peso do prato: ");
        double peso = leitor.nextDouble();
        
        System.out.println("O valor a pagar é: R$ " + valorPrato(peso));

        leitor.close();
    }

    public static double valorPrato(double peso) {
        return peso*12;
    }
}