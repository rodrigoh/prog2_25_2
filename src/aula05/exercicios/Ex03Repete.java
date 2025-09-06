package aula05.exercicios;

import java.util.Scanner;

public class Ex03Repete {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual sua senha: ");
    String senha = ler.next();
    //! = not ou não lógico
    while(!senha.equals("01234567")){
      System.out.print("Senha errada, digite novamente: ");
      senha = ler.next();
    }
    System.out.println("Acesso autorizado");
  }
}
