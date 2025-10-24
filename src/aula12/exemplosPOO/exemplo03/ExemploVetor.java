package aula12.exemplosPOO.exemplo03;

import java.util.Scanner;

public class ExemploVetor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Aluno[] listaAlunos = new Aluno[10];
//    listaAlunos[0] = new Aluno();
//    listaAlunos[0].nome = "Jonas";
//    listaAlunos[0].matricula = "a123";
//    listaAlunos[0].notaUm = 8;
//    listaAlunos[0].notaDois = 9;
//    listaAlunos[0].notaTres = 6;
//    System.out.println(listaAlunos[0].obterInfomacoes());
    int contAluno = 0;
    char opc;
    do{
      System.out.println("Selecione uma opção");
      System.out.println("c - cadastrar um novo aluno");
      System.out.println("l - listar os alunos");
      System.out.println("o - obter informações de um aluno");
      System.out.println("p - pesquisar um aluno");
      System.out.println("s - sair");
      opc = ler.next().toLowerCase().charAt(0);
      switch (opc){
        case 'c'->{
          listaAlunos[contAluno] = new Aluno();
          System.out.print("Qual o nome do aluno: ");
          listaAlunos[contAluno].nome = ler.next();
          System.out.print("Qual a matrícula do aluno: ");
          listaAlunos[contAluno].matricula = ler.next();
          System.out.print("Qual a primeira nota: ");
          listaAlunos[contAluno].notaUm = ler.nextFloat();
          System.out.print("Qual a segunda nota: ");
          listaAlunos[contAluno].notaDois = ler.nextFloat();
          System.out.print("Qual a terceira nota: ");
          listaAlunos[contAluno].notaTres = ler.nextFloat();
          contAluno++;
        }
        case 'l'->{
          for (int i = 0; i < contAluno; i++) {
            System.out.println(listaAlunos[i].obterInfomacoes());
          }
        }
        case 'o'->{
          System.out.print("Qual a posição do aluno na lista: ");
          int posicao = ler.nextInt();
          if(posicao>=0 && posicao<contAluno){
            System.out.print(listaAlunos[posicao].obterInfomacoes());
          }
        }
        case 'p'->{
          System.out.print("Qual a matrícula devo pesquisar: ");
          String matricula = ler.next();
          //Realizando a busca
          int posicao = -1;
          for (int i = 0; i < contAluno; i++) {
            if(matricula.equals(listaAlunos[i].matricula)){
              posicao = i;
            }
          }
          //Mostrando o resultado
          if(posicao>=0){
            System.out.println(listaAlunos[posicao].obterInfomacoes());
          }
          else{
            System.out.println("Aluno com a matrícula "+matricula+" não encontrado");
          }
        }
      }
    }
    while (opc!='s');

  }
}
