package aula12.exemplosPOO.exemplo03;

public class Aluno {
  //Atributos ou características do objeto
  String nome;
  String matricula;
  float notaUm;
  float notaDois;
  float notaTres;

  //Ações do objeto
  float calculaMedia(){
    return (notaUm+notaDois+notaTres)/3;
  }

  String verificaStatus(){
    float media = calculaMedia();
    if(media>=8)
      return "aprovado";
    else if(media>=3)
      return "recuperação";
    else
      return "reprovado";
  }

//  String verificaStatus(){
//    float media = calculaMedia();
//    String status = "reprovado";
//    if(media>=8)
//      status = "aprovado";
//    else if(media>=3)
//      status = "recuperação";
//    return status;
//  }

  String obterInfomacoes(){
    String retorno = "Nome: "+nome;
    retorno+="\nMatrícula: "+matricula;
    retorno+="\nMédia: "+String.format("%.2f",calculaMedia());
    return retorno;
  }


}
