public class ContaTesouroDireto extends ContaPoupanca {

  public ContaTesouroDireto(int numeroConta, double saldo) {
    super(numeroConta, saldo);
  }

  public void aplicarJurosMensal() {
    this.setSaldo(this.getSaldo() * 0.01 + this.getSaldo());
  }

  public void depositar(double valor) {
    if (valor >= 1000) {
      this.setSaldo(this.getSaldo() + valor);
      System.out.println("Depósito realizado com sucesso!");
    } else {
      System.out.println("Depósito mínimo de R$ 1000,00.");
    }

  }

}
