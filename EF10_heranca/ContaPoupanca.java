public class ContaPoupanca extends ContaCorrente {

  public ContaPoupanca(int numeroConta, double saldo) {
    super(numeroConta, saldo);
  }

  public void aplicarJurosMensal() {
    this.setSaldo(this.getSaldo() * 0.005 + this.getSaldo());
    System.out.println("Juros aplicados com sucesso!");
  }

}
