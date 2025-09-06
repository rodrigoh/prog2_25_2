package aula05.exemplos;

import java.util.Scanner;

public class Exemplo01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //tipo[] nome = new tipo[capacidade]
    //Sendo um vetor de capacidade 10 ele tem índices de 0 a 9
    int[] vetor = new int[10];
    //Declarar e inicializar um vetor
    char[] letras = {'a','b','d','e','j'};
    //Lendo informações para o vetor
    for (int i = 0; i < 10; i++) {
      System.out.print("vetor["+i+"]: ");
      vetor[i] = ler.nextInt();
    }
    System.out.println("Dados no vetor:");
    for (int i = 0; i < 10; i++) {
      System.out.print(vetor[i]+" ");
    }
    //Descobrindo o tamanho de um vetor
    System.out.println("\nO tamanho do vetor letra é "+letras.length);
    System.out.println("Dados no vetor letras");
    for (int i = 0; i < letras.length; i++) {
      System.out.print(letras[i]+" ");
    }
  }
}
