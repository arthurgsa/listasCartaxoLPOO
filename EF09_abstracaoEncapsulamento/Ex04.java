public class Ex04 {
  public static void main(String[] args) {
    System.out.println("");
    Produto produto1 = new Produto("Vasilha", 99.23, 10);

    System.out.println(produto1.getNome() + " - R$ " + produto1.getPreco() + "\n");
    System.out.println("COMPRANDO PRODUTOS:");
    produto1.setQtDisponivel(produto1.getQtDisponivel() + 1);
    System.out.println("Total de produtos: " + produto1.getQtDisponivel());
    produto1.setQtDisponivel(produto1.getQtDisponivel() + 1);
    System.out.println("Total de produtos: " + produto1.getQtDisponivel());
    produto1.setQtDisponivel(produto1.getQtDisponivel() + 9);
    System.out.println("Total de produtos: " + produto1.getQtDisponivel());

    // caso a intenção seja VENDER produtos:
    System.out.println("\nVENDENDO PRODUTOS:");
    produto1.setQtDisponivel(10);

    produto1.vender(1);
    System.out.println("Total de produtos: " + produto1.getQtDisponivel());
    produto1.vender(1);
    System.out.println("Total de produtos: " + produto1.getQtDisponivel());
    produto1.vender(9);
    System.out.println("Total de produtos: " + produto1.getQtDisponivel());

  }
}