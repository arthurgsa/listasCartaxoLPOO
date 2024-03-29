
public class Medico {
  int crm;
  String nome;
  String sexo;
  String especialidade;
  Endereco endereco;

  public Medico(int crm, String nome, String sexo, String especialidade, Endereco endereco) {
    this.crm = crm;
    this.nome = nome;
    this.sexo = sexo;
    this.especialidade = especialidade;
    this.endereco = endereco;
  }

  public void imprimir() {
    System.out.println("CRM: " + this.crm);
    System.out.println("Nome: " + this.nome);
    System.out.println("Sexo: " + this.sexo);
    System.out.println("Especialidade: " + this.especialidade);
    this.endereco.imprimir();
  }

}