public class Ex02 {
  public static void main(String[] args) {
    Endereco endereco1 = new Endereco("Rua 1", "123", "Apto 1", "Bairro 1", "Cidade 1", "UF1", "12345-678");

    Medico medico1 = new Medico(123, "Dr. João", "M", "Cardiologista", endereco1);

    endereco1.imprimir();
    medico1.imprimir();

    System.out.println("---------------------");

    endereco1 = new Endereco("Rua 2", "456", "Apto 2", "Bairro 2", "Cidade 2", "UF2", "67890-123");
    medico1 = new Medico(456, "Dr. José", "M", "Ortopedista", endereco1);

    endereco1.imprimir();
    medico1.imprimir();

  }
}
