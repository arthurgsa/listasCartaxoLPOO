import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[12];
        double somaPreco = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o valor do " + (i+1) + "º mês: ");
            lista[i] = leitor.nextDouble();
            somaPreco += lista[i];
        }
        
        System.out.println("A média do preço no ano foi: " + somaPreco/12);
        
        leitor.close();
    }
}