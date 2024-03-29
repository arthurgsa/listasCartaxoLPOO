import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        double num1 = ler.nextDouble();
        System.out.print("Esse valor em centimentos é: " + (num1*100));
        
        ler.close();
    }
}
