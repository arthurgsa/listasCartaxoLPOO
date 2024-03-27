public class Aluno {
  String nome;
  String cpf;
  double[] notas = new double[4];

  public Aluno(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public void imprimir() {
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Notas: ");
    for (int i = 0; i < this.notas.length; i++) {
      System.out.println(this.notas[i]);
    }
  }

  public double calcularMedia() {
    double soma = 0;
    for (int i = 0; i < this.notas.length; i++) {
      soma += this.notas[i];
    }

    return soma / this.notas.length;
  }
}
