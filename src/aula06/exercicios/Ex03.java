package aula06.exercicios;

import java.util.Random;

/**
 * Gere um vetor aleatoriamente com até 100 números. Depois conte quantos deles são pares,
 * mostre o vetor e a quantidade de números pares encontrados
 */
public class Ex03 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetor = new int[100];
    int contPar = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(1,200);
      if(vetor[i]%2==0)
        contPar++;
      System.out.print(vetor[i]+" ");
    }
    System.out.println("\nDos números acima são pares "+contPar);
  }
}
