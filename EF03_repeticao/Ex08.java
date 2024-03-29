import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a resposta da questão " + i + ": ");
            String resposta = ler.next();

            switch (resposta) {
                case "A":
                    if (i == 1 || i == 10) {
                        nota++;
                    }
                    break;
                case "B":
                    if (i == 2 || i == 9) {
                        nota++;
                    }
                    break;
                case "C":
                    if (i == 3 || i == 8) {
                        nota++;
                    }
                    break;
                case "D":
                    if (i == 4 || i == 7) {
                        nota++;
                    }
                    break;
                case "E":
                    if (i == 5 || i == 6) {
                        nota++;
                    }
                    break;
                default:
                    System.out.println("Resposta inválida.");
                    i--;
                    break;
            }
        }

        System.out.println("Nota: " + nota);

        ler.close();
    }
}
