package aula11.exercicios;

import java.util.Scanner;

public class AchaMenor {
  public static int achaMenor(int a, int b, int c){
    if(a<b && a<c)
      return a;
    else if(b<a && b<c)
      return b;
    else
      return c;
  }

//  public static int achaMenor(int a, int b, int c){
//    int menor;
//    if(a<b && a<c)
//      menor =  a;
//    else if(b<a && b<c)
//      menor = b;
//    else
//      menor = c;
//    return menor;
//  }

  public static int leNumero(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextInt();
  }

  public static void main(String[] args) {
    int v1 = leNumero("Digite um valor para v1");
    int v2 = leNumero("Digite um valor para v2");
    int v3 = leNumero("Digite um valor para v3");
    int menor = achaMenor(v1,v2,v3);
    System.out.println("O menor número digitado foi "+menor);

  }
}
