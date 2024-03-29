import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        double num1 = ler.nextDouble();
        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        double num2 = ler.nextDouble();
        System.out.println("Seu salário no mês é: R$ " + num1*num2);
        
        ler.close();
    }
}
