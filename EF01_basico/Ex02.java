import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num = ler.nextInt();
        System.out.print("O número informado foi: " + num);
        
        ler.close();
    }
}