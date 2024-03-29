public class Ex01 {
  public static void main(String[] args) {
    Paciente paciente1 = new Paciente(1, "João", "01/01/2000", "M", "Unimed", "Nenhuma", "A+");

    // usando método imprimir() para imprimir os dados do objeto
    paciente1.imprimir();

    // modificando os dados do objeto
    paciente1.setCodigo(2);
    paciente1.setNome("Maria");
    paciente1.setDataNascimento("02/02/2002");
    paciente1.setSexo("F");
    paciente1.setPlanoSaude("SulAmérica");
    paciente1.setAlergia("Nenhuma");
    paciente1.setTipoSanguineo("B-");

    // imprima cada um dos dados do objeto
    paciente1.imprimir();

  }
}
