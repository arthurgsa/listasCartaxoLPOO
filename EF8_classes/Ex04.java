public class Ex04 {
  public static void main(String[] args) {
    Post post1 = new Post("Eae minha rapaazeadaaaaaaaaaaaaa", "habbid.com.br");

    post1.curtir();
    post1.curtir();
    post1.curtir();

    System.out.println(post1.numeroCurtidas);

    post1.compartilhar();
    post1.compartilhar();

    System.out.println(post1.numeroCompartilhamentos);
  }
}