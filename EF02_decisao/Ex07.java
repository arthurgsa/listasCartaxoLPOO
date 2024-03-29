import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int perguntasPositivas = 0;
        int resp = 0;
        System.out.println("Telefonou para a vítima? \n0 - Não / 1 - Sim");
        resp = ler.nextInt();
        if (resp == 1) {
            perguntasPositivas++;
        }
        System.out.println("Esteve no local do crime? \n0 - Não / 1 - Sim");
        resp = ler.nextInt();
        if (resp == 1) {
            perguntasPositivas++;
        }
        System.out.println("Mora perto da vítima? \n0 - Não / 1 - Sim");
        resp = ler.nextInt();
        if (resp == 1) {
            perguntasPositivas++;
        }
        System.out.println("Devia para a vítima? \n0 - Não / 1 - Sim");
        resp = ler.nextInt();
        if (resp == 1) {
            perguntasPositivas++;
        }
        System.out.println("Já trabalhou com a vítima? \n0 - Não / 1 - Sim");
        resp = ler.nextInt();
        if (resp == 1) {
            perguntasPositivas++;
        }

        String classificacao = "Assassino";
        if (perguntasPositivas < 2) {
            classificacao = "Inocente";
        } else if (perguntasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (perguntasPositivas <= 4) {
            classificacao = "Cúmplice";
        }

        System.out.println("A pessoa é: " + classificacao);

        ler.close();
    }
    
}
