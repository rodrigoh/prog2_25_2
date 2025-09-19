package aula06.exercicios;

import java.util.Scanner;

/**
 * Faça um programa que receba do usuário um vetor com 10 posições. Em seguida,
 * deverá ser impresso o maior é o menor elemento do vetor.
 */
public class Ex04 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[10];
    int maior=0;
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "]: ");
      vetor[i] = ler.nextInt();
      if (i == 0)
        maior = vetor[i];
      else if (vetor[i] > maior)
        maior = vetor[i];
    }
    System.out.println("Dos valores digitados o maior é "+maior);
  }
}
