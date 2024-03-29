import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        double num1 = ler.nextDouble();
        System.out.println("Seu peso ideal é: R$ " +  ((72.7*num1)-58));
        
        ler.close();
    }
}
