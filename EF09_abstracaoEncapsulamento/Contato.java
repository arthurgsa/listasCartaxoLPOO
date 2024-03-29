public class Contato {
  private String nome;
  private int qntMensagensRecebidasNaoLidas;
  private String[] mensagensRecebidas = new String[100];
  private String[] nomeMensagemRecebidas = new String[100];

  public Contato(String nome) {
    this.nome = nome;
    this.qntMensagensRecebidasNaoLidas = 0;
  }

  public void imprimir() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Quantidade de mensagens recebidas não lidas: " + this.qntMensagensRecebidasNaoLidas);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQntMensagensRecebidasNaoLidas() {
    return qntMensagensRecebidasNaoLidas;
  }

  public void setQntMensagensRecebidasNaoLidas(int qntMensagensRecebidasNaoLidas) {
    this.qntMensagensRecebidasNaoLidas = qntMensagensRecebidasNaoLidas;
  }

  public void enviarMensagem(Contato contato, String mensagem) {
    contato.armazenarMensagem(mensagem, this.getNome());
    System.out.println("-- Mensagem enviada com sucesso!");
  }

  public void receberMensagem(Contato contato, String mensagem) {
    this.armazenarMensagem(mensagem, contato.getNome());
    System.out.println("-- Mensagem recebida com sucesso!");
  }

  public void armazenarMensagem(String mensagem, String nome) {
    int idMensagem = this.qntMensagensRecebidasNaoLidas;
    this.nomeMensagemRecebidas[idMensagem] = nome;
    this.mensagensRecebidas[idMensagem] = mensagem;
    this.qntMensagensRecebidasNaoLidas++;
  }

  public void lerTodasMensagens() {
    for (int i = 0; i < this.qntMensagensRecebidasNaoLidas; i++) {
      System.out.println(this.mensagensRecebidas[i] + " - Contato: " + this.nomeMensagemRecebidas[i]);
    }
    this.qntMensagensRecebidasNaoLidas = 0;
  }

  public void imprimirQntMensagensRecebidasNaoLidas() {
    System.out.println(
        "Quantidade de mensagens recebidas não lidas de " + this.nome + ": " + this.qntMensagensRecebidasNaoLidas);
  }

}
