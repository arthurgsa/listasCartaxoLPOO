import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o número do canal: ");
        int numCanal = ler.nextInt();

        switch (numCanal) {
            case 2:
                System.out.println("SBT");
                break;
            case 4:
                    System.out.println("BAND");
                    break;
            case 6:
                System.out.println("RedeTV!");
                break;
            case 9:
                System.out.println("Record");
                break;
            case 13:
                System.out.println("Globo");
                break;
            default:
                System.out.println("Canal inválido");
                break;
            }

        ler.close();
    }
    
}
