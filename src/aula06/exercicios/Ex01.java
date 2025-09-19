package aula06.exercicios;

import java.util.Random;

/**
 *Criar um vetor A com 5 elementos, carregar ele com números aleatórios. Declarar um
 * vetor B. Copiar todos os elementos do Vetor A para o Vetor B em ordem inversa e
 * mostrar os dois na tela;
 */
public class Ex01 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    System.out.println("Dados no vetor A");
    for (int i = 0, j = 4; i < vetorA.length; i++, j--) {
      vetorA[i] = aleatorio.nextInt(1,20);
      System.out.print(vetorA[i]+" ");
      vetorB[j] = vetorA[i];
    }
    System.out.println("\nDados no vetor B");
    for(int i:vetorB){
      System.out.print(i+" ");
    }
  }
}
