import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] qntsVendidas = new double[3];

        System.out.println("Insira a quantidade de latas de 350ml: ");
        qntsVendidas[0] = leitor.nextDouble();
        System.out.println("Insira a quantidade de garrafas de 600ml: ");
        qntsVendidas[1] = leitor.nextDouble();
        System.out.println("Insira a quantidade de garrafas de 2l: ");
        qntsVendidas[2] = leitor.nextDouble();
        
        System.out.println("O volume total em litros é: " + litrosTotal(qntsVendidas));

        leitor.close();
    }

    public static double litrosTotal(double[] qntsVendidas) {
        return qntsVendidas[0]*0.35 + qntsVendidas[1]*0.6 + qntsVendidas[1]*2;
    }
}