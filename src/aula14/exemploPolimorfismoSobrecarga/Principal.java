package aula14.exemploPolimorfismoSobrecarga;


public class Principal {
  public static void main(String[] args) {
    Calculadora c1 = new Calculadora();
    //Chamada de métodos que possuem sobrecarga
    System.out.println(c1.soma(2,3));
    System.out.println(c1.soma(6,9,3));
    System.out.println(c1.soma("Jonas","Silva"));
    System.out.println(c1.soma(new int[] {3,5,8,7}));
  }
}
