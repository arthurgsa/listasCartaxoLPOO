public class Ex02 {
  public static void main(String[] args) {

    /*
     * Crie um array de ContaPoupança de 10 posições
     * Instancie um objeto ContaTesouroDireto com seu número e saldo inicial de
     * 10000 reais e ponha esse objeto na primeira posição do array
     * Instancie um objeto ContaPoupanca com seu número e saldo inicial de 10000
     * reais e ponha esse objeto na segunda posição do array
     * Acesse a primeira posição do array e imprima na tela o saldo dessa conta
     * Acesse a segunda posição do array e imprima na tela o saldo dessa conta
     * Deposite o valor de 500 reais na conta da primeira posição do array
     * Acesse a primeira posição do array e imprima na tela o saldo dessa conta
     * Deposite o valor de 500 reais na conta da segunda posição do array
     * Acesse a segunda posição do array e imprima na tela o saldo dessa conta
     * Aplique os juros mensais na conta da primeira posição do array
     * Acesse a primeira posição do array e imprima na tela o saldo dessa conta
     * Aplique os juros mensais na conta da segunda posição do array
     * Acesse a segunda posição do array e imprima na tela o saldo dessa conta
     * 
     */

    ContaPoupanca[] contas = new ContaPoupanca[10];
    contas[0] = new ContaTesouroDireto(1, 10000);
    contas[1] = new ContaPoupanca(2, 10000);

    contas[0].imprimir();
    contas[1].imprimir();

    contas[0].depositar(500);
    contas[0].imprimir();

    contas[1].depositar(500);
    contas[1].imprimir();

    contas[0].aplicarJurosMensal();
    contas[0].imprimir();

    contas[1].aplicarJurosMensal();
    contas[1].imprimir();
  }
}