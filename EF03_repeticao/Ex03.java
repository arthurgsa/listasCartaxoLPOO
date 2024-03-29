import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double maisAlto = 0;
        double maisBaixo = Double.POSITIVE_INFINITY;
        double maisGordo = 0;
        double maisMagro = Double.POSITIVE_INFINITY;
        int codAtual = -1;
        int codMaisAlto = 0;
        int codMaisBaixo = 0;
        int codMaisGordo = 0;
        int codMaisMagro = 0;

        while (codAtual != 0) {
            System.out.println("Qual o seu código?");
            codAtual = ler.nextInt();

            if (codAtual != 0) {
                double peso;
                double altura;

                System.out.println("Insira seu peso: ");
                peso = ler.nextDouble();
                System.out.println("Insira sua altura:");
                altura = ler.nextDouble();

                if (peso > maisGordo) {
                    codMaisGordo = codAtual;
                    maisGordo = peso;
                }
                if (peso < maisMagro) {
                    codMaisMagro = codAtual;
                    maisMagro = peso;
                }
                if (altura > maisAlto) {
                    codMaisAlto = codAtual;
                    maisAlto = altura;
                }
                if (altura < maisBaixo) {
                    codMaisBaixo = codAtual;
                    maisBaixo = altura;
                }
            }
        }

        System.out.println("O mais alto é o de código " + codMaisAlto + " com " + maisAlto + "m");
        System.out.println("O mais baixo é o de código " + codMaisBaixo + " com " + maisBaixo + "m");
        System.out.println("O mais gordo é o de código " + codMaisGordo + " com " + maisGordo + "kg");
        System.out.println("O mais magro é o de código " + codMaisMagro + " com " + maisMagro + "kg");

        ler.close();
    }
}
