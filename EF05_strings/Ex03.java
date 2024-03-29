import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double numero = ler.nextDouble();
        String numString = String.valueOf(numero);
        System.out.println(numString);

        ler.close();
    }
}

