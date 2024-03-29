import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        double num = leitor.nextDouble();
        System.out.println("O número elevado a 4 é: " + elevadoA4(num));

        leitor.close();
    }

    public static double elevadoA4(double num) {
        double res = 1;
        for (int i = 1 ; i <= 4 ; i++) {
            res *= num;
        }

        return res;
    }
}