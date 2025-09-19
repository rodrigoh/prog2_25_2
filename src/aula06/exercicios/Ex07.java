package aula06.exercicios;

import java.util.Scanner;

/**
 * Crie um programa para ler a nota da prova de 15 alunos e armazene num vetor,
 * calcule e imprima a média geral. Em seguida conte quantos alunos estão acima
 * 'da média calculada.
 */
public class Ex07 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float[] notas = new float[15];
    float somaNota = 0;
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Qual a nota do "+(i+1)+"° aluno: ");
      notas[i] = ler.nextFloat();
      while (notas[i]<0 || notas[i]>10){
        System.out.print("A nota precisa estar entre 1 e 10: ");
        notas[i] = ler.nextFloat();
      }
      somaNota+=notas[i];
    }
    float media = somaNota/notas.length;
    System.out.printf("A média da turma é %.2f",media);
    int cont = 0;
    for (int i = 0; i < notas.length; i++) {
      if(notas[i]>media)
        cont++;
    }
    System.out.println(" e estão acima dela "+cont+" alunos.");
  }
}
