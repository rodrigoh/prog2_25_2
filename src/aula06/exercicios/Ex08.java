package aula06.exercicios;

import java.util.Random;

/**
 * Declare três vetores com até 100 números, o primeiro deve receber números aleatórios,
 * o segundo deve receber os números pares do primeiro vetor e o terceiro os números
 * ímpares do primeiro vetor. Ao final mostrar os três vetores
 */
public class Ex08 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetor = new int[100];
    int[] pares = new int[100];
    int[] impares = new int[100];
    int ci = 0;
    int cp = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(1,200);
      if(vetor[i]%2==0)
        pares[cp++] = vetor[i];
      else
        impares[ci++] = vetor[i];
      System.out.print(vetor[i]+" ");
    }
    System.out.println("\nDos números acima são pares:");
    for (int i = 0; i < cp; i++) {
      System.out.print(pares[i]+" ");
    }
    System.out.println("\nDos números no vetor são impares:");
    for (int i = 0; i < ci; i++) {
      System.out.print(impares[i]+" ");
    }
  }
}
