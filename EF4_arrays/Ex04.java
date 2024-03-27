import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[20];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = i*i;
        }

        for (int num : lista) {
            System.out.print(num + " ");
        }
        
        leitor.close();
    }
}