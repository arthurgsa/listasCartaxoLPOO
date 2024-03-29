public class Aviao {
  private double altitude;
  private double velocidade;

  public Aviao(double altitude, double velocidade) {
    this.altitude = altitude;
    this.velocidade = velocidade;
  }

  public void imprimir() {
    System.out.println("Altitude: " + this.altitude + " km");
    System.out.println("Velocidade: " + this.velocidade + " km/h");
  }

  public double getAltitude() {
    return altitude;
  }

  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }

  public double getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
  }

}
