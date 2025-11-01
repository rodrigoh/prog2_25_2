package aula13.exemploEncapsulamento;

public class Banco {
  public static void main(String[] args) {
    Conta c1 = new Conta("Jonas", "123456");
    System.out.println("nova conta criado com identificador: "+c1.getIdentificador());
    //Como agora o identificador é privado, ele não pode ser alterado diretamente
    //c1.identificador = "teste";
    c1.depositar(1000);
    System.out.println(c1.mostraDados());
    //Se permitir esse acesso ao saldo, estou permitindo um acesso indevido
    //c1.saldo = 0;
    System.out.println(c1.mostraDados());
    //Da mesma forma posso privar o método geraIdentificador
    //c1.geraIdentificador();
    System.out.println("nova conta criado com identificador: "+c1.getIdentificador());



  }
}
