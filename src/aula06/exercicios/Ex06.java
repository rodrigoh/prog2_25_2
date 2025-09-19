package aula06.exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia 10 números inteiros e os armazene em um vetor.
 * Imprima o vetor, o maior elemento e a posição que ele se encontra.
 */
public class Ex06 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[10];
    // 1 3 2 4
    // 0 1 2 3
    int posicao = 0;
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor["+i+"]: ");
      vetor[i] = ler.nextInt();
      if(vetor[i]>vetor[posicao]){
        posicao = i;
      }
    }
    System.out.println("O maior número digitado é "+vetor[posicao]+" e está na posição "+posicao+" do vetor");
  }
}
