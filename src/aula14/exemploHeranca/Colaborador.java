package aula14.exemploHeranca;

public class Colaborador {
  //Atributos de acesso privado
  private String nome;
  private String mail;
  private int matricula;

  public Colaborador(int matricula, String nome){
    this.matricula = matricula;
    this.nome = nome;
  }

  //Criando os getters e setters para nossos atributos
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getMail(){
    return mail;
  }

  public void setMail(String mail){
    this.mail = mail;
  }

  public int getMatricula(){
    return matricula;
  }

  public void setMatricula(int matricula){
    this.matricula = matricula;
  }


  //Método qualquer para nosso objeto
  public String obterDados(){
    String dados = "Nome: "+nome;
    dados+="\nE-mail: "+mail;
    dados+="\nMatrícula: "+matricula;
    return dados;
  }
}
