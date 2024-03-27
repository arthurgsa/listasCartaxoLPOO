import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o número 1: ");
        int num1 = ler.nextInt();
        System.out.print("Insira o número 2: ");
        int num2 = ler.nextInt();
        System.out.print("Insira o número 3: ");
        int num3 = ler.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.print("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print("O maior número é: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.print("O maior número é: " + num3);
        }

        ler.close();
    }
    
}
