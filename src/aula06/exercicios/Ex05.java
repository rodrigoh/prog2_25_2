package aula06.exercicios;

import java.util.Random;

/**
 * Declare um vetor, gere números aleatórios para ele, em seguida realize a soma de
 * todos os elementos do vetor, mostre o vetor e a soma
 */
public class Ex05 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetor = new int[10];
    int soma = 0;
    System.out.println("Dados no vetor");
    for (int i=0;i<vetor.length;i++){
      vetor[i] = aleatorio.nextInt(20,100);
      soma+=vetor[i];
      //soma = soma + vetor[i];
      System.out.print(vetor[i]+" ");
    }
    System.out.println("\nA soma dos elementos do vetor vale "+soma);

  }
}
