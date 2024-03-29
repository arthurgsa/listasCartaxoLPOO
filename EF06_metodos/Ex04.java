import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        double num1 = leitor.nextDouble();
        System.out.print("Insira outro número: ");
        double num2 = leitor.nextDouble();
        System.out.println("O subtração é: " + subtracao(num1, num2));

        leitor.close();
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
}