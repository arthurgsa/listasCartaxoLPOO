import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a senha: ");
        String senha = ler.nextLine();

        if (senha.trim().equalsIgnoreCase("eu amo programar")) {
            System.out.println("Acesso Liberado.");
        } else {
            System.out.println("Senha Incorreta.");
        }
                
        ler.close();
    }
}

