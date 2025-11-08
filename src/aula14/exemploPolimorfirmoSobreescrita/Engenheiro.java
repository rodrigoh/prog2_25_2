package aula14.exemploPolimorfirmoSobreescrita;

public class Engenheiro extends Colaborador {
  private String crea;

  public Engenheiro(int matricula, String nome){
    super(matricula, nome);
  }
  public String getCrea(){
    return crea;
  }

  public void setCrea(String crea){
    this.crea = crea;
  }
}
