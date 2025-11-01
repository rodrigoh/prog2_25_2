package aula13.exemploAcesso.controller;

import aula13.exemploAcesso.model.Pessoa;

public class Cadastra {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    //O atributo e-mail pode ser acessado por estar definido como public
    p1.mail = "jonas@terra.com.br";
    //nome não pode ser acessado pelo "mundo", já que está como protected
    //p1.nome = "Jonas";
    //sobrenome não pode ser acessado pelo "mundo", já que está como private
    //p1.sobrenome = "Silva";
    //idade não pode ser acessado pelo "mundo", já que está como sem modificador
    //p1.idade = 20;
  }
}
