
public class Endereco {
  String rua;
  String numero;
  String complemento;
  String bairro;
  String cidade;
  String uf;
  String cep;

  public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String uf, String cep) {
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.uf = uf;
    this.cep = cep;

  }

  public void imprimir() {
    System.out.println("Rua: " + this.rua);
    System.out.println("Número: " + this.numero);
    System.out.println("Complemento: " + this.complemento);
    System.out.println("Bairro: " + this.bairro);
    System.out.println("Cidade: " + this.cidade);
    System.out.println("UF: " + this.uf);
    System.out.println("CEP: " + this.cep + "\n");
  }

}