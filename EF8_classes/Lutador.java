public class Lutador {
  String nome;
  int energia;
  int forca;

  public Lutador(String nome, int energia, int forca) {
    this.nome = nome;
    this.energia = energia;
    this.forca = forca;
  }

  public void aplicarGolpe(Lutador l) {
    l.energia -= this.forca;
  }
}
