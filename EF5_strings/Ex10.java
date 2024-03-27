import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome do livro: ");
        System.out.println(ler.nextLine().toUpperCase());
        
        ler.close();
    }
}

