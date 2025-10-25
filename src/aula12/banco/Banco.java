package aula12.banco;

public class Banco {
  public static void main(String[] args) {
    Conta c1 = new Conta("Jonas", "conta1598");
//    c1.identificador = "conta1598";
//    c1.titular = "Jonas";
    c1.depositar(1000);
    System.out.println(c1.saldo());
    System.out.println(c1.mostraDados());
  }
}
