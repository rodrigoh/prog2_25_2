package aula13.exemploEncapsulamento;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private String mail;
  private int altura;

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getSobrenome(){
    return sobrenome;
  }

  public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
  }

  public String getMail(){
    return mail;
  }

  public void setMail(String mail){
    this.mail = mail;
  }

  public int getAltura(){
    return altura;
  }

  public void setAltura(int altura){
    this.altura = altura;
  }
}
