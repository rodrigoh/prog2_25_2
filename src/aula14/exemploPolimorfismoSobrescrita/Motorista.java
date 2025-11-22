package aula14.exemploPolimorfismoSobrescrita;

public class Motorista extends Colaborador {
  private String cnh;

  public Motorista(int matricula, String nome, String cnh){
    super(matricula,nome);
    this.cnh = cnh;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }

  @Override
  public String obterDados(){
    String dados = "Nome: "+getNome();
    dados+="\nE-mail: "+getMail();
    dados+="\nMatrícula: "+getMatricula();
    dados+="\nCNH: "+cnh;
    return dados;
  }
}
