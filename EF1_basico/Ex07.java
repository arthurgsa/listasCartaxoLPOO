import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        double num1 = ler.nextDouble();
        System.out.println("A área do quadrado é: " + (num1*num1) + " metros");
        System.out.println("O dobro da área é: "+ num1*num1*2 + " metros");
        
        ler.close();
    }
}
