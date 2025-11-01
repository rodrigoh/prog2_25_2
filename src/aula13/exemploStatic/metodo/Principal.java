package aula13.exemploStatic.metodo;

public class Principal {
  public static void main(String[] args) {
    //Métodos declarados como estáticos existem e podem ser chamados independente da criação de instância.
    int soma = Calculadora.soma(6,8);
    System.out.println("A soma de 6 e 7 vale: "+soma);
    int[] vetor = {1,5,8,12};
    soma = Calculadora.soma(vetor);
    System.out.println("A soma dos elementos do vetor vale: "+soma);
//    String.format();
//    Integer.parseInt();
//    Math.pow();
//    Math.sqrt();
  }
}
