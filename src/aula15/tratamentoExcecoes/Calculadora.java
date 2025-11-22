package aula15.tratamentoExcecoes;

public class Calculadora {

  public static int divide(int n1, int n2) throws ArithmeticException{
    return n1/n2;
  }

  public static int divideDois(int n1, int n2){
    if(n2==0){
      throw new IllegalArgumentException("O valor de n2 precisa ser um número");
    }
    return n1/n2;
  }
}
