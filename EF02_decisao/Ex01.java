import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o número 1: ");
        int num1 = ler.nextInt();
        System.out.print("Insira o número 2: ");
        int num2 = ler.nextInt();

        if (num1 > num2) {
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }

        ler.close();
    }
    
}
