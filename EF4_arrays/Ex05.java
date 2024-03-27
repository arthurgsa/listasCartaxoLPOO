import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[10];
        double maiorValor = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o " + (i+1) + "º número:");
            lista[i] = leitor.nextDouble();
            if (lista[i] > maiorValor) {
                maiorValor = lista[i];
            }
        }
        for (int i = 0; i < lista.length; i++) {
            lista[i] /= maiorValor;
            if (i < lista.length - 1) {
                System.out.print(lista[i] + ", ");
            } else {
                System.out.print(lista[i] + ".");
            }
        }
        
        leitor.close();
    }
}