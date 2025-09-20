package aula07.exercicios;

import java.util.Scanner;

/*
Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos cada, contendo respectivamente as
somas das linhas e das colunas de G. Escrever os vetores criados.
 */
public class Ex03 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[][] matrizG = new int[3][3];
    int[] sl = {0,0,0};
    int[] sc = {0,0,0};
    //Lendo valores para matriz
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        System.out.printf("matriz[%d][%d]: ",l,c);
        matrizG[l][c] = ler.nextInt();
      }
    }
    //Realizar as somas
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("%02d ",matrizG[i][j]);
        //Aqui j representa a coluna (olhando a matriz na horizontal)
        sl[i]+=matrizG[i][j];
        //Agora j representa a linha que está sendo incrementada (olhando a matriz na vertical)
        sc[i]+=matrizG[j][i];
      }
      System.out.println();
    }
    //mostrando os vetores na tela
    System.out.println("Dados no vetor SL:");
    for(int i:sl){
      System.out.print(i+" ");
    }
    System.out.println("\nDados no vetor SC:");
    for(int i:sc){
      System.out.print(i+" ");
    }
  }
}
