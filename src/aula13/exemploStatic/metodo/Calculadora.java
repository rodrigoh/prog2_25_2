package aula13.exemploStatic.metodo;

public class Calculadora {
  static int soma(int n1, int n2){
    return n1+n2;
  }

  static int soma(int[] lista){
    int soma = 0;
    for(int i:lista)
      soma+=i;
    return soma;
  }
}
