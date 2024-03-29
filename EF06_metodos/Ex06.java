import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a senha: ");
        String senha = leitor.next();
        System.out.print("Insira a quantidade de caracteres: ");
        int qntChar = leitor.nextInt();

        if (senhaValida(senha, qntChar)){
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }
        
        leitor.close();
    }

    public static boolean senhaValida(String senha, int qntChar) {
        return senha.length() >= qntChar;
    }
}