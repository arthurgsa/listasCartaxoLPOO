import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] alturas = new double[5];
        int[] idades = new int[5];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Insira a idade da pessoa " + (i+1) + ": ");
            idades[i] = leitor.nextInt();
            System.out.print("Insira a altura da pessoa " + (i+1) + ": ");
            alturas[i] = leitor.nextDouble();
        }

        for (int i = alturas.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print("Altura " + (i+1) + ": " + alturas[i] + ", ");
                System.out.print("Idade " + (i+1) + ": " + idades[i] + "\n");
            } else {
                System.out.print("Altura " + (i+1) + ": " + alturas[i] + ", ");
                System.out.print("Idade " + (i+1) + ": " + idades[i]);
            }
        }
        
        leitor.close();
    }
}