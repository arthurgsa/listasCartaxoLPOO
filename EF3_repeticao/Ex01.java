import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 0;
        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();

            if (numero >= 0) {
                System.out.println(numero + " ");
            }
        }
        ler.close();
    }
}
