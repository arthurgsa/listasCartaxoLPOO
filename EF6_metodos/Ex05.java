import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        double num1 = leitor.nextDouble();
        System.out.print("Insira outro número: ");
        double num2 = leitor.nextDouble();
        System.out.print("Insira mais outro número: ");
        double num3 = leitor.nextDouble();
        
        if (ehIgualAoTerceiro(num1, num2, num3)) {
            System.out.println("A soma É IGUAL");
        } else {
            System.out.println("A soma NÃO É IGUAL.");
        }
        
        leitor.close();
    }

    public static boolean ehIgualAoTerceiro(double num1, double num2, double num3) {
        return num1 + num2 == num3;
    }
}