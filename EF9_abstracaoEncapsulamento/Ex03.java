public class Ex03 {
  public static void main(String[] args) {
    System.out.println("");
    Aviao aviao1 = new Aviao(10, 900);

    aviao1.imprimir();

    aviao1.setAltitude(aviao1.getAltitude() - 1);
    aviao1.setVelocidade(aviao1.getVelocidade() - 100);

    aviao1.imprimir();

    aviao1.setAltitude(aviao1.getAltitude() - 10);
    aviao1.setVelocidade(aviao1.getVelocidade() - 200);

    aviao1.imprimir();
  }
}