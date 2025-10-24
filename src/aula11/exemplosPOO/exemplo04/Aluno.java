package aula11.exemplosPOO.exemplo04;

public class Aluno {
  //Atributos do aluno
  String nome;
  float notaUm;
  float notaDois;
  float notaTres;

  //Métodos da classe Aluno

  Aluno(){}

  Aluno(String nome){
    this.nome = nome;
  }


  float calculaMedia(){
    float media = (notaUm+notaDois+notaTres)/3;
    return media;
  }

  String retornaStatus(){
    String status;
    float media = calculaMedia();
    if(media>=8)
      status = "aprovado";
    else if(media>=3)
      status = "recuperação";
    else
      status = "reprovado";
    return status;
  }
}
