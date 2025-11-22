package aula15.tratamentoExcecoes;

public class Exemplo02 {
  public static void main(String[] args) {
    try{
      int resultado = Calculadora.divide(5,0);
      System.out.println(resultado);
    }
    catch (ArithmeticException e){
      System.out.println("Não é possível dividir por zero");
    }

    int resposta = Calculadora.divideDois(5,0);
    System.out.println(resposta);
  }
}
