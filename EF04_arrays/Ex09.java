import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o valor do modelo " + (i+1) + ": ");
            lista[i] = leitor.nextDouble();
        }

        for (int i = 0; i < lista.length; i++) {
            if (i < lista.length - 1) {
                System.out.print("Á vista " + (i+1) + ": " + lista[i]*0.95 + ", ");
                System.out.print("Crédito " + (i+1) + ": " + lista[i]*1.05 + "\n");
            } else {
                System.out.print("Á vista " + (i+1) + ": " + lista[i]*0.95 + ", ");
                System.out.print("Crédito " + (i+1) + ": " + lista[i]*1.05);
            }
        }

        leitor.close();
    }
}