package aula05.exercicios;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual sua senha: ");
    String senha = ler.next();
    if(senha.equals("01234567")){
      System.out.println("Acesso autorizado");
    }
    else{
      System.out.println("Acesso negado!");
    }
  }
}
