import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[6];
        int leitura = 7;
        int idMaisVotos = 0;
        String[] servers = {"Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};

        while (leitura != 0) {
            System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
            leitura = leitor.nextInt();

            

            if (leitura >= 1 && leitura <= 6) {
                lista[leitura-1]++; // aumenta 1 voto do server escolhido

                if (lista[leitura-1] >= lista[idMaisVotos]) { // testa se o server atual tem mais votos que o atual server com mais votos
                    idMaisVotos = leitura-1; // troca o id do server com mais votos
                }
            } else if (leitura == 0) {

            } else {
                System.out.println("Valor inválido. Insira um valor válido.");
            }
        }

        int somaVotos = 0;
        for (int votos : lista) {
            somaVotos += votos;
        }        

        System.out.println("Sistema Operacional   Votos      %");
        System.out.println("-------------------   --------   ---");
        System.out.println("Windows Server        " + lista[0] + "          " + (Double.valueOf(lista[0])/somaVotos)*100 + "%");
        System.out.println("Unix                  " + lista[1] + "          " + (Double.valueOf(lista[1])/somaVotos)*100 + "%");
        System.out.println("Linux                 " + lista[2] + "          " + (Double.valueOf(lista[2])/somaVotos)*100 + "%");
        System.out.println("Netware               " + lista[3] + "          " + (Double.valueOf(lista[3])/somaVotos)*100 + "%");
        System.out.println("Mac OS                " + lista[4] + "          " + (Double.valueOf(lista[4])/somaVotos)*100 + "%");
        System.out.println("Outro                 " + lista[5] + "          " + (Double.valueOf(lista[5])/somaVotos)*100 + "%");
        System.out.println("-------------------   --------   ---");
        System.out.println("Total                 " + somaVotos + "\n");
        System.out.println("O Sistema Operacional mais votado foi o \"" + servers[idMaisVotos] + "\", com " + lista[idMaisVotos] + " votos, correspondendo a " + (Double.valueOf(lista[idMaisVotos])/somaVotos)*100 + "% dos votos.");
        
        leitor.close();

       
    }
}