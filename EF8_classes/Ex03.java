public class Ex03 {
  public static void main(String[] args) {
    Lutador ryu = new Lutador("Ryu", 100, 10);
    Lutador bison = new Lutador("Bison", 100, 12);

    ryu.aplicarGolpe(bison);
    ryu.aplicarGolpe(bison);
    ryu.aplicarGolpe(bison);

    System.out.println(bison.energia);

    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);
    bison.aplicarGolpe(ryu);

    System.out.println(ryu.energia);
  }
}
