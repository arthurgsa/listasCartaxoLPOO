import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[10];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            lista[i] = leitor.nextDouble();
        }

        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.print(lista[i] + " ");
        }
        
        leitor.close();
    }
}