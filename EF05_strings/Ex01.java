import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome da pessoa 1:");
        String nome1 = ler.nextLine();
        System.out.println("Insira o nome da pessoa 2:");
        String nome2 = ler.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Possuem o mesmo nome.");
        } else {
            System.out.println("Não possuem o mesmo nome.");
        }

        ler.close();
    }
}

