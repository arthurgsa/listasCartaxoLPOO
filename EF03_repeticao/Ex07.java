import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = ler.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = ler.nextInt();

        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);

        ler.close();
    }
}
