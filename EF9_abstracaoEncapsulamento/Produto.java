public class Produto {
  private String nome;
  private double preco;
  private int qtDisponivel;

  public Produto(String nome, double preco, int qtDisponivel) {
    this.nome = nome;
    this.preco = preco;
    this.qtDisponivel = qtDisponivel;
  }

  public void imprimir() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Preço: " + this.preco);
    System.out.println("Quantidade Disponível: " + this.qtDisponivel);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQtDisponivel() {
    return qtDisponivel;
  }

  public void setQtDisponivel(int qtDisponivel) {
    this.qtDisponivel = qtDisponivel;
  }

  public void vender(int qtVendida) {
    if (qtVendida > this.qtDisponivel) {
      System.out.println("Quantidade indisponível");
    } else {
      this.qtDisponivel -= qtVendida;
    }
  }

}
