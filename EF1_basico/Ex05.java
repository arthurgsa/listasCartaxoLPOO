import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: (Número máximo: (2^31 - 1): ");
        int num1 = ler.nextInt();
        System.out.print("A quantidade de ferraduras é: " + (num1*4));
        
        ler.close();
    }
    
}
