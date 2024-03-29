import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[30];
        double maiorValor = Double.NEGATIVE_INFINITY;
        int diaDoMes = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o valor do " + (i+1) + "º dia: ");
            lista[i] = leitor.nextDouble();
            if (lista[i] > maiorValor) {
                maiorValor = lista[i];
                diaDoMes = i+1;
            }
        }
        System.out.println("O maior volume de carros foi: " + maiorValor + ". O dia do mês foi: " + diaDoMes);
        
        leitor.close();
    }
}