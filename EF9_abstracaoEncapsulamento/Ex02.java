public class Ex02 {
  public static void main(String[] args) {
    System.out.println("");
    Post post1 = new Post("Eae minha rapaazeadaaaaaaaaaaaaa", "habbid.com.br");

    post1.curtir();
    post1.curtir();
    post1.curtir();

    System.out.println("Número de curtidas: " + post1.getNumeroCurtidas());

    post1.compartilhar();
    post1.compartilhar();

    System.out.println("Número de compartilhamentos: " + post1.getNumeroCompartilhamentos());
  }
}