package aula13.exemploAcesso.model;

public class Cadastra {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    //O atributo e-mail pode ser acessado por estar definido como public
    p1.mail = "jonas@terra.com.br";
    //Nome (protected) pode ser acessado por classes que estejam no mesmo pacote
    p1.nome = "Jonas";
    //sobrenome (private) não pode ser acessado pelo "pacote"
    //p1.sobrenome = "Silva";
    //idade (sem modificador) pode ser acessada a por classes que estejam no mesmo pacote da Pessoa
    p1.idade = 20;
  }
}
