import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome da pessoa 1: ");
        String nome1 = ler.nextLine();
        System.out.println("Insira o nome da pessoa 1: ");
        String nome2 = ler.nextLine();

        int valor = nome1.toLowerCase().compareTo(nome2.toLowerCase());

        if (valor < 0) {
            System.out.println(nome1 + "\n" + nome2);
        } else if (valor == 0) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println(nome2 + "\n" + nome1);
        }

        ler.close();
    }
}

