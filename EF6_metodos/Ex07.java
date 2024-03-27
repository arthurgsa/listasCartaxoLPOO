import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] nums = new double[6];
        for (int i = 0; i < nums.length; i++){
            System.out.println("Insira o " + (i+1) + "º número: ");
            nums[i] = leitor.nextDouble();
        }

        System.out.println("A soma do 1º com o 2º é: " + soma(nums[0], nums[1]));
        System.out.println("A soma do 3º com o 4º é: " + soma(nums[2], nums[3]));
        System.out.println("A soma do 5º com o 6º é: " + soma(nums[4], nums[5]));

        leitor.close();
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
}