import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num1 = ler.nextInt();
        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num2 = ler.nextInt();
        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num3 = ler.nextInt();
        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num4 = ler.nextInt();
        System.out.print("A média do aluno é: " + (num1 + num2 + num3 + num4)/4);

        ler.close();
    }
}
