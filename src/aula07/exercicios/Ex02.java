package aula07.exercicios;

import java.util.Random;

/*
Carregar uma matriz SOMA 4x4, calcular e escrever as seguintes somas:
 da linha de índice 3
 da coluna de índice 2
de todos os elementos da matriz
 */
public class Ex02 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] soma = new int[4][4];
    int somaLinha = 0;
    int somaColuna = 0;
    //Populando a matriz...
    for (int l = 0; l < soma.length; l++) {
      for (int c = 0; c < soma[l].length; c++) {
        //Gerando valores para matriz
        soma[l][c] = aleatorio.nextInt(1,50);
        //somando os elementos da linha de índice 3
        if(l==3)
          somaLinha+=soma[l][c];
        //Somando os elementos da coluna de índice 2
        if(c==2)
          somaColuna+=soma[l][c];
        //Mostras a matriz
        System.out.printf("%02d ",soma[l][c]);
      }
      System.out.println();
    }
    System.out.println("A soma dos valores na linha 3 vale "+somaLinha);
    System.out.println("A soma dos valores na coluna 2 vale "+somaColuna);
  }
}
