import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[30];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            lista[i] = leitor.nextDouble();
        }

        for (int i = 0; i < lista.length; i++) {
            if (i % 2 != 0) {
                System.out.print(lista[i] + " ");
            }
        }
        
        leitor.close();
    }
}