import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int testeFormacao = 0;
        int ladosIguais = 0;

        System.out.println("Insira o lado 1 do triângulo: ");
        double lado1 = ler.nextInt();
        System.out.println("Insira o lado 2 do triângulo: ");
        double lado2 = ler.nextInt();
        System.out.println("Insira o lado 3 do triângulo: ");
        double lado3 = ler.nextInt();

        if (lado1 + lado2 > lado3) {
            testeFormacao++;
            if (lado1 == lado2) {
                ladosIguais++;
            }
            if (lado2 + lado3 > lado1) {
                testeFormacao++;
                if (lado2 == lado3) {
                    ladosIguais++;
                }
                if (lado1 + lado3 > lado2) {
                    testeFormacao++;
                    if (lado1 == lado3) {
                        ladosIguais++;
                    }
                }
            }
        }

        String tipoTriangulo = "escaleno";
        switch (ladosIguais) {
            case 1:
                tipoTriangulo = "isósceles";
                break;
            case 3:
                tipoTriangulo = "equilátero";
                break;
        }

        if (testeFormacao == 3) {
            System.out.println("É um triângulo " + tipoTriangulo);
        } else {
            System.out.println("Não é um triângulo!");
        }

        ler.close();
    }
    
}
