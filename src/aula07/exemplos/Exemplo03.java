package aula07.exemplos;

import java.util.Random;

public class Exemplo03 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,50);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    //Separando a diagonal da matriz?
    System.out.println("\nElementos na diagonal da matriz");
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l==c){
          System.out.print(matriz[l][c]+" ");
        }
      }
    }
    System.out.println("\nElementos na diagonal da matriz usando apenas um for");
    for (int i = 0; i < 5; i++) {
      System.out.print(matriz[i][i]+" ");
    }
    //Achando os elementos da diagonal secundária
    System.out.println("\nAchando os elementos da diagonal secundária");
    //Onde a soma dos índices é igual ao tamanho da matriz -1
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l+c== matriz.length-1){
          System.out.print(matriz[l][c]+" ");
        }
      }
    }
  }
}
