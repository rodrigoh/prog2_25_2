package aula13.exemploEncapsulamento;

public class Principal {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    //Definindo valores para os atributos de Pessoa
    p1.setNome("Jonas");
    p1.setSobrenome("Silva");
    p1.setMail("jonas@terra.com.br");
    p1.setAltura(175);

    //Ler os atributos de Pessoa
    System.out.println("Nome: "+p1.getNome()+" "+p1.getSobrenome());
    System.out.println("E-mail: "+p1.getMail());
    System.out.println("Altura: "+p1.getAltura()+" cm");

  }
}
