import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num1 = ler.nextInt();
        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num2 = ler.nextInt();
        System.out.print("A soma é: " + (num1 + num2));

        ler.close();
    }
}
