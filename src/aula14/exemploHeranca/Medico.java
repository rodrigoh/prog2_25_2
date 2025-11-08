package aula14.exemploHeranca;

public class Medico extends Colaborador{
  private String crm;

  public Medico(int matricula, String nome){
    super(matricula, nome);
  }
  public String getCrm(){
    return crm;
  }

  public void setCrm(String crm){
    this.crm = crm;
  }
}
