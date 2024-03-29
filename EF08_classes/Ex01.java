public class Ex01 {
  public static void main(String[] args) {
    Paciente paciente1 = new Paciente(1, "João", "01/01/2000", "M", "Unimed", "Nenhuma", "A+");

    // usando método imprimir() para imprimir os dados do objeto
    paciente1.imprimir();

    // modificando os dados do objeto
    paciente1.codigo = 2;
    paciente1.nome = "Maria";
    paciente1.dataNascimento = "01/01/1970";
    paciente1.sexo = "F";
    paciente1.planoSaude = "Unimed";
    paciente1.alergia = "Nenhuma";
    paciente1.tipoSanguineo = "A+";

    // imprima cada um dos dados do objeto
    paciente1.imprimir();

  }
}
