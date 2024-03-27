import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            lista[i] = leitor.nextInt();
        }

        for (int num : lista) {
            System.out.print(num + " ");
        }
        
        leitor.close();
    }
}