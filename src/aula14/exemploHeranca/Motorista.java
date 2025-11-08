package aula14.exemploHeranca;

public class Motorista extends Colaborador{
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
}
