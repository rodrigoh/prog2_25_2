package aula05.exemplos;

import java.util.Random;

public class Exemplo04 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetor = new int[10];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(10,30);
    }

    for(int i : vetor){
      System.out.print(i+" ");
    }
  }
}
