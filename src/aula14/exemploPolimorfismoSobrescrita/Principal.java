package aula14.exemploPolimorfismoSobrescrita;

public class Principal {
  public static void main(String[] args) {
    Motorista m1 = new Motorista(123, "Jonas","4564564554");
    m1.setMail("jonas@terra.com.br");
    System.out.println(m1.obterDados());


    System.out.println("\n\n\n");


    Colaborador c1 = new Colaborador(124, "Ana");
    c1.setMail("ana@gmail.com");
    System.out.println(c1.obterDados());


    System.out.println("\n\n\n");


    Medico med1 = new Medico(125, "Arthur");
    med1.setMail("drarthur@gmail.com");
    med1.setCrm("rs955865");
    System.out.println(med1.obterDados());

    //Testando o objeto Pessoa
    Pessoa p1 = new Pessoa();
    p1.setNome("Jonas");
    p1.setSobrenome("Silva");
    System.out.println("\n\n\n");
    System.out.println(p1);

  }
}
