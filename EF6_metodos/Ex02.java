import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a senha: ");
        String senha = leitor.next();

        if (senhaValida(senha)){
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }
        
        leitor.close();
    }

    public static boolean senhaValida(String senha) {
        return senha.length() >= 8;
    }
}