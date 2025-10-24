package aula11.exemplosPOO.exemplo04;

import java.util.Scanner;

public class Cadastro {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o nome do aluno: ");
    String nome = ler.next();
    System.out.print("Qual a primeira nota do "+nome+": ");
    float n1 = ler.nextFloat();
    System.out.print("Qual a segunda nota do "+nome+": ");
    float n2 = ler.nextFloat();
    System.out.print("Qual a terceira nota do "+nome+": ");
    float n3 = ler.nextFloat();
    //Criar uma instância do aluno
    Aluno alunoUm = new Aluno(nome);
    alunoUm.notaUm = n1;
    alunoUm.notaDois = n2;
    alunoUm.notaTres = n3;
    //alunoUm.nome = nome;
    System.out.println("O aluno "+alunoUm.nome+" tem média "+
            alunoUm.calculaMedia()+" e está "+alunoUm.retornaStatus());
  }
}
