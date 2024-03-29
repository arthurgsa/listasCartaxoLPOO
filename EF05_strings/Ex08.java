import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o seu nome e sobrenome separado por espaço: ");
        String nome = ler.nextLine();

       System.out.println(nome.substring(nome.indexOf(" ")+1, nome.length()));
                
        ler.close();
    }
}

