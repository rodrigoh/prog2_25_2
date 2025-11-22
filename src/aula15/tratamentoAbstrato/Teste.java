package aula15.tratamentoAbstrato;

public class Teste {
  public static void main(String[] args) {
    Retangulo r1 = new Retangulo();
    r1.setBase(6);
    r1.setAltura(3);
    System.out.println("A figura de nome "+r1.getNomeFigura());
    System.out.println("Tem área "+r1.calculaArea()+" cm²");
    System.out.println("Tem perímetro "+r1.calculaPerimetro()+"cm");
  }
}
