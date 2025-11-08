package aula14.exemploPolimorfirmoSobreescrita;

public class Medico extends Colaborador {
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

  @Override
  public String obterDados(){
    String dados = "Nome: "+getNome();
    dados+="\nE-mail: "+getMail();
    dados+="\nMatrícula: "+getMatricula();
    dados+="\nCRM: "+crm;
    return dados;
  }
}
