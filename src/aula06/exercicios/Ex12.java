package aula06.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Declare um vetor de 10 elementos, gere números aleatórios para ele.
 * Em seguida mostre o vetor na tela e pergunte ao usuário qual número ele
 * pretende remover do vetor. Em seguida, remova esse número do vetor e mostre
 * ele novamente na tela.
 */
public class Ex12 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[10];
    System.out.println("Dados no vetor:");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(1,50);
      System.out.print(vetor[i]+" ");
    }
    System.out.print("\nQual dos números acima devo remover: ");
    int remove = ler.nextInt();
    int p = -1;
    //Busca no vetor
    for (int i = 0; i < vetor.length && p==-1; i++) {
      if(vetor[i]==remove)
        p = i;
    }
    if(p>=0){
      //Removendo o valor do vetor
      for (int i = p; i < vetor.length-1; i++) {
        vetor[i] = vetor[i+1];
      }
      for (int i = 0; i < vetor.length-1; i++) {
        System.out.print(vetor[i]+" ");
      }
    }
    else{
      System.out.println(remove+" não está no vetor!");
    }
  }
}
