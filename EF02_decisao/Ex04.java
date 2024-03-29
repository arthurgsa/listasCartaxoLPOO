import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o saldo inicial: ");
        double saldo = ler.nextDouble();
        System.out.print("Insira o valor de débitos: ");
        double debitos = ler.nextDouble();
        System.out.print("Insira o valor de créditos: ");
        double creditos = ler.nextDouble();

        double saldoFinal = saldo - debitos + creditos;

        if (saldoFinal > 0) {
            System.out.println("Saldo positivo em R$ " + saldoFinal);
        } else if (saldoFinal < 0) {
            System.out.println("Saldo negativo em R$ " + (-saldoFinal));
        } else {
            System.out.println("Saldo Zero");
        }

        ler.close();
    }
    
}
