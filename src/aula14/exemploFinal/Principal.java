package aula14.exemploFinal;

public class Principal {
  public static void main(String[] args) {
    Calculadora c1 = new Calculadora();
    System.out.println("O valor de valor é "+c1.valor);
    //Não podemos alterar o valor de uma variável definida como final
    //c1.valor = 10;

    System.out.println("Criei uma constante o valor dela é "+Calculadora.PI);
  }
}
