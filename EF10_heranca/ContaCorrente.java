public class ContaCorrente {
  private int numeroConta;
  private double saldo;

  public ContaCorrente(int numeroConta, double saldo) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void imprimir() {
    System.out.println("Número da conta: " + this.numeroConta);
    System.out.println("Saldo: " + this.saldo);
  }

  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    }
    System.out.println("Depósito realizado com sucesso!");
  }

  public void sacar(double valor) {
    if (valor > 0 && this.saldo >= valor) {
      this.saldo -= valor;
    }
    System.out.println("Saque realizado com sucesso!");
  }

}
