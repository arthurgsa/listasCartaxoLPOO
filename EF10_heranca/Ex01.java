public class Ex01 {
  public static void main(String[] args) {
    ContaCorrente contaCorrente1 = new ContaCorrente(1, 1000);
    contaCorrente1.imprimir();
    contaCorrente1.depositar(100);
    contaCorrente1.imprimir();
    contaCorrente1.depositar(400);
    contaCorrente1.imprimir();
    contaCorrente1.sacar(200);
    contaCorrente1.imprimir();

    ContaPoupanca contaPoupanca1 = new ContaPoupanca(2, 5000);
    contaPoupanca1.imprimir();
    contaPoupanca1.aplicarJurosMensal();
    contaPoupanca1.imprimir();
  }
}
