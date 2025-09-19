package aula07.exemplos;

import java.util.Scanner;

public class Exemplo01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[10];
    //tipo[][] nome = new int[quantLinhas][quantColunas]
    int[][] matriz = new int[3][4];
    //Iterando uma matriz para ler do teclado
    for (int linha = 0; linha < 3; linha++) {
      for (int coluna = 0; coluna < 4; coluna++) {
        System.out.print("Informe um valor para matriz["+linha+"]["+coluna+"]: ");
        matriz[linha][coluna] = ler.nextInt();
      }
    }
    //Impressão da matriz
    for(int l=0;l<3;l++){
      for(int c=0;c<4;c++){
        //%02d garante que todos os números sejam impressos com 2 dígitos, se não tiver ele completa com zeros
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
  }
}
