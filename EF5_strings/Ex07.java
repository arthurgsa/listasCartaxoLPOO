import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o seu nome: ");
        String nome = ler.nextLine();

       System.out.println(nome.charAt(0));
                
        ler.close();
    }
}

