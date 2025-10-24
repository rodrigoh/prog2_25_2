package aula12.exemplosPOO.exemplo03;

import java.util.Scanner;

public class Cadastro {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Aluno a1 = new Aluno();
    System.out.print("Qual o nome do aluno: ");
    a1.nome = ler.next();
    System.out.print("Qual a matrícula do "+a1.nome+": ");
    a1.matricula = ler.next();
    System.out.print("Qual a primeira nota do "+a1.nome+": ");
    a1.notaUm = ler.nextFloat();
    System.out.print("Qual a segunda nota do "+a1.nome+": ");
    a1.notaDois = ler.nextFloat();
    System.out.print("Qual a terceira nota do "+a1.nome+": ");
    a1.notaTres = ler.nextFloat();
    //
    float media = a1.calculaMedia();
    System.out.printf("O aluno %s tem média %.2f\n",a1.nome, media);
    System.out.println(a1.obterInfomacoes());



  }
}
