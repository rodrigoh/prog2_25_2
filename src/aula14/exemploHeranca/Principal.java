package aula14.exemploHeranca;

public class Principal {
  public static void main(String[] args) {
    Motorista m1 = new Motorista(123, "Jonas","4564564554");
//    m1.setNome("Jonas");
    m1.setMail("jonas@terra.com.br");
//    m1.setMatricula(123);
    System.out.println(m1.obterDados());
//    m1.setCnh("4564564554");

    Colaborador c1 = new Colaborador(124, "Ana");
//    c1.setNome("Ana");
    c1.setMail("ana@gmail.com");
//    c1.setMatricula(124);
    System.out.println(c1.obterDados());

    Medico med1 = new Medico(125, "Arthur");
//    med1.setNome("Arthur");
    med1.setMail("drarthur@gmail.com");
    med1.setCrm("rs955865");
    System.out.println(med1.obterDados());

  }
}
