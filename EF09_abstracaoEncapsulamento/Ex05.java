public class Ex05 {
  public static void main(String[] args) {
    System.out.println("");

    Contato contatoJoao = new Contato("João");
    Contato contatoMaria = new Contato("Maria");

    contatoJoao.enviarMensagem(contatoMaria, "Oi, Maria!");

    contatoJoao.imprimirQntMensagensRecebidasNaoLidas();
    contatoMaria.imprimirQntMensagensRecebidasNaoLidas();

    contatoJoao.receberMensagem(contatoMaria, "Oi, João!");
    contatoJoao.receberMensagem(contatoMaria, "Tudo bem?");
    contatoJoao.receberMensagem(contatoMaria, "Vamos sair hoje?");
    contatoJoao.receberMensagem(contatoMaria, "Estou com saudades!");
    contatoJoao.receberMensagem(contatoMaria, "Me liga!");

    contatoJoao.imprimirQntMensagensRecebidasNaoLidas();
    contatoMaria.imprimirQntMensagensRecebidasNaoLidas();

    contatoJoao.lerTodasMensagens();

    contatoJoao.imprimirQntMensagensRecebidasNaoLidas();
    contatoMaria.imprimirQntMensagensRecebidasNaoLidas();

  }
}