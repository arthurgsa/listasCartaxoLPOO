public class Ex05 {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("João", "123456789");

    aluno1.notas[0] = 10;
    aluno1.notas[1] = 10;
    aluno1.notas[2] = 10;
    aluno1.notas[3] = 10;

    double mediaAluno1 = aluno1.calcularMedia();

    System.out.println(mediaAluno1);

    aluno1.notas[1] = 5;

    mediaAluno1 = aluno1.calcularMedia();

    System.out.println(mediaAluno1);

  }
}