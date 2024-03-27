import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = leitor.nextInt();
        System.out.println("O número vezes 10 é: " + vezes10(num));

        leitor.close();
    }

    public static int vezes10(int num) {
        return num*10;
    }
}