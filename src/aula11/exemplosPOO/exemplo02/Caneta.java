package aula11.exemplosPOO.exemplo02;

public class Caneta {
  String fabricante;
  String cor;
  int quantidadeTinta = 100;

  boolean escrever(String texto){
    int tamanho = texto.length();
    if(quantidadeTinta>tamanho) {
      System.out.println(texto);
      quantidadeTinta-=tamanho;
      return true;
    }
    return false;
  }
}
