import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira seu ano de início: ");
        String numero = ler.nextLine();
        int numConvertido = Integer.valueOf(numero);
        System.out.println("O ano de conclusão é: " + (numConvertido+3));

        ler.close();
    }
}

