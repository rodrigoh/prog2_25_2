package aula13.exemploStatic.atributo;

public class Principal {
  public static void main(String[] args) {
    Conta c1 = new Conta("Jonas","12345");
    Conta c2 = new Conta("Betina","12345");
    c1.nomeBanco = "Banco exemplo";
    //quando o atributo é estático ele é único para todas as instâncias, ou seja modificar o valor em uma delas
    // significa modificar em todas
    System.out.println("O nome banco da conta é "+c1.nomeBanco);
    System.out.println("O nome banco da conta é "+c2.nomeBanco);
    c2.nomeBanco = "Banco Real";
    System.out.println("O nome banco da conta é "+c1.nomeBanco);
    System.out.println("O nome banco da conta é "+c2.nomeBanco);

    //O atributo estático existe independente da criação de instâncias
    Conta.nomeBanco = "Banco teste";
    System.out.println("O nome banco da conta é "+c1.nomeBanco);
    System.out.println("O nome banco da conta é "+c2.nomeBanco);

  }
}
