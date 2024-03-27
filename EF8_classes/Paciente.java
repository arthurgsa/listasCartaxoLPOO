public class Paciente {
  int codigo;
  String nome;
  String dataNascimento;
  String sexo;
  String planoSaude;
  String alergia;
  String tipoSanguineo;

  public Paciente(int codigo, String nome, String dataNascimento, String sexo, String planoSaude, String alergia,
      String tipoSanguineo) {
    this.codigo = codigo;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.sexo = sexo;
    this.planoSaude = planoSaude;
    this.alergia = alergia;
    this.tipoSanguineo = tipoSanguineo;
  }

  public void imprimir() {
    System.out.println("\n" + "Código: " + this.codigo);
    System.out.println("Nome: " + this.nome);
    System.out.println("Data de Nascimento: " + this.dataNascimento);
    System.out.println("Sexo: " + this.sexo);
    System.out.println("Plano de Saúde: " + this.planoSaude);
    System.out.println("Alergia: " + this.alergia);
    System.out.println("Tipo Sanguíneo: " + this.tipoSanguineo + "\n");
  }
}
