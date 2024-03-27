import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o título do livro: ");
        String nome1 = ler.nextLine();

        if (nome1.length() > 20) {
            System.out.println("Título acima do permitido.");
        } else {
            System.out.println("Tudo certo. Título aceito.");
        }
        
        ler.close();
    }
}

