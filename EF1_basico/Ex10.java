import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        double num1 = ler.nextDouble();
        double media = (5 * (num1-32) / 9);
        System.out.println("A temperatura em Celsius é: " + media + " ºC");
        System.out.printf("A temperatura em Celsius é: %.2f ºC",  media);
        
        ler.close();
    }
}
