import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o salário do colaborador: R$ ");
        double salario = ler.nextDouble();
        
        double percAumento = 0;
        if (salario <= 280) {
            percAumento = 0.2; 
        } else if (salario <= 700) {
            percAumento = 0.15;
        } else if (salario <= 1500) {
            percAumento = 0.1;
        } else {
            percAumento = 0.05;
        }

        System.out.println("O salário antes do reajuste é: R$ " + salario);
        System.out.println("O percentual de aumento aplicado é: " + percAumento*100 + "%");
        System.out.println("O valor do aumento é: R$ " + salario*percAumento);
        System.out.println("O novo salário é: R$ " + salario*(1+percAumento));

        ler.close();
    }
    
}
