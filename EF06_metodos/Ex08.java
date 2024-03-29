import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = leitor.next();
        boasVindas(nome);
        leitor.close();
    }

    public static void boasVindas(String nome) {
        System.out.println("Bem vindo " + nome + "!");
    }
}